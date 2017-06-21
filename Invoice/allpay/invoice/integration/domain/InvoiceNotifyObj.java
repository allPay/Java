package allpay.invoice.integration.domain;

/**
 * �o�e�o���q������
 * @author mark.chiu
 *
 */
public class InvoiceNotifyObj {
	
	/**
	 * TimeStamp
	 * �ɶ��W�O
	 */
	private String TimeStamp = "";
	
	/**
	 * MerchantID
	 * �Ӯa�s��
	 */
	private String MerchantID = "";
	
	/**
	 * InvoiceNo
	 * �o�����X�A���שT�w��10 �X
	 */
	private String InvoiceNo = "";
	
	/**
	 * AllowanceNo
	 * �����s���A���שT�w��16 �X
	 */
	private String AllowanceNo = "";
	
	/**
	 * Phone
	 * �o�e²�T���X
	 */
	private String Phone = "";
	
	/**
	 * NotifyMail
	 * �o�e�q�l�l��
	 */
	private String NotifyMail = "";
	
	/**
	 * Notify
	 * �o�e�覡 S�G²�T E�G�q�l�l�� A�G�ҳq����
	 */
	private String Notify = "";
	
	/**
	 * InvoiceTag
	 * �o�e���e���� I�G�o���}�� II�G�o���@�o A�G�����}�� AI�G�����@�o AW�G�o������
	 */
	private String InvoiceTag = "";
	
	/**
	 * Notified
	 * �o�e��H C�G�o�e�q�����Ȥ� M�G�o�e�q�����Ӯa A�G�ҵo�e�q��
	 */
	private String Notified = "";
	
	/********************* getters and setters *********************/
	
	/**
	 * ���oTimeStamp �ɶ��W�O
	 * @return TimeStamp
	 */
	public String getTimeStamp() {
		return TimeStamp;
	}
	/**
	 * �]�wTimeStamp �ɶ��W�O
	 * @param timeStamp
	 */
	public void setTimeStamp(String timeStamp) {
		TimeStamp = timeStamp;
	}
	/**
	 * ���oMerchantID �Ӯa�s��
	 * @return MerchantID
	 */
	public String getMerchantID() {
		return MerchantID;
	}
	/**
	 * �]�wMerchantID �Ӯa�s��
	 * @param merchantID
	 */
	public void setMerchantID(String merchantID) {
		MerchantID = merchantID;
	}
	/**
	 * ���oInvoiceNo �o�����X�A���שT�w��10 �X
	 * @return InvoiceNo
	 */
	public String getInvoiceNo() {
		return InvoiceNo;
	}
	/**
	 * �]�wInvoiceNo �o�����X�A���שT�w��10 �X
	 * @param invoiceNo
	 */
	public void setInvoiceNo(String invoiceNo) {
		InvoiceNo = invoiceNo;
	}
	/**
	 * ���oAllowanceNo �����s���A���שT�w��16 �X
	 * @return AllowanceNo
	 */
	public String getAllowanceNo() {
		return AllowanceNo;
	}
	/**
	 * �]�wAllowanceNo �����s���A���שT�w��16 �X
	 * @param allowanceNo
	 */
	public void setAllowanceNo(String allowanceNo) {
		AllowanceNo = allowanceNo;
	}
	/**
	 * ���oPhone �o�e²�T���X
	 * @return Phone
	 */
	public String getPhone() {
		return Phone;
	}
	/**
	 * �]�wPhone �o�e²�T���X
	 * @param phone
	 */
	public void setPhone(String phone) {
		Phone = phone;
	}
	/**
	 * ���oNotifyMail �o�e�q�l�l��
	 * @return NotifyMail
	 */
	public String getNotifyMail() {
		return NotifyMail;
	}
	/**
	 * �]�wNotifyMail �o�e�q�l�l��
	 * @param notifyMail
	 */
	public void setNotifyMail(String notifyMail) {
		NotifyMail = notifyMail;
	}
	/**
	 * ���oNotify �o�e�覡 S�G²�T E�G�q�l�l�� A�G�ҳq����
	 * @return Notify
	 */
	public String getNotify() {
		return Notify;
	}
	/**
	 * �]�wNotify �o�e�覡 S�G²�T E�G�q�l�l�� A�G�ҳq����
	 * @param notify
	 */
	public void setNotify(String notify) {
		Notify = notify;
	}
	/**
	 * ���oInvoiceTag �o�e���e���� I�G�o���}�� II�G�o���@�o A�G�����}�� AI�G�����@�o AW�G�o������
	 * @return InvoiceTag
	 */
	public String getInvoiceTag() {
		return InvoiceTag;
	}
	/**
	 * �]�wInvoiceTag �o�e���e���� I�G�o���}�� II�G�o���@�o A�G�����}�� AI�G�����@�o AW�G�o������
	 * @param invoiceTag
	 */
	public void setInvoiceTag(String invoiceTag) {
		InvoiceTag = invoiceTag;
	}
	/**
	 * ���oNotified �o�e��H C�G�o�e�q�����Ȥ� M�G�o�e�q�����Ӯa A�G�ҵo�e�q��
	 * @return Notified
	 */
	public String getNotified() {
		return Notified;
	}
	/**
	 * �]�wNotified �o�e��H C�G�o�e�q�����Ȥ� M�G�o�e�q�����Ӯa A�G�ҵo�e�q��
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
