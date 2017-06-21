package sample;

import allPay.payment.integration.AllInOne;
import allPay.payment.integration.domain.AioChargebackObj;
import allPay.payment.integration.domain.AioCheckOutALL;
import allPay.payment.integration.domain.AioCheckOutPeriod;
import allPay.payment.integration.domain.CaptureObj;
import allPay.payment.integration.domain.DoActionObj;
import allPay.payment.integration.domain.InvoiceObj;
import allPay.payment.integration.domain.QueryCreditCardPeriodInfoObj;

/**
 * �����ѦҥΪ��d�ҵ{���X�A�ä�����A�ФŪ����M�Φb�z���ӷ~���ҡA�H�K�X��
 * @author mark.chiu
 *
 */
public class SampleCode {
	private AllInOne all;
	
	public void initial(){
		//���B�J���z�LAllInOne�غc�l�ӹ���Ʀ����O�A���K��Jlog4j.properties����m���|
		//�Y���ݭn����log�ɡA�i�����blog4j.properties���]�w�A�άO�N���B�J�ҿ�J���r��אּ""
		all = new AllInOne("XXX/OOO");
	}
	
	public String sampleAioALL(){
		initial();
		//����ƥX�һݭn��domain����
		AioCheckOutALL aio = new AioCheckOutALL();
		//�Ӯa��x�ۦ沣�ͤ����ƪ��y�����A�άOUUID�H�����ͤ����ƪ��t�ӥ���s��(�O�o��'-'�o���A�ȱ����^��r�P�Ʀr)
		aio.setMerchantTradeNo("XXX");
		//�Ӯa��x��J�|������ɶ�(���@�w�O��U�A�̾ڻݨD�ۦ�P�_��J)
		aio.setMerchantTradeDate("xxxx/xx/xx xx:xx:xx");

		//��ĳ�q���DB������ƶ�J�A�űq�e�ݿ�J�H�K�D«��
		aio.setTotalAmount("xx");
		aio.setTradeDesc("XX");
		aio.setItemName("XX");
		
		//�i�H�q�e�ݨϥΪ̶�J���
		aio.setRemark("XX");
		aio.setUseRedeem("XX");
		
		//�H�W��Ƥ������A�ȨѰѦҦp���J���
		
		
		//�I�sAllInOne��������method�A����html form�r��(�tJavaScript Submit)����A��J�e�ݧY�i
		//��������������}�o���AInvoiceObj�бanull
		String html = all.aioCheckOut(aio, null);
		return html;
	}
	
	public String sampleAioPeriod(){
		initial();
		//����ƥX�һݭn��domain����
		AioCheckOutPeriod aio = new AioCheckOutPeriod();
		//�Ӯa��x�ۦ沣�ͤ����ƪ��y�����A�άOUUID�H�����ͤ����ƪ��t�ӥ���s��(�O�o��'-'�o���A�ȱ����^��r�P�Ʀr)
		aio.setMerchantTradeNo("XXX");
		//�Ӯa��x��J�|������ɶ�(���@�w�O��U�A�̾ڻݨD�ۦ�P�_��J)
		aio.setMerchantTradeDate("xxxx/xx/xx xx:xx:xx");

		//��ĳ�q���DB������ƶ�J�A�űq�e�ݿ�J�H�K�D«��
		aio.setTotalAmount("xx");
		aio.setTradeDesc("XX");
		aio.setItemName("XX");
				
		//�i�H�q�e�ݨϥΪ̶�J���
		aio.setRemark("XX");
		aio.setUseRedeem("XX");
		//���O�̥i��ܱ��ʶR������(��x�i��n���ҫe�ݩұa�J���O�_�P��ݪ��ﶵ�ۦP�H���R��)
		aio.setExecTimes("XX");
		//��ݳ]�w
		aio.setPeriodType("XX");
		aio.setFrequency("XX");
		aio.setPeriodAmount("XX");
		
		//�H�W��Ƥ������A�ȨѰѦҦp���J���
		
		//�Y�U�Ȼݭn�q�l�o��
		InvoiceObj invoice = new InvoiceObj();
		//�ϥΪ̶�J
		invoice.setCustomerName("XX");
		invoice.setCustomerAddr("XX");
		invoice.setCustomerEmail("XX");
		invoice.setCustomerIdentifier("XX");
		
		//��l�ѼƳ��O�q��ݨt�Φ۰����L�]�w
		invoice.setRelateNumber("XX");
		//�ӫ~��T�Фűq�e�ݭ������o�A�гz�L�ӫ~ID�h�q��ݼ����ӫ~��T�H�K�D�q�e��«��
		invoice.setInvoiceItemName("XX");
		
		//�I�sAllInOne��������method�A����html form�r��(�tJavaScript Submit)����A��J�e�ݧY�i
		//������������}�o���A�бa�JInvoiceObj
		String html = all.aioCheckOut(aio, invoice);
		return html;
	}
	
	public String sampleQueryCreditCardPeriodInfo(){
		//Query���\�ೣ�����A�b���H�d�ߩw���w�B�q��Ӱ��d��
		QueryCreditCardPeriodInfoObj obj = new QueryCreditCardPeriodInfoObj();
		//�u���|������s���n��J
		obj.setMerchantTradeNo("XX");
		String result = all.queryCreditCardPeriodInfo(obj);
		return result;
	}
	
	public String sampleCapture(){
		initial();
		//�|���ӽм���/�h�ڽd��
		CaptureObj obj = new CaptureObj();
		obj.setMerchantTradeNo("XX");
		//���h�ڪ��B�n�p�߫O�@
		obj.setCaptureAMT("XX");
		obj.setUserRefundAMT("XX");
		//�վ㥭�x�Ӥ���O���v���ݭn�Q�O�@
		obj.setUpdatePlatformChargeFee("XX");
		obj.setPlatformChargeFee("XX");
		obj.setRemark("XX");
		String result = all.capture(obj);
		return result;
	}
	
	public String sampleDoAction(){
		//�H�Υd���b�B�h��B�����B���B �L�k�bStage���Ҽ���
		initial();
		DoActionObj obj = new DoActionObj();
		obj.setMerchantTradeNo("XX");
		obj.setTradeNo("XX");
		//����ʧ@�ݭn���v������
		obj.setAction("XX");
		obj.setTotalAmount("XX");
		String result = all.doAction(obj);
		return result;
	}
	
	public String sampleChargeback(){
		//�|���q���h�� �ݭn�]�w�v�����\���K�Ӯa�޲z
		initial();
		AioChargebackObj obj = new AioChargebackObj();
		obj.setMerchantTradeNo("XX");
		obj.setTradeNo("XX");
		obj.setChargeBackTotalAmount("XX");
		obj.setRemark("XX");
		String result = all.aioChargeback(obj);
		return result;
	}
}
