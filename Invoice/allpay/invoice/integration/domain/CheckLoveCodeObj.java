package allpay.invoice.integration.domain;

/**
 * 愛心碼驗證物件
 * @author mark.chiu
 *
 */
public class CheckLoveCodeObj {
	
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
	 * LoveCode
	 * 受贈單位之愛心碼
	 */
	private String LoveCode = "";
	
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
	 * 取得LoveCode 受贈單位之愛心碼
	 * @return LoveCode
	 */
	public String getLoveCode() {
		return LoveCode;
	}
	/**
	 * 設定LoveCode 受贈單位之愛心碼
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
