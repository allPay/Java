package allpay.invoice.integration.domain;

/**
 * �}�ߧ�������
 * @author mark.chiu
 *
 */
public class AllowanceObj {
	
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
	 * InvoiceNo
	 * �o�����X�A���שT�w��10�X
	 */
	private String InvoiceNo = "";
	
	/**
	 * AllowanceNotify
	 * �q�����O S:²�T E:�q�l�l�� A:�ҳq���� N:�Ҥ��q��
	 */
	private String AllowanceNotify = "";
	
	/**
	 * CustomerName
	 * �Ȥ�W��
	 */
	private String CustomerName = "";
	
	/**
	 * NotifyMail
	 * �q���q�l�H�c
	 */
	private String NotifyMail = "";
	
	/**
	 * NotifyPhone
	 * �q��������X
	 */
	private String NotifyPhone = "";
	
	/**
	 * AllowanceAmount
	 * �������`���B(�t�|)
	 */
	private String AllowanceAmount = "";
	
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
	 * �ӫ~�X�p�A�����t�|�p�p���B �ӫ~�X�p�Y�W�L�G���H�W�ХH�u|�v�Ÿ��Ϲj
	 */
	private String ItemAmount = "";
	
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
	 * ���oInvoiceNo �o�����X�A���שT�w��10�X
	 * @return InvoiceNo
	 */
	public String getInvoiceNo() {
		return InvoiceNo;
	}
	/**
	 * �]�wInvoiceNo �o�����X�A���שT�w��10�X
	 * @param invoiceNo
	 */
	public void setInvoiceNo(String invoiceNo) {
		InvoiceNo = invoiceNo;
	}
	/**
	 * ���oAllowanceNotify �q�����O S:²�T E:�q�l�l�� A:�ҳq���� N:�Ҥ��q��
	 * @return AllowanceNotify
	 */
	public String getAllowanceNotify() {
		return AllowanceNotify;
	}
	/**
	 * �]�wAllowanceNotify �q�����O S:²�T E:�q�l�l�� A:�ҳq���� N:�Ҥ��q��
	 * @param allowanceNotify
	 */
	public void setAllowanceNotify(String allowanceNotify) {
		AllowanceNotify = allowanceNotify;
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
	 * ���oNotifyMail �q���q�l�H�c
	 * @return NotifyMail
	 */
	public String getNotifyMail() {
		return NotifyMail;
	}
	/**
	 * �]�wNotifyMail �q���q�l�H�c
	 * @param notifyMail
	 */
	public void setNotifyMail(String notifyMail) {
		NotifyMail = notifyMail;
	}
	/**
	 * ���oNotifyPhone �q��������X
	 * @return NotifyPhone
	 */
	public String getNotifyPhone() {
		return NotifyPhone;
	}
	/**
	 * �]�wNotifyPhone �q��������X
	 * @param notifyPhone
	 */
	public void setNotifyPhone(String notifyPhone) {
		NotifyPhone = notifyPhone;
	}
	/**
	 * ���oAllowanceAmount �������`���B(�t�|)
	 * @return AllowanceAmount
	 */
	public String getAllowanceAmount() {
		return AllowanceAmount;
	}
	/**
	 * �]�wAllowanceAmount �������`���B(�t�|)
	 * @param allowanceAmount
	 */
	public void setAllowanceAmount(String allowanceAmount) {
		AllowanceAmount = allowanceAmount;
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
	 * ���oItemAmount �ӫ~�X�p�A�����t�|�p�p���B �ӫ~�X�p�Y�W�L�G���H�W�ХH�u|�v�Ÿ��Ϲj
	 * @return ItemAmount
	 */
	public String getItemAmount() {
		return ItemAmount;
	}
	/**
	 * �]�wItemAmount �ӫ~�X�p�A�����t�|�p�p���B �ӫ~�X�p�Y�W�L�G���H�W�ХH�u|�v�Ÿ��Ϲj
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
