package sample;

import allpay.invoice.integration.AllInOne;
import allpay.invoice.integration.domain.IssueObj;

/**
 * �����ѦҥΪ��d�ҵ{���X�A�ä�����A�ФŪ����M�Φb�z���ӷ~���ҡA�H�K�X��
 * @author mark.chiu
 *
 */
public class SampleCode {
	private AllInOne all;
	
	public void initial(){
		//���B�J���z�LAllInOne�غc�l�ӹ���Ʀ����O�A���K��Jlog4j.properties����m���|
		//�Y���ݭn����log�ɡA�i�����blog4j.properties���]�w�A�άO���ǤJ����Ѽ�
		// all = new AllInOne();
		all = new AllInOne("XXX/000");
	}
	
	public String sampleIssue(){
		initial();
		// ����ƥX�һݭn��domain����
		IssueObj issue = new IssueObj();
		// �Ӯa��x�ۦ沣�ͤ����ƪ��y�����A�άOUUID�H�����ͤ����ƪ��t�ӥ���s��(�O�o��'-'�o���A�ȱ����^��r�P�Ʀr)
		issue.setRelateNumber("XXX");
		// �i�H�q�e�ݨϥΪ̶�J��ơA�άO���DB���X�R�a��T
		issue.setCustomerName("XXX");
		// �q��ݨ̾ڰӫ~�s�����X�ӫ~��T�A�Фűq�e�ݼ������
		issue.setItemName("XXX");
		// �I�sAllInOne���۹�����method�A�ä����^�ǭ�
		String response = all.issue(issue);
		return response;
	}
}
