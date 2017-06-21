package allpay.invoice.integration.domain;

/**
 * 查詢作廢發票明細物件
 * @author mark.chiu
 *
 */
public class QueryIssueInvalidObj {
	
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
	 * RelateNumber
	 * 商家自訂編號，長度固定為30 碼
	 */
	private String RelateNumber = "";
	
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
	 * 取得RelateNumber 商家自訂編號，長度固定為30 碼
	 * @return RelateNumber
	 */
	public String getRelateNumber() {
		return RelateNumber;
	}
	/**
	 * 設定RelateNumber 商家自訂編號，長度固定為30 碼
	 * @param relateNumber
	 */
	public void setRelateNumber(String relateNumber) {
		RelateNumber = relateNumber;
	}
	@Override
	public String toString() {
		return "QueryIssueInvalidObj [TimeStamp=" + TimeStamp + ", MerchantID=" + MerchantID + ", RelateNumber="
				+ RelateNumber + "]";
	}
}
