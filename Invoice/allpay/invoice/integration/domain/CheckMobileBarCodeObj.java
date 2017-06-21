package allpay.invoice.integration.domain;

/**
 * 手機條碼驗證物件
 * @author mark.chiu
 *
 */
public class CheckMobileBarCodeObj {
	
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
	 * BarCode
	 * 手機條碼，格式應為1 碼「/」由7 碼數字及大小寫字母組成(長度固定7 碼)
	 */
	private String BarCode = "";
	
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
	 * 取得BarCode 手機條碼，格式應為1 碼「/」由7 碼數字及大小寫字母組成(長度固定7 碼)
	 * @return BarCode
	 */
	public String getBarCode() {
		return BarCode;
	}
	/**
	 * 設定BarCode 手機條碼，格式應為1 碼「/」由7 碼數字及大小寫字母組成(長度固定7 碼)
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
