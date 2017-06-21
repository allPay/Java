package allpay.invoice.integration.domain;

/**
 * 發送發票通知物件
 * @author mark.chiu
 *
 */
public class InvoiceNotifyObj {
	
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
	
	/**
	 * Phone
	 * 發送簡訊號碼
	 */
	private String Phone = "";
	
	/**
	 * NotifyMail
	 * 發送電子郵件
	 */
	private String NotifyMail = "";
	
	/**
	 * Notify
	 * 發送方式 S：簡訊 E：電子郵件 A：皆通知時
	 */
	private String Notify = "";
	
	/**
	 * InvoiceTag
	 * 發送內容類型 I：發票開立 II：發票作廢 A：折讓開立 AI：折讓作廢 AW：發票中獎
	 */
	private String InvoiceTag = "";
	
	/**
	 * Notified
	 * 發送對象 C：發送通知給客戶 M：發送通知給商家 A：皆發送通知
	 */
	private String Notified = "";
	
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
	/**
	 * 取得Phone 發送簡訊號碼
	 * @return Phone
	 */
	public String getPhone() {
		return Phone;
	}
	/**
	 * 設定Phone 發送簡訊號碼
	 * @param phone
	 */
	public void setPhone(String phone) {
		Phone = phone;
	}
	/**
	 * 取得NotifyMail 發送電子郵件
	 * @return NotifyMail
	 */
	public String getNotifyMail() {
		return NotifyMail;
	}
	/**
	 * 設定NotifyMail 發送電子郵件
	 * @param notifyMail
	 */
	public void setNotifyMail(String notifyMail) {
		NotifyMail = notifyMail;
	}
	/**
	 * 取得Notify 發送方式 S：簡訊 E：電子郵件 A：皆通知時
	 * @return Notify
	 */
	public String getNotify() {
		return Notify;
	}
	/**
	 * 設定Notify 發送方式 S：簡訊 E：電子郵件 A：皆通知時
	 * @param notify
	 */
	public void setNotify(String notify) {
		Notify = notify;
	}
	/**
	 * 取得InvoiceTag 發送內容類型 I：發票開立 II：發票作廢 A：折讓開立 AI：折讓作廢 AW：發票中獎
	 * @return InvoiceTag
	 */
	public String getInvoiceTag() {
		return InvoiceTag;
	}
	/**
	 * 設定InvoiceTag 發送內容類型 I：發票開立 II：發票作廢 A：折讓開立 AI：折讓作廢 AW：發票中獎
	 * @param invoiceTag
	 */
	public void setInvoiceTag(String invoiceTag) {
		InvoiceTag = invoiceTag;
	}
	/**
	 * 取得Notified 發送對象 C：發送通知給客戶 M：發送通知給商家 A：皆發送通知
	 * @return Notified
	 */
	public String getNotified() {
		return Notified;
	}
	/**
	 * 設定Notified 發送對象 C：發送通知給客戶 M：發送通知給商家 A：皆發送通知
	 * @param notified
	 */
	public void setNotified(String notified) {
		Notified = notified;
	}
	@Override
	public String toString() {
		return "InvoiceNotifyObj [TimeStamp=" + TimeStamp + ", MerchantID=" + MerchantID + ", InvoiceNo=" + InvoiceNo
				+ ", AllowanceNo=" + AllowanceNo + ", Phone=" + Phone + ", NotifyMail=" + NotifyMail + ", Notify="
				+ Notify + ", InvoiceTag=" + InvoiceTag + ", Notified=" + Notified + "]";
	}
}
