package allpay.invoice.integration.domain;

/**
 * �d�ߧ@�o�o�����Ӫ���
 * @author mark.chiu
 *
 */
public class QueryIssueInvalidObj {
	
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
	 * RelateNumber
	 * �Ӯa�ۭq�s���A���שT�w��30 �X
	 */
	private String RelateNumber = "";
	
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
	 * ���oRelateNumber �Ӯa�ۭq�s���A���שT�w��30 �X
	 * @return RelateNumber
	 */
	public String getRelateNumber() {
		return RelateNumber;
	}
	/**
	 * �]�wRelateNumber �Ӯa�ۭq�s���A���שT�w��30 �X
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
