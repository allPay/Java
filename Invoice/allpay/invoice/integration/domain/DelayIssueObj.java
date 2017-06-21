package allpay.invoice.integration.domain;

/**
 * ����}�ߵo��(�w���}�ߵo��)����
 * @author mark.chiu
 *
 */
public class DelayIssueObj {
	
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
	 * �Ӯa�ۭq�s��
	 */
	private String RelateNumber = "";
	
	/**
	 * CustomerID
	 * �Ȥ�N��
	 */
	private String CustomerID = "";
	
	/**
	 * CustomerIdentifier
	 * �Τ@�s���A�T�w���׬��Ʀr8�X
	 */
	private String CustomerIdentifier = "";
	
	/**
	 * CustomeName
	 * �Ȥ�W��
	 */
	private String CustomerName = "";
	
	/**
	 * CustomerAddr
	 * �Ȥ�a�}
	 */
	private String CustomerAddr = "";
	
	/**
	 * CustomerPhone
	 * �Ȥ������X
	 */
	private String CustomerPhone = "";
	
	/**
	 * CustomerEmail
	 * �Ȥ�q�l�H�c
	 */
	private String CustomerEmail = "";
	
	/**
	 * ClearanceMark
	 * �q���覡�A�Y�ҵ|���O[TaxType]���s�|�v�ɡA�h�ӰѼƽбa1(�g�����X�f)��2(�D�g�����X�f)
	 */
	private String ClearanceMark = "";
	
	/**
	 * Print
	 * �C�L���O
	 */
	private String Print = "";
	
	/**
	 * Donation
	 * ���ص��O
	 */
	private String Donation = "";
	
	/**
	 * LoveCode
	 * �R�߽X
	 */
	private String LoveCode = "";
	
	/**
	 * CarruerType
	 * �������O�A�Y���L����ɡA�h�бa�Ŧr��
	 */
	private String CarruerType = "";
	
	/**
	 * CarruerNum
	 * ����s��
	 */
	private String CarruerNum = "";
	
	/**
	 * TaxType
	 * �ҵ|���O
	 */
	private String TaxType = "";
	
	/**
	 * SalseAmount
	 * �o���`���B(�t�|)
	 */
	private String SalesAmount = "";
	
	/**
	 * InvoiceRemark
	 * �Ƶ�
	 */
	private String InvoiceRemark = "";
	
	/**
	 * ItemName
	 * �ӫ~�W��
	 */
	private String ItemName = "";
	
	/**
	 * ItemCount
	 * �ӫ~�ƶq
	 */
	private String ItemCount = "";
	
	/**
	 * ItemWord
	 * �ӫ~���
	 */
	private String ItemWord = "";
	
	/**
	 * ItemPrice
	 * �ӫ~����
	 */
	private String ItemPrice = "";
	
	/**
	 * ItemTaxType
	 * �ӫ~�ҵ|�O
	 */
	private String ItemTaxType = "";
	
	/**
	 * ItemAmount
	 * �ӫ~�X�p�A�����t�|�p�p���B
	 */
	private String ItemAmount = "";
	
	/**
	 * InvType
	 * �ӱi�o�����o���r�y����
	 */
	private String InvType = "";
	
	/**
	 * DelayFlag
	 * �i���O���i�o���n����}�ߩ�Ĳ�o�}�ߵo��
	 */
	private String DelayFlag = "";
	
	/**
	 * DelayDay
	 * ����Ѽ�
	 */
	private String DelayDay = "";
	
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
	
	/**
	 * PayAct
	 * ������O�W��
	 */
	private String PayAct = "ALLPAY";
	
	/**
	 * NotifyURL
	 * �}�ߧ����ɳq���Ӯa�t�Ϊ����}
	 */
	private String NotifyURL = "";
	
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
	 * ���oRelateNumber �Ӯa�ۭq�s��
	 * @return RelateNumber
	 */
	public String getRelateNumber() {
		return RelateNumber;
	}
	/**
	 * �]�wRelateNumber �Ӯa�ۭq�s��
	 * @param relateNumber
	 */
	public void setRelateNumber(String relateNumber) {
		RelateNumber = relateNumber;
	}
	/**
	 * ���oCustomerID �Ȥ�N��
	 * @return CustomerID
	 */
	public String getCustomerID() {
		return CustomerID;
	}
	/**
	 * �]�wCustomerID �Ȥ�N��
	 * @param customerID
	 */
	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}
	/**
	 * ���oCustomerIdentifier �Τ@�s���A�T�w���׬��Ʀr8�X
	 * @return CustomerIdentifier
	 */
	public String getCustomerIdentifier() {
		return CustomerIdentifier;
	}
	/**
	 * �]�wCustomerIdentifier �Τ@�s���A�T�w���׬��Ʀr8�X
	 * @param customerIdentifier
	 */
	public void setCustomerIdentifier(String customerIdentifier) {
		CustomerIdentifier = customerIdentifier;
	}
	/**
	 * ���oCustomerName �Ȥ�W��
	 * @return CustomerName
	 */
	public String getCustomerName() {
		return CustomerName;
	}
	/**
	 * �]�wCustomerName �Ȥ�W��
	 * @param customerName
	 */
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	/**
	 * ���oCustomerAddr �Ȥ�a�}
	 * @return CustomerAddr
	 */
	public String getCustomerAddr() {
		return CustomerAddr;
	}
	/**
	 * �]�wCustomerAddr �Ȥ�a�}
	 * @param customerAddr
	 */
	public void setCustomerAddr(String customerAddr) {
		CustomerAddr = customerAddr;
	}
	/**
	 * ���oCustomerPhone �Ȥ������X
	 * @return CustomerPhone
	 */
	public String getCustomerPhone() {
		return CustomerPhone;
	}
	/**
	 * �]�wCustomerPhone �Ȥ������X
	 * @param customerPhone
	 */
	public void setCustomerPhone(String customerPhone) {
		CustomerPhone = customerPhone;
	}
	/**
	 * ���oCustomerEmail �Ȥ�q�l�H�c
	 * @return CustomerEmail
	 */
	public String getCustomerEmail() {
		return CustomerEmail;
	}
	/**
	 * �]�wCustomerEmail �Ȥ�q�l�H�c
	 * @param customerEmail
	 */
	public void setCustomerEmail(String customerEmail) {
		CustomerEmail = customerEmail;
	}
	/**
	 * ���oClearanceMark �q���覡�A�Y�ҵ|���O[TaxType]���s�|�v�ɡA�h�ӰѼƽбa1(�g�����X�f)��2(�D�g�����X�f)
	 * @return ClearanceMark
	 */
	public String getClearanceMark() {
		return ClearanceMark;
	}
	/**
	 * �]�wClearanceMark �q���覡�A�Y�ҵ|���O[TaxType]���s�|�v�ɡA�h�ӰѼƽбa1(�g�����X�f)��2(�D�g�����X�f)
	 * @param clearanceMark
	 */
	public void setClearanceMark(String clearanceMark) {
		ClearanceMark = clearanceMark;
	}
	/**
	 * ���oPrint �C�L���O
	 * @return Print
	 */
	public String getPrint() {
		return Print;
	}
	/**
	 * �]�wPrint �C�L���O
	 * @param print
	 */
	public void setPrint(String print) {
		Print = print;
	}
	/**
	 * ���oDonation ���ص��O
	 * @return Donation
	 */
	public String getDonation() {
		return Donation;
	}
	/**
	 * �]�wDonation ���ص��O
	 * @param donation
	 */
	public void setDonation(String donation) {
		Donation = donation;
	}
	/**
	 * ���oLoveCode �R�߽X
	 * @return LoveCode
	 */
	public String getLoveCode() {
		return LoveCode;
	}
	/**
	 * �]�wLoveCode �R�߽X
	 * @param loveCode
	 */
	public void setLoveCode(String loveCode) {
		LoveCode = loveCode;
	}
	/**
	 * ���oCarruerType �������O�A�Y���L����ɡA�h�бa�Ŧr��
	 * @return CarruerType
	 */
	public String getCarruerType() {
		return CarruerType;
	}
	/**
	 * �]�wCarruerType �������O�A�Y���L����ɡA�h�бa�Ŧr��
	 * @param carruerType
	 */
	public void setCarruerType(String carruerType) {
		CarruerType = carruerType;
	}
	/**
	 * ���oCarruerNum ����s��
	 * @return CarruerNum
	 */
	public String getCarruerNum() {
		return CarruerNum;
	}
	/**
	 * �]�wCarruerNum ����s��
	 * @param carruerNum
	 */
	public void setCarruerNum(String carruerNum) {
		CarruerNum = carruerNum;
	}
	/**
	 * ���oTaxType �ҵ|���O
	 * @return TaxType
	 */
	public String getTaxType() {
		return TaxType;
	}
	/**
	 * �]�wTaxType �ҵ|���O
	 * @param taxType
	 */
	public void setTaxType(String taxType) {
		TaxType = taxType;
	}
	/**
	 * ���oSalesAmount �o���`���B(�t�|)
	 * @return SalesAmount
	 */
	public String getSalesAmount() {
		return SalesAmount;
	}
	/**
	 * �]�wSalesAmount �o���`���B(�t�|)
	 * @param salesAmount
	 */
	public void setSalesAmount(String salesAmount) {
		SalesAmount = salesAmount;
	}
	/**
	 * ���oInvoiceRemark �Ƶ�
	 * @return InvoiceRemark
	 */
	public String getInvoiceRemark() {
		return InvoiceRemark;
	}
	/**
	 * �]�wInvoiceRemark �Ƶ�
	 * @param invoiceRemark
	 */
	public void setInvoiceRemark(String invoiceRemark) {
		InvoiceRemark = invoiceRemark;
	}
	/**
	 * ���oItemName �ӫ~�W��
	 * @return ItemName
	 */
	public String getItemName() {
		return ItemName;
	}
	/**
	 * �]�wItemName �ӫ~�W��
	 * @param itemName
	 */
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	/**
	 * ���oItemCount �ӫ~�ƶq
	 * @return ItemCount
	 */
	public String getItemCount() {
		return ItemCount;
	}
	/**
	 * �]�wItemCount �ӫ~�ƶq
	 * @param itemCount
	 */
	public void setItemCount(String itemCount) {
		ItemCount = itemCount;
	}
	/**
	 * ���oItemWord �ӫ~���
	 * @return ItemWord
	 */
	public String getItemWord() {
		return ItemWord;
	}
	/**
	 * �]�wItemWord �ӫ~���
	 * @param itemWord
	 */
	public void setItemWord(String itemWord) {
		ItemWord = itemWord;
	}
	/**
	 * ���oItemPrice �ӫ~����
	 * @return ItemPrice
	 */
	public String getItemPrice() {
		return ItemPrice;
	}
	/**
	 * �]�wItemPrice �ӫ~����
	 * @param itemPrice
	 */
	public void setItemPrice(String itemPrice) {
		ItemPrice = itemPrice;
	}
	/**
	 * ���oItemTaxType �ӫ~�ҵ|�O
	 * @return ItemTaxType
	 */
	public String getItemTaxType() {
		return ItemTaxType;
	}
	/**
	 * �]�wItemTaxType �ӫ~�ҵ|�O
	 * @param itemTaxType
	 */
	public void setItemTaxType(String itemTaxType) {
		ItemTaxType = itemTaxType;
	}
	/**
	 * ���oItemAmount �ӫ~�X�p�A�����t�|�p�p���B
	 * @return ItemAmount
	 */
	public String getItemAmount() {
		return ItemAmount;
	}
	/**
	 * �]�wItemAmount �ӫ~�X�p�A�����t�|�p�p���B
	 * @param itemAmount
	 */
	public void setItemAmount(String itemAmount) {
		ItemAmount = itemAmount;
	}
	/**
	 * ���oInvType �ӱi�o�����o���r�y����
	 * @return InvType
	 */
	public String getInvType() {
		return InvType;
	}
	/**
	 * �]�wInvType �ӱi�o�����o���r�y����
	 * @param invType
	 */
	public void setInvType(String invType) {
		InvType = invType;
	}
	/**
	 * ���oDelayFlag �i���O���i�o���n����}�ߩ�Ĳ�o�}�ߵo��
	 * @return DelayFlag
	 */
	public String getDelayFlag() {
		return DelayFlag;
	}
	/**
	 * �]�wDelayFlag �i���O���i�o���n����}�ߩ�Ĳ�o�}�ߵo��
	 * @param delayFlag
	 */
	public void setDelayFlag(String delayFlag) {
		DelayFlag = delayFlag;
	}
	/**
	 * ���oDelayDay ����Ѽ�
	 * @return DelayDay
	 */
	public String getDelayDay() {
		return DelayDay;
	}
	/**
	 * �]�wDelayDay ����Ѽ�
	 * @param delayDay
	 */
	public void setDelayDay(String delayDay) {
		DelayDay = delayDay;
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
	/**
	 * ���oPayAct ������O�W��
	 * @return PayAct
	 */
	public String getPayAct() {
		return PayAct;
	}
//	public void setPayAct(String payAct) {
//		PayAct = payAct;
//	}
	/**
	 * ���oNotifyURL �}�ߧ����ɳq���Ӯa�t�Ϊ����}
	 * @return NotifyURL
	 */
	public String getNotifyURL() {
		return NotifyURL;
	}
	/**
	 * �]�wNotifyURL �}�ߧ����ɳq���Ӯa�t�Ϊ����}
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
