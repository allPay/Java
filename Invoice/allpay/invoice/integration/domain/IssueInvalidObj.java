package allpay.invoice.integration.domain;

/**
 * �@�o�o������
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
	 * �ɶ��W�O
	 */
	private String TimeStamp = "";
	
	/**
	 * MerchantID
	 * �Ӯa�s��
	 */
	private String MerchantID = "";
	
	/**
	 * InvoiceNumber
	 * �o�����X�A���שT�w��10�X
	 */
	private String InvoiceNumber = "";
	
	/**
	 * Reason
	 * �@�o��]
	 */
	private String Reason = "";
	
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
	 * ���oInvoiceNumber �o�����X�A���שT�w��10�X
	 * @return InvoiceNumber
	 */
	public String getInvoiceNumber() {
		return InvoiceNumber;
	}
	/**
	 * �]�wInvoiceNumber �o�����X�A���שT�w��10�X
	 * @param invoiceNumber
	 */
	public void setInvoiceNumber(String invoiceNumber) {
		InvoiceNumber = invoiceNumber;
	}
	/**
	 * ���oReason �@�o��]
	 * @return Reason
	 */
	public String getReason() {
		return Reason;
	}
	/**
	 * �]�wReason �@�o��]
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
