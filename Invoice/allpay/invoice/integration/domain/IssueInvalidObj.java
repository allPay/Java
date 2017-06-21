package allpay.invoice.integration.domain;

/**
 * 作廢發票物件
 * @author mark.chiu
 *
 */
/**
 * @author mark.chiu
 *
 */
public class IssueInvalidObj {
	
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
	 * InvoiceNumber
	 * 發票號碼，長度固定為10碼
	 */
	private String InvoiceNumber = "";
	
	/**
	 * Reason
	 * 作廢原因
	 */
	private String Reason = "";
	
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
	 * 取得InvoiceNumber 發票號碼，長度固定為10碼
	 * @return InvoiceNumber
	 */
	public String getInvoiceNumber() {
		return InvoiceNumber;
	}
	/**
	 * 設定InvoiceNumber 發票號碼，長度固定為10碼
	 * @param invoiceNumber
	 */
	public void setInvoiceNumber(String invoiceNumber) {
		InvoiceNumber = invoiceNumber;
	}
	/**
	 * 取得Reason 作廢原因
	 * @return Reason
	 */
	public String getReason() {
		return Reason;
	}
	/**
	 * 設定Reason 作廢原因
	 * @param reason
	 */
	public void setReason(String reason) {
		Reason = reason;
	}
	@Override
	public String toString() {
		return "IssueInvalidObj [TimeStamp=" + TimeStamp + ", MerchantID=" + MerchantID + ", InvoiceNumber="
				+ InvoiceNumber + ", Reason=" + Reason + "]";
	}
}
