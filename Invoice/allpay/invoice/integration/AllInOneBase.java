package allpay.invoice.integration;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import allpay.invoice.integration.allpayOperator.AllpayFunction;
import allpay.invoice.integration.errorMsg.ErrorMessage;
import allpay.invoice.integration.exception.AllpayException;

public class AllInOneBase {
	protected static String operatingMode;
	protected static String mercProfile;
	protected static String HashKey;
	protected static String HashIV;
	protected static String MerchantID;
	protected static String issueUrl;
	protected static String delayIssueUrl;
	protected static String triggerIssueUrl;
	protected static String allowanceUrl;
	protected static String issueInvalidUrl;
	protected static String allowanceInvalidUrl;
	protected static String queryIssueUrl;
	protected static String queryAllowanceUrl;
	protected static String queryIssueInvalidUrl;
	protected static String queryAllowanceInvalidUrl;
	protected static String invoiceNotifyUrl;
	protected static String checkMobileBarCodeUrl;
	protected static String checkLoveCodeUrl;
	public AllInOneBase(){
		try {
			Document doc;
			
			/* when using web project, please use the following code with try/catch wrapped*/
			ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			String configPath = URLDecoder.decode(classLoader.getResource("/invoice_conf.xml").getPath(), "UTF-8");
			doc = AllpayFunction.xmlParser(configPath);
			/* when using testing code*/
//			String configPath = "./src/main/resources/invoice_conf.xml";
//			doc = AllpayFunction.xmlParser(configPath);
			
			doc.getDocumentElement().normalize();
			//OperatingMode
			Element ele = (Element)doc.getElementsByTagName("OperatingMode").item(0);
			operatingMode = ele.getTextContent();
			//MercProfile
			ele = (Element)doc.getElementsByTagName("MercProfile").item(0);
			mercProfile = ele.getTextContent();
			//MID, HashKey, HashIV
			NodeList nodeList = doc.getElementsByTagName("MInfo");
			for(int i = 0; i < nodeList.getLength(); i++){
				ele = (Element)nodeList.item(i);
				if(ele.getAttribute("name").equalsIgnoreCase(mercProfile)){
					MerchantID = ele.getElementsByTagName("MerchantID").item(0).getTextContent();
					HashKey = ele.getElementsByTagName("HashKey").item(0).getTextContent();
					HashIV = ele.getElementsByTagName("HashIV").item(0).getTextContent();
				}
			}
			if(HashKey == null){
				throw new AllpayException(ErrorMessage.MInfo_NOT_SETTING);
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
