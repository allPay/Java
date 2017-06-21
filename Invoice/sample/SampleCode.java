package sample;

import allpay.invoice.integration.AllInOne;
import allpay.invoice.integration.domain.IssueObj;

/**
 * 此為參考用的範例程式碼，並不完整，請勿直接套用在您的商業環境，以免出錯
 * @author mark.chiu
 *
 */
public class SampleCode {
	private AllInOne all;
	
	public void initial(){
		//此步驟為透過AllInOne建構子來實體化此類別，順便輸入log4j.properties的位置路徑
		//若不需要產生log檔，可直接在log4j.properties更改設定，或是不傳入任何參數
		// all = new AllInOne();
		all = new AllInOne("XXX/000");
	}
	
	public String sampleIssue(){
		initial();
		// 實體化出所需要的domain物件
		IssueObj issue = new IssueObj();
		// 商家後台自行產生不重複的流水號，或是UUID隨機產生不重複的廠商交易編號(記得把'-'濾掉，僅接受英文字與數字)
		issue.setRelateNumber("XXX");
		// 可以從前端使用者填入資料，或是後端DB撈出買家資訊
		issue.setCustomerName("XXX");
		// 從後端依據商品編號撈出商品資訊，請勿從前端撈取資料
		issue.setItemName("XXX");
		// 呼叫AllInOne中相對應的method，並切收回傳值
		String response = all.issue(issue);
		return response;
	}
}
