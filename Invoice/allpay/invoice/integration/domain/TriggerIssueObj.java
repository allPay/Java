package allpay.invoice.integration.domain;

/**
 * 觸發開立發票物件
 * @author mark.chiu
 *
 */
public class TriggerIssueObj {
	
	/**
	 * TimeStamp
	 * 時間戳記
	 */
	private String TimeStamp = "";
	
	/**
	 * MerchantID
	 * 商家編號
	 */
	private String MerchantID = "";
	
	/**
	 * Tsr
	 * 交易單號
	 */
	private String Tsr = "";
	
	/**
	 * PayType
	 * 交易類別
	 */
	private String PayType = "3";
	
	/********************* getters and setters *********************/
	
	/**
	 * 取得TimeStamp 時間戳記
	 * @return TimeStamp
	 */
	public String getTimeStamp() {
		return TimeStamp;
	}
	/**
	 * 設定TimeStamp 時間戳記
	 * @param timeStamp
	 */
	public void setTimeStamp(String timeStamp) {
		TimeStamp = timeStamp;
	}
	/**
	 * 取得MerchantID 商家編號
	 * @return MerchantID
	 */
	public String getMerchantID() {
		return MerchantID;
	}
	/**
	 * 設定MerchantID 商家編號
	 * @param merchantID
	 */
	public void setMerchantID(String merchantID) {
		MerchantID = merchantID;
	}
	/**
	 * 取得Tsr 交易單號
	 * @return Tsr
	 */
	public String getTsr() {
		return Tsr;
	}
	/**
	 * 設定Tsr 交易單號
	 * @param tsr
	 */
	public void setTsr(String tsr) {
		Tsr = tsr;
	}
	/**
	 * 取得PayType 交易類別
	 * @return PayType
	 */
	public String getPayType() {
		return PayType;
	}
//	public void setPayType(String payType) {
//		PayType = payType;
//	}
	@Override
	public String toString() {
		return "TriggerIssueObj [TimeStamp=" + TimeStamp + ", MerchantID=" + MerchantID + ", Tsr=" + Tsr + ", PayType="
				+ PayType + "]";
	}
}
