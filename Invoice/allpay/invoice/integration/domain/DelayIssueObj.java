package allpay.invoice.integration.domain;

/**
 * 延遲開立發票(預約開立發票)物件
 * @author mark.chiu
 *
 */
public class DelayIssueObj {
	
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
	 * 商家自訂編號
	 */
	private String RelateNumber = "";
	
	/**
	 * CustomerID
	 * 客戶代號
	 */
	private String CustomerID = "";
	
	/**
	 * CustomerIdentifier
	 * 統一編號，固定長度為數字8碼
	 */
	private String CustomerIdentifier = "";
	
	/**
	 * CustomeName
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
	 * 通關方式，若課稅類別[TaxType]為零稅率時，則該參數請帶1(經海關出口)或2(非經海關出口)
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
	 * 載具類別，若為無載具時，則請帶空字串
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
	 * SalseAmount
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
	 * InvType
	 * 該張發票的發票字軌類型
	 */
	private String InvType = "";
	
	/**
	 * DelayFlag
	 * 可註記此張發票要延遲開立或觸發開立發票
	 */
	private String DelayFlag = "";
	
	/**
	 * DelayDay
	 * 延遲天數
	 */
	private String DelayDay = "";
	
	/**
	 * Tsr
	 * 交易單號
	 */
	private String Tsr = "";
	
	/**
	 * PayType
	 * 交易類別
	 */
	private String PayType = "3";
	
	/**
	 * PayAct
	 * 交易類別名稱
	 */
	private String PayAct = "ALLPAY";
	
	/**
	 * NotifyURL
	 * 開立完成時通知商家系統的網址
	 */
	private String NotifyURL = "";
	
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
	 * 取得RelateNumber 商家自訂編號
	 * @return RelateNumber
	 */
	public String getRelateNumber() {
		return RelateNumber;
	}
	/**
	 * 設定RelateNumber 商家自訂編號
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
	 * 取得CustomerIdentifier 統一編號，固定長度為數字8碼
	 * @return CustomerIdentifier
	 */
	public String getCustomerIdentifier() {
		return CustomerIdentifier;
	}
	/**
	 * 設定CustomerIdentifier 統一編號，固定長度為數字8碼
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
	 * 取得ClearanceMark 通關方式，若課稅類別[TaxType]為零稅率時，則該參數請帶1(經海關出口)或2(非經海關出口)
	 * @return ClearanceMark
	 */
	public String getClearanceMark() {
		return ClearanceMark;
	}
	/**
	 * 設定ClearanceMark 通關方式，若課稅類別[TaxType]為零稅率時，則該參數請帶1(經海關出口)或2(非經海關出口)
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
	 * 取得CarruerType 載具類別，若為無載具時，則請帶空字串
	 * @return CarruerType
	 */
	public String getCarruerType() {
		return CarruerType;
	}
	/**
	 * 設定CarruerType 載具類別，若為無載具時，則請帶空字串
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
	 * 取得DelayFlag 可註記此張發票要延遲開立或觸發開立發票
	 * @return DelayFlag
	 */
	public String getDelayFlag() {
		return DelayFlag;
	}
	/**
	 * 設定DelayFlag 可註記此張發票要延遲開立或觸發開立發票
	 * @param delayFlag
	 */
	public void setDelayFlag(String delayFlag) {
		DelayFlag = delayFlag;
	}
	/**
	 * 取得DelayDay 延遲天數
	 * @return DelayDay
	 */
	public String getDelayDay() {
		return DelayDay;
	}
	/**
	 * 設定DelayDay 延遲天數
	 * @param delayDay
	 */
	public void setDelayDay(String delayDay) {
		DelayDay = delayDay;
	}
	/**
	 * 取得Tsr 交易單號
	 * @return Tsr
	 */
	public String getTsr() {
		return Tsr;
	}
	/**
	 * 設定Tsr 交易單號
	 * @param tsr
	 */
	public void setTsr(String tsr) {
		Tsr = tsr;
	}
	/**
	 * 取得PayType 交易類別
	 * @return PayType
	 */
	public String getPayType() {
		return PayType;
	}
//	public void setPayType(String payType) {
//		PayType = payType;
//	}
	/**
	 * 取得PayAct 交易類別名稱
	 * @return PayAct
	 */
	public String getPayAct() {
		return PayAct;
	}
//	public void setPayAct(String payAct) {
//		PayAct = payAct;
//	}
	/**
	 * 取得NotifyURL 開立完成時通知商家系統的網址
	 * @return NotifyURL
	 */
	public String getNotifyURL() {
		return NotifyURL;
	}
	/**
	 * 設定NotifyURL 開立完成時通知商家系統的網址
	 * @param notifyURL
	 */
	public void setNotifyURL(String notifyURL) {
		NotifyURL = notifyURL;
	}
	@Override
	public String toString() {
		return "DelayIssueObj [TimeStamp=" + TimeStamp + ", MerchantID=" + MerchantID + ", RelateNumber=" + RelateNumber
				+ ", CustomerID=" + CustomerID + ", CustomerIdentifier=" + CustomerIdentifier + ", CustomeName="
				+ CustomerName + ", CustomerAddr=" + CustomerAddr + ", CustomerPhone=" + CustomerPhone
				+ ", CustomerEmail=" + CustomerEmail + ", ClearanceMark=" + ClearanceMark + ", Print=" + Print
				+ ", Donation=" + Donation + ", LoveCode=" + LoveCode + ", CarruerType=" + CarruerType + ", CarruerNum="
				+ CarruerNum + ", TaxType=" + TaxType + ", SalesAmount=" + SalesAmount + ", InvoiceRemark="
				+ InvoiceRemark + ", ItemName=" + ItemName + ", ItemCount=" + ItemCount + ", ItemWord=" + ItemWord
				+ ", ItemPrice=" + ItemPrice + ", ItemTaxType=" + ItemTaxType + ", ItemAmount=" + ItemAmount
				+ ", InvType=" + InvType + ", DelayFlag=" + DelayFlag + ", DelayDay=" + DelayDay + ", Tsr=" + Tsr
				+ ", PayType=" + PayType + ", PayAct=" + PayAct + ", NotifyURL=" + NotifyURL + "]";
	}
}
