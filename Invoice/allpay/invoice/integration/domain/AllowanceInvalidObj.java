package allpay.invoice.integration.domain;

/**
 * �@�o��������
 * @author mark.chiu
 *
 */
public class AllowanceInvalidObj {
	
	/**
	 * TimeStamp
	 * �ɶ��W�O
	 */
	private String TimeStamp = "";
	
	/**
	 * MerchantId
	 * �Ӯa�s��
	 */
	private String MerchantID = "";
	
	/**
	 * InvoiceNo
	 * �o�����X�A���שT�w��10�X
	 */
	private String InvoiceNo = "";
	
	/**
	 * AllowanceNo
	 * ���������A���שT�w��16�X
	 */
	private String AllowanceNo = "";
	
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
	 * @return MerchantId
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
	 * ���oInvoiceNo �o�����X�A���שT�w��10�X
	 * @return InvoiceNo
	 */
	public String getInvoiceNo() {
		return InvoiceNo;
	}
	/**
	 * �]�wInvoiceNo �o�����X�A���שT�w��10�X
	 * @param invoiceNo
	 */
	public void setInvoiceNo(String invoiceNo) {
		InvoiceNo = invoiceNo;
	}
	/**
	 * ���oAllowanceNo ���������A���שT�w��16�X
	 * @return AllowanceNo
	 */
	public String getAllowanceNo() {
		return AllowanceNo;
	}
	/**
	 * �]�wAllowanceNo ���������A���שT�w��16�X
	 * @param allowanceNo
	 */
	public void setAllowanceNo(String allowanceNo) {
		AllowanceNo = allowanceNo;
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
		return "AllowanceInvalidObj [TimeStamp=" + TimeStamp + ", MerchantId=" + MerchantID + ", InvoiceNo=" + InvoiceNo
				+ ", AllowanceNo=" + AllowanceNo + ", Reason=" + Reason + "]";
	}
}
