package allpay.invoice.integration.domain;

/**
 * Ĳ�o�}�ߵo������
 * @author mark.chiu
 *
 */
public class TriggerIssueObj {
	
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
	 * Tsr
	 * ����渹
	 */
	private String Tsr = "";
	
	/**
	 * PayType
	 * ������O
	 */
	private String PayType = "3";
	
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
	 * ���oTsr ����渹
	 * @return Tsr
	 */
	public String getTsr() {
		return Tsr;
	}
	/**
	 * �]�wTsr ����渹
	 * @param tsr
	 */
	public void setTsr(String tsr) {
		Tsr = tsr;
	}
	/**
	 * ���oPayType ������O
	 * @return PayType
	 */
	public String getPayType() {
		return PayType;
	}
//	public void setPayType(String payType) {
//		PayType = payType;
//	}
	@Override
	public String toString() {
		return "TriggerIssueObj [TimeStamp=" + TimeStamp + ", MerchantID=" + MerchantID + ", Tsr=" + Tsr + ", PayType="
				+ PayType + "]";
	}
}
