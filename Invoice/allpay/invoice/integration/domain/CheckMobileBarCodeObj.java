package allpay.invoice.integration.domain;

/**
 * ������X���Ҫ���
 * @author mark.chiu
 *
 */
public class CheckMobileBarCodeObj {
	
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
	 * BarCode
	 * ������X�A�榡����1 �X�u/�v��7 �X�Ʀr�Τj�p�g�r���զ�(���שT�w7 �X)
	 */
	private String BarCode = "";
	
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
	 * ���oBarCode ������X�A�榡����1 �X�u/�v��7 �X�Ʀr�Τj�p�g�r���զ�(���שT�w7 �X)
	 * @return BarCode
	 */
	public String getBarCode() {
		return BarCode;
	}
	/**
	 * �]�wBarCode ������X�A�榡����1 �X�u/�v��7 �X�Ʀr�Τj�p�g�r���զ�(���שT�w7 �X)
	 * @param barCode
	 */
	public void setBarCode(String barCode) {
		BarCode = barCode;
	}
	@Override
	public String toString() {
		return "CheckMobileBarCodeObj [TimeStamp=" + TimeStamp + ", MerchantID=" + MerchantID + ", BarCode=" + BarCode
				+ "]";
	}
}
