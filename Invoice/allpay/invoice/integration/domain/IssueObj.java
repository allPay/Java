package allpay.invoice.integration.domain;

/**
 * 一般開立發票(立即開立)物件
 * @author mark.chiu
 *
 */
public class IssueObj {
	
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
	 * RelateNumber
	 * 會員自訂編號
	 */
	private String RelateNumber = "";
	
	/**
	 * CustomerID
	 * 客戶代號
	 */
	private String CustomerID = "";
	
	/**
	 * CustomerIdentifier
	 * 統一編號
	 */
	private String CustomerIdentifier = "";
	
	/**
	 * CustomerName
	 * 客戶名稱
	 */
	private String CustomerName = "";
	
	/**
	 * CustomerAddr
	 * 客戶地址
	 */
	private String CustomerAddr = "";
	
	/**
	 * CustomerPhone
	 * 客戶手機號碼
	 */
	private String CustomerPhone = "";
	
	/**
	 * CustomerEmail
	 * 客戶電子信箱
	 */
	private String CustomerEmail = "";
	
	/**
	 * ClearanceMark
	 * 通關方式
	 */
	private String ClearanceMark = "";
	
	/**
	 * Print
	 * 列印註記
	 */
	private String Print = "";
	
	/**
	 * Donation
	 * 捐贈註記
	 */
	private String Donation = "";
	
	/**
	 * LoveCode
	 * 愛心碼 
	 */
	private String LoveCode = "";
	
	/**
	 * CarruerType
	 * 載具類別
	 */
	private String CarruerType = "";
	
	/**
	 * CarruerNum
	 * 載具編號
	 */
	private String CarruerNum = "";
	
	/**
	 * TaxType
	 * 課稅類別
	 */
	private String TaxType = "";
	
	/**
	 * SalesAmount
	 * 發票總金額(含稅)
	 */
	private String SalesAmount = "";
	
	/**
	 * InvoiceRemark
	 * 備註
	 */
	private String InvoiceRemark = "";
	
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
	 * 商品合計，此為含稅小計金額
	 */
	private String ItemAmount = "";
	
	/**
	 * ItemRemark
	 * 商品備註說明
	 */
	private String ItemRemark = "";
	
	/**
	 * InvType
	 * 該張發票的發票字軌類型
	 */
	private String InvType = "";
	
	/**
	 * vat
	 * 商品單價是否含稅，預設為含稅價
	 */
	private String vat = "";
	
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
	 * 取得RelateNumber 會員自訂編號
	 * @return RelateNumber
	 */
	public String getRelateNumber() {
		return RelateNumber;
	}
	/**
	 * 設定RelateNumber 會員自訂編號
	 * @param relateNumber
	 */
	public void setRelateNumber(String relateNumber) {
		RelateNumber = relateNumber;
	}
	/**
	 * 取得CustomerID 客戶代號
	 * @return CustomerID
	 */
	public String getCustomerID() {
		return CustomerID;
	}
	/**
	 * 設定CustomerID 客戶代號
	 * @param customerID
	 */
	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}
	/**
	 * 取得CustomerIdentifier 統一編號
	 * @return CustomerIdentifier
	 */
	public String getCustomerIdentifier() {
		return CustomerIdentifier;
	}
	/**
	 * 設定CustomerIdentifier 統一編號
	 * @param customerIdentifier
	 */
	public void setCustomerIdentifier(String customerIdentifier) {
		CustomerIdentifier = customerIdentifier;
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
	 * 取得CustomerAddr 客戶地址
	 * @return CustomerAddr
	 */
	public String getCustomerAddr() {
		return CustomerAddr;
	}
	/**
	 * 設定CustomerAddr 客戶地址
	 * @param customerAddr
	 */
	public void setCustomerAddr(String customerAddr) {
		CustomerAddr = customerAddr;
	}
	/**
	 * 取得CustomerPhone 客戶手機號碼
	 * @return CustomerPhone
	 */
	public String getCustomerPhone() {
		return CustomerPhone;
	}
	/**
	 * 設定CustomerPhone 客戶手機號碼
	 * @param customerPhone
	 */
	public void setCustomerPhone(String customerPhone) {
		CustomerPhone = customerPhone;
	}
	/**
	 * 取得CustomerEmail 客戶電子信箱
	 * @return CustomerEmail
	 */
	public String getCustomerEmail() {
		return CustomerEmail;
	}
	/**
	 * 設定CustomerEmail 客戶電子信箱
	 * @param customerEmail
	 */
	public void setCustomerEmail(String customerEmail) {
		CustomerEmail = customerEmail;
	}
	/**
	 * 取得ClearanceMark 通關方式
	 * @return ClearanceMark
	 */
	public String getClearanceMark() {
		return ClearanceMark;
	}
	/**
	 * 設定ClearanceMark 通關方式
	 * @param clearanceMark
	 */
	public void setClearanceMark(String clearanceMark) {
		ClearanceMark = clearanceMark;
	}
	/**
	 * 取得Print 列印註記
	 * @return Print
	 */
	public String getPrint() {
		return Print;
	}
	/**
	 * 設定Print 列印註記
	 * @param print
	 */
	public void setPrint(String print) {
		Print = print;
	}
	/**
	 * 取得Donation 捐贈註記
	 * @return Donation
	 */
	public String getDonation() {
		return Donation;
	}
	/**
	 * 設定Donation 捐贈註記
	 * @param donation
	 */
	public void setDonation(String donation) {
		Donation = donation;
	}
	/**
	 * 取得LoveCode 愛心碼 
	 * @return LoveCode
	 */
	public String getLoveCode() {
		return LoveCode;
	}
	/**
	 * 設定LoveCode 愛心碼 
	 * @param loveCode
	 */
	public void setLoveCode(String loveCode) {
		LoveCode = loveCode;
	}
	/**
	 * 取得CarruerType 載具類別
	 * @return CarruerType
	 */
	public String getCarruerType() {
		return CarruerType;
	}
	/**
	 * 設定CarruerType 載具類別
	 * @param carruerType
	 */
	public void setCarruerType(String carruerType) {
		CarruerType = carruerType;
	}
	/**
	 * 取得CarruerNum 載具編號
	 * @return CarruerNum
	 */
	public String getCarruerNum() {
		return CarruerNum;
	}
	/**
	 * 設定CarruerNum 載具編號
	 * @param carruerNum
	 */
	public void setCarruerNum(String carruerNum) {
		CarruerNum = carruerNum;
	}
	/**
	 * 取得TaxType 課稅類別
	 * @return TaxType
	 */
	public String getTaxType() {
		return TaxType;
	}
	/**
	 * 設定TaxType 課稅類別
	 * @param taxType
	 */
	public void setTaxType(String taxType) {
		TaxType = taxType;
	}
	/**
	 * 取得SalesAmount 發票總金額(含稅)
	 * @return SalesAmount
	 */
	public String getSalesAmount() {
		return SalesAmount;
	}
	/**
	 * 設定SalesAmount 發票總金額(含稅)
	 * @param salesAmount
	 */
	public void setSalesAmount(String salesAmount) {
		SalesAmount = salesAmount;
	}
	/**
	 * 取得InvoiceRemark 備註
	 * @return InvoiceRemark
	 */
	public String getInvoiceRemark() {
		return InvoiceRemark;
	}
	/**
	 * 設定InvoiceRemark 備註
	 * @param invoiceRemark
	 */
	public void setInvoiceRemark(String invoiceRemark) {
		InvoiceRemark = invoiceRemark;
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
	 * 取得ItemAmount 商品合計，此為含稅小計金額
	 * @return ItemAmount
	 */
	public String getItemAmount() {
		return ItemAmount;
	}
	/**
	 * 設定ItemAmount 商品合計，此為含稅小計金額
	 * @param itemAmount
	 */
	public void setItemAmount(String itemAmount) {
		ItemAmount = itemAmount;
	}
	/**
	 * 取得ItemRemark 商品備註說明
	 * @return ItemRemark
	 */
	public String getItemRemark() {
		return ItemRemark;
	}
	/**
	 * 設定ItemRemark 商品備註說明
	 * @param itemRemark
	 */
	public void setItemRemark(String itemRemark) {
		ItemRemark = itemRemark;
	}
	/**
	 * 取得InvType 該張發票的發票字軌類型
	 * @return InvType
	 */
	public String getInvType() {
		return InvType;
	}
	/**
	 * 設定InvType 該張發票的發票字軌類型
	 * @param invType
	 */
	public void setInvType(String invType) {
		InvType = invType;
	}
	/**
	 * 取得vat 商品單價是否含稅，預設為含稅價
	 * @return vat
	 */
	public String getVat() {
		return vat;
	}
	/**
	 * 設定vat 商品單價是否含稅，預設為含稅價
	 * @param vat
	 */
	public void setVat(String vat) {
		this.vat = vat;
	}
	@Override
	public String toString() {
		return "IssueObj [TimeStamp=" + TimeStamp + ", MerchantID=" + MerchantID + ", RelateNumber=" + RelateNumber
				+ ", CustomerID=" + CustomerID + ", CustomerIdentifier=" + CustomerIdentifier + ", CustomerName="
				+ CustomerName + ", CustomerAddr=" + CustomerAddr + ", CustomerPhone=" + CustomerPhone
				+ ", CustomerEmail=" + CustomerEmail + ", ClearanceMark=" + ClearanceMark + ", Print=" + Print
				+ ", Donation=" + Donation + ", LoveCode=" + LoveCode + ", CarruerType=" + CarruerType + ", CarruerNum="
				+ CarruerNum + ", TaxType=" + TaxType + ", SalesAmount=" + SalesAmount + ", InvoiceRemark="
				+ InvoiceRemark + ", ItemName=" + ItemName + ", ItemCount=" + ItemCount + ", ItemWord=" + ItemWord
				+ ", ItemPrice=" + ItemPrice + ", ItemTaxType=" + ItemTaxType + ", ItemAmount=" + ItemAmount
				+ ", ItemRemark=" + ItemRemark + ", InvType=" + InvType + ", vat=" + vat + "]";
	}
}
