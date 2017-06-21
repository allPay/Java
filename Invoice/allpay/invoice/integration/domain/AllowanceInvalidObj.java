package allpay.invoice.integration.domain;

/**
 * 作廢折讓物件
 * @author mark.chiu
 *
 */
public class AllowanceInvalidObj {
	
	/**
	 * TimeStamp
	 * 時間戳記
	 */
	private String TimeStamp = "";
	
	/**
	 * MerchantId
	 * 商家編號
	 */
	private String MerchantID = "";
	
	/**
	 * InvoiceNo
	 * 發票號碼，長度固定為10碼
	 */
	private String InvoiceNo = "";
	
	/**
	 * AllowanceNo
	 * 折讓號號，長度固定為16碼
	 */
	private String AllowanceNo = "";
	
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
	 * @return MerchantId
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
	 * 取得InvoiceNo 發票號碼，長度固定為10碼
	 * @return InvoiceNo
	 */
	public String getInvoiceNo() {
		return InvoiceNo;
	}
	/**
	 * 設定InvoiceNo 發票號碼，長度固定為10碼
	 * @param invoiceNo
	 */
	public void setInvoiceNo(String invoiceNo) {
		InvoiceNo = invoiceNo;
	}
	/**
	 * 取得AllowanceNo 折讓號號，長度固定為16碼
	 * @return AllowanceNo
	 */
	public String getAllowanceNo() {
		return AllowanceNo;
	}
	/**
	 * 設定AllowanceNo 折讓號號，長度固定為16碼
	 * @param allowanceNo
	 */
	public void setAllowanceNo(String allowanceNo) {
		AllowanceNo = allowanceNo;
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
		return "AllowanceInvalidObj [TimeStamp=" + TimeStamp + ", MerchantId=" + MerchantID + ", InvoiceNo=" + InvoiceNo
				+ ", AllowanceNo=" + AllowanceNo + ", Reason=" + Reason + "]";
	}
}
