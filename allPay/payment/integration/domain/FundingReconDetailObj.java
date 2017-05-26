package allPay.payment.integration.domain;

/**
 * �U���H�Υd���ڹ�b����ɪ���
 * @author mark.chiu
 *
 */
public class FundingReconDetailObj {
	
	/**
	 * MerchantID
	 * �|���s��(��allPay����)
	 */
	private String MerchantID = "";
	
	/**
	 * PayDateType
	 * �d�ߤ�����O
	 */
	private String PayDateType = "";
	
	/**
	 * StartDate
	 * �d�߶}�l���
	 */
	private String StartDate = "";
	
	/**
	 * EndDate
	 * �d�ߵ������
	 */
	private String EndDate = "";
	
	/********************* getters and setters *********************/
	
	/**
	 * ���oMerchantID �|���s��(��O��Pay����)
	 * @return MerchantID
	 */
	public String getMerchantID() {
		return MerchantID;
	}
	/**
	 * �]�wMerchantID �|���s��(��O��Pay����)
	 * @param merchantID
	 */
	public void setMerchantID(String merchantID) {
		MerchantID = merchantID;
	}
	/**
	 * ���oPayDateType �d�ߤ�����O�A�n�d�ߪ�������O
	 * �Y���d�߼��ڤ���ɡA�h�Ѽƽбafund
	 * �Y���d�����b����ɡA�h�Ѽƽбaclose
	 * �Y���d�ߤJ�b����ɡA�h�Ѽƽбaenter
	 * @return PayDateType
	 */
	public String getPayDateType() {
		return PayDateType;
	}
	/**
	 * �]�wPayDateType �d�ߤ�����O�A�n�d�ߪ�������O
	 * �Y���d�߼��ڤ���ɡA�h�Ѽƽбafund
	 * �Y���d�����b����ɡA�h�Ѽƽбaclose
	 * �Y���d�ߤJ�b����ɡA�h�Ѽƽбaenter
	 * @param payDateType
	 */
	public void setPayDateType(String payDateType) {
		PayDateType = payDateType;
	}
	/**
	 * ���oStartDate �d�߶}�l����A����榡���uyyyy-MM-dd�v
	 * @return StartDate
	 */
	public String getStartDate() {
		return StartDate;
	}
	/**
	 * �]�wStartDate �d�߶}�l����A����榡���uyyyy-MM-dd�v
	 * @param startDate
	 */
	public void setStartDate(String startDate) {
		StartDate = startDate;
	}
	/**
	 * ���oEndDate �d�ߵ�������A����榡���uyyyy-MM-dd�v
	 * @return EndDate
	 */
	public String getEndDate() {
		return EndDate;
	}
	/**
	 * �]�wEndDate �d�ߵ�������A����榡���uyyyy-MM-dd�v
	 * @param endDate
	 */
	public void setEndDate(String endDate) {
		EndDate = endDate;
	}
	@Override
	public String toString() {
		return "FundingReconDetailObj [MerchantID=" + MerchantID + ", PayDateType=" + PayDateType + ", StartDate="
				+ StartDate + ", EndDate=" + EndDate + "]";
	}
}
