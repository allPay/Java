package allpay.invoice.integration.domain;

/**
 * 開立折讓物件
 * @author mark.chiu
 *
 */
public class AllowanceObj {
	
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
	 * InvoiceNo
	 * 發票號碼，長度固定為10碼
	 */
	private String InvoiceNo = "";
	
	/**
	 * AllowanceNotify
	 * 通知類別 S:簡訊 E:電子郵件 A:皆通知時 N:皆不通知
	 */
	private String AllowanceNotify = "";
	
	/**
	 * CustomerName
	 * 客戶名稱
	 */
	private String CustomerName = "";
	
	/**
	 * NotifyMail
	 * 通知電子信箱
	 */
	private String NotifyMail = "";
	
	/**
	 * NotifyPhone
	 * 通知手機號碼
	 */
	private String NotifyPhone = "";
	
	/**
	 * AllowanceAmount
	 * 折讓單總金額(含稅)
	 */
	private String AllowanceAmount = "";
	
	/**
	 * ItemName
	 * 商品名稱
	 */
	private String ItemName = "";
	
	/**
	 * ItemCount
	 * 商品數量
	 */
	private String ItemCount = "";
	
	/**
	 * ItemWord
	 * 商品單位
	 */
	private String ItemWord = "";
	
	/**
	 * ItemPrice
	 * 商品價格
	 */
	private String ItemPrice = "";
	
	/**
	 * ItemTaxType
	 * 商品課稅別
	 */
	private String ItemTaxType = "";
	
	/**
	 * ItemAmount
	 * 商品合計，此為含稅小計金額 商品合計若超過二筆以上請以「|」符號區隔
	 */
	private String ItemAmount = "";
	
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
	 * 取得InvoiceNo 發票號碼，長度固定為10碼
	 * @return InvoiceNo
	 */
	public String getInvoiceNo() {
		return InvoiceNo;
	}
	/**
	 * 設定InvoiceNo 發票號碼，長度固定為10碼
	 * @param invoiceNo
	 */
	public void setInvoiceNo(String invoiceNo) {
		InvoiceNo = invoiceNo;
	}
	/**
	 * 取得AllowanceNotify 通知類別 S:簡訊 E:電子郵件 A:皆通知時 N:皆不通知
	 * @return AllowanceNotify
	 */
	public String getAllowanceNotify() {
		return AllowanceNotify;
	}
	/**
	 * 設定AllowanceNotify 通知類別 S:簡訊 E:電子郵件 A:皆通知時 N:皆不通知
	 * @param allowanceNotify
	 */
	public void setAllowanceNotify(String allowanceNotify) {
		AllowanceNotify = allowanceNotify;
	}
	/**
	 * 取得CustomerName 客戶名稱
	 * @return CustomerName
	 */
	public String getCustomerName() {
		return CustomerName;
	}
	/**
	 * 設定CustomerName 客戶名稱
	 * @param customerName
	 */
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	/**
	 * 取得NotifyMail 通知電子信箱
	 * @return NotifyMail
	 */
	public String getNotifyMail() {
		return NotifyMail;
	}
	/**
	 * 設定NotifyMail 通知電子信箱
	 * @param notifyMail
	 */
	public void setNotifyMail(String notifyMail) {
		NotifyMail = notifyMail;
	}
	/**
	 * 取得NotifyPhone 通知手機號碼
	 * @return NotifyPhone
	 */
	public String getNotifyPhone() {
		return NotifyPhone;
	}
	/**
	 * 設定NotifyPhone 通知手機號碼
	 * @param notifyPhone
	 */
	public void setNotifyPhone(String notifyPhone) {
		NotifyPhone = notifyPhone;
	}
	/**
	 * 取得AllowanceAmount 折讓單總金額(含稅)
	 * @return AllowanceAmount
	 */
	public String getAllowanceAmount() {
		return AllowanceAmount;
	}
	/**
	 * 設定AllowanceAmount 折讓單總金額(含稅)
	 * @param allowanceAmount
	 */
	public void setAllowanceAmount(String allowanceAmount) {
		AllowanceAmount = allowanceAmount;
	}
	/**
	 * 取得ItemName 商品名稱
	 * @return ItemName
	 */
	public String getItemName() {
		return ItemName;
	}
	/**
	 * 設定ItemName 商品名稱
	 * @param itemName
	 */
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	/**
	 * 取得ItemCount 商品數量
	 * @return ItemCount
	 */
	public String getItemCount() {
		return ItemCount;
	}
	/**
	 * 設定ItemCount 商品數量
	 * @param itemCount
	 */
	public void setItemCount(String itemCount) {
		ItemCount = itemCount;
	}
	/**
	 * 取得ItemWord 商品單位
	 * @return ItemWord
	 */
	public String getItemWord() {
		return ItemWord;
	}
	/**
	 * 設定ItemWord 商品單位
	 * @param itemWord
	 */
	public void setItemWord(String itemWord) {
		ItemWord = itemWord;
	}
	/**
	 * 取得ItemPrice 商品價格
	 * @return ItemPrice
	 */
	public String getItemPrice() {
		return ItemPrice;
	}
	/**
	 * 設定ItemPrice 商品價格
	 * @param itemPrice
	 */
	public void setItemPrice(String itemPrice) {
		ItemPrice = itemPrice;
	}
	/**
	 * 取得ItemTaxType 商品課稅別
	 * @return ItemTaxType
	 */
	public String getItemTaxType() {
		return ItemTaxType;
	}
	/**
	 * 設定ItemTaxType 商品課稅別
	 * @param itemTaxType
	 */
	public void setItemTaxType(String itemTaxType) {
		ItemTaxType = itemTaxType;
	}
	/**
	 * 取得ItemAmount 商品合計，此為含稅小計金額 商品合計若超過二筆以上請以「|」符號區隔
	 * @return ItemAmount
	 */
	public String getItemAmount() {
		return ItemAmount;
	}
	/**
	 * 設定ItemAmount 商品合計，此為含稅小計金額 商品合計若超過二筆以上請以「|」符號區隔
	 * @param itemAmount
	 */
	public void setItemAmount(String itemAmount) {
		ItemAmount = itemAmount;
	}
	@Override
	public String toString() {
		return "AllowanceObj [TimeStamp=" + TimeStamp + ", MerchantID=" + MerchantID + ", InvoiceNo=" + InvoiceNo
				+ ", AllowanceNotify=" + AllowanceNotify + ", CustomerName=" + CustomerName + ", NotifyMail="
				+ NotifyMail + ", NotifyPhone=" + NotifyPhone + ", AllowanceAmount=" + AllowanceAmount + ", ItemName="
				+ ItemName + ", ItemCount=" + ItemCount + ", ItemWord=" + ItemWord + ", ItemPrice=" + ItemPrice
				+ ", ItemTaxType=" + ItemTaxType + ", ItemAmount=" + ItemAmount + "]";
	}
}
