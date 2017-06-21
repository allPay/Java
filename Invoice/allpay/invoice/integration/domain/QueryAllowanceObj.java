package allpay.invoice.integration.domain;

/**
 * �d�ߧ������Ӫ���
 * @author mark.chiu
 *
 */
public class QueryAllowanceObj {
	
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
	@Override
	public String toString() {
		return "QueryAllowanceObj [TimeStamp=" + TimeStamp + ", MerchantID=" + MerchantID + ", InvoiceNo=" + InvoiceNo
				+ ", AllowanceNo=" + AllowanceNo + "]";
	}
}
