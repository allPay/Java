package allpay.invoice.integration.domain;

/**
 * 查詢折讓明細物件
 * @author mark.chiu
 *
 */
public class QueryAllowanceObj {
	
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
	 * InvoiceNo
	 * 發票號碼，長度固定為10 碼
	 */
	private String InvoiceNo = "";
	
	/**
	 * AllowanceNo
	 * 折讓編號，長度固定為16 碼
	 */
	private String AllowanceNo = "";
	
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
	 * 取得InvoiceNo 發票號碼，長度固定為10 碼
	 * @return InvoiceNo
	 */
	public String getInvoiceNo() {
		return InvoiceNo;
	}
	/**
	 * 設定InvoiceNo 發票號碼，長度固定為10 碼
	 * @param invoiceNo
	 */
	public void setInvoiceNo(String invoiceNo) {
		InvoiceNo = invoiceNo;
	}
	/**
	 * 取得AllowanceNo 折讓編號，長度固定為16 碼
	 * @return AllowanceNo
	 */
	public String getAllowanceNo() {
		return AllowanceNo;
	}
	/**
	 * 設定AllowanceNo 折讓編號，長度固定為16 碼
	 * @param allowanceNo
	 */
	public void setAllowanceNo(String allowanceNo) {
		AllowanceNo = allowanceNo;
	}
	@Override
	public String toString() {
		return "QueryAllowanceObj [TimeStamp=" + TimeStamp + ", MerchantID=" + MerchantID + ", InvoiceNo=" + InvoiceNo
				+ ", AllowanceNo=" + AllowanceNo + "]";
	}
}
