package allpay.invoice.integration.domain;

/**
 * �R�߽X���Ҫ���
 * @author mark.chiu
 *
 */
public class CheckLoveCodeObj {
	
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
	 * LoveCode
	 * ���س�줧�R�߽X
	 */
	private String LoveCode = "";
	
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
	 * ���oLoveCode ���س�줧�R�߽X
	 * @return LoveCode
	 */
	public String getLoveCode() {
		return LoveCode;
	}
	/**
	 * �]�wLoveCode ���س�줧�R�߽X
	 * @param loveCode
	 */
	public void setLoveCode(String loveCode) {
		LoveCode = loveCode;
	}
	@Override
	public String toString() {
		return "CheckLoveCodeObj [TimeStamp=" + TimeStamp + ", MerchantID=" + MerchantID + ", LoveCode=" + LoveCode
				+ "]";
	}
}
