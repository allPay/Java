package allpay.invoice.integration;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import allpay.invoice.integration.allpayOperator.AllpayFunction;
import allpay.invoice.integration.domain.AllowanceInvalidObj;
import allpay.invoice.integration.domain.AllowanceObj;
import allpay.invoice.integration.domain.CheckLoveCodeObj;
import allpay.invoice.integration.domain.CheckMobileBarCodeObj;
import allpay.invoice.integration.domain.DelayIssueObj;
import allpay.invoice.integration.domain.InvoiceNotifyObj;
import allpay.invoice.integration.domain.IssueInvalidObj;
import allpay.invoice.integration.domain.IssueObj;
import allpay.invoice.integration.domain.QueryAllowanceInvalidObj;
import allpay.invoice.integration.domain.QueryAllowanceObj;
import allpay.invoice.integration.domain.QueryIssueInvalidObj;
import allpay.invoice.integration.domain.QueryIssueObj;
import allpay.invoice.integration.domain.TriggerIssueObj;
import allpay.invoice.integration.errorMsg.ErrorMessage;
import allpay.invoice.integration.exception.AllpayException;
import allpay.invoice.integration.verification.VerifyAllowance;
import allpay.invoice.integration.verification.VerifyAllowanceInvalid;
import allpay.invoice.integration.verification.VerifyCheckLoveCode;
import allpay.invoice.integration.verification.VerifyCheckMobileBarCode;
import allpay.invoice.integration.verification.VerifyDelayIssue;
import allpay.invoice.integration.verification.VerifyInvoiceNotify;
import allpay.invoice.integration.verification.VerifyIssue;
import allpay.invoice.integration.verification.VerifyIssueInvalid;
import allpay.invoice.integration.verification.VerifyQueryAllowance;
import allpay.invoice.integration.verification.VerifyQueryAllowanceInvalid;
import allpay.invoice.integration.verification.VerifyQueryIssue;
import allpay.invoice.integration.verification.VerifyQueryIssueInvalid;
import allpay.invoice.integration.verification.VerifyTriggerIssue;

/**
 * 歐付寶電子發票全功能類別
 * @author mark.chiu
 *
 */
public class AllInOne extends AllInOneBase{
	private final static Logger log = Logger.getLogger(AllInOne.class.getName());
	
	public AllInOne(String log4jPropertiesPath){
		super();
		if(log4jPropertiesPath.substring(log4jPropertiesPath.length()-1).equals("/"))
			PropertyConfigurator.configure(log4jPropertiesPath + "log4j.properties");
		else if(!log4jPropertiesPath.substring(log4jPropertiesPath.length()-1).equals("/")
				&& log4jPropertiesPath.length() > 0)
			PropertyConfigurator.configure(log4jPropertiesPath + "/log4j.properties");
		else
			throw new AllpayException(ErrorMessage.LOG4J_PATH_ERROR);
	}
	public AllInOne(){
		super();
		Logger.getRootLogger().setLevel(Level.OFF);
	}
	
	public String issue(IssueObj obj){
		obj.setMerchantID(MerchantID);
		obj.setTimeStamp(AllpayFunction.genUnixTimeStamp());
		log.info("issue params: " + obj.toString());
		String result = "";
		String CheckMacValue = "";
		try{
			VerifyIssue verify = new VerifyIssue();
			issueUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(obj);
			obj.setCustomerName(AllpayFunction.urlEncode(obj.getCustomerName()));
			obj.setCustomerAddr(AllpayFunction.urlEncode(obj.getCustomerAddr()));
			obj.setCustomerEmail(AllpayFunction.urlEncode(obj.getCustomerEmail()));
			obj.setInvoiceRemark(AllpayFunction.urlEncode(obj.getInvoiceRemark()));
			obj.setItemName(AllpayFunction.urlEncode(obj.getItemName()));
			obj.setItemWord(AllpayFunction.urlEncode(obj.getItemWord()));
			obj.setItemRemark(AllpayFunction.urlEncode(obj.getItemRemark()));
			obj.setCarruerNum(obj.getCarruerNum().replaceAll("\\+", " "));
			CheckMacValue = AllpayFunction.genCheckMacValue(HashKey, HashIV, obj);
			log.info("issue generate CheckMacValue: " + CheckMacValue);
			String httpValue = AllpayFunction.genHttpValue(obj, CheckMacValue);
			log.info("issue post String: " + httpValue);
			result = AllpayFunction.httpPost(issueUrl, httpValue, "UTF-8");
		} catch(AllpayException e){
			e.ShowExceptionMessage();
			log.error(e.getNewExceptionMessage());
			throw new AllpayException(e.getNewExceptionMessage());
		}
		return result;
	}
	
	public String delayIssue(DelayIssueObj obj){
		obj.setMerchantID(MerchantID);
		obj.setTimeStamp(AllpayFunction.genUnixTimeStamp());
		log.info("delayIssue params: " + obj.toString());
		String result = "";
		String CheckMacValue = "";
		try{
			VerifyDelayIssue verify = new VerifyDelayIssue();
			delayIssueUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(obj);
			obj.setCustomerName(AllpayFunction.urlEncode(obj.getCustomerName()));
			obj.setCustomerAddr(AllpayFunction.urlEncode(obj.getCustomerAddr()));
			obj.setCustomerEmail(AllpayFunction.urlEncode(obj.getCustomerEmail()));
			obj.setInvoiceRemark(AllpayFunction.urlEncode(obj.getInvoiceRemark()));
			obj.setItemName(AllpayFunction.urlEncode(obj.getItemName()));
			obj.setItemWord(AllpayFunction.urlEncode(obj.getItemWord()));
			obj.setCarruerNum(obj.getCarruerNum().replaceAll("\\+", " "));
			CheckMacValue = AllpayFunction.genCheckMacValue(HashKey, HashIV, obj);
			log.info("delayIssue generate CheckMacValue: " + CheckMacValue);
			String httpValue = AllpayFunction.genHttpValue(obj, CheckMacValue);
			log.info("delayIssue post String: " + httpValue);
			result = AllpayFunction.httpPost(delayIssueUrl, httpValue, "UTF-8");
		} catch(AllpayException e){
			e.ShowExceptionMessage();
			log.error(e.getNewExceptionMessage());
			throw new AllpayException(e.getNewExceptionMessage());
		}
		return result;
	}
	
	public String triggerIssue(TriggerIssueObj obj){
		obj.setMerchantID(MerchantID);
		obj.setTimeStamp(AllpayFunction.genUnixTimeStamp());
		log.info("triggerIssue params: " + obj.toString());
		String result = "";
		String CheckMacValue = "";
		try{
			VerifyTriggerIssue verify = new VerifyTriggerIssue();
			triggerIssueUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(obj);
			CheckMacValue = AllpayFunction.genCheckMacValue(HashKey, HashIV, obj);
			log.info("triggerIssue generate CheckMacValue: " + CheckMacValue);
			String httpValue = AllpayFunction.genHttpValue(obj, CheckMacValue);
			log.info("triggerIssue post String: " + httpValue);
			result = AllpayFunction.httpPost(triggerIssueUrl, httpValue, "UTF-8");
		} catch(AllpayException e){
			e.ShowExceptionMessage();
			log.error(e.getNewExceptionMessage());
			throw new AllpayException(e.getNewExceptionMessage());
		}
		return result;
	}
	
	public String allowance(AllowanceObj obj){
		obj.setMerchantID(MerchantID);
		obj.setTimeStamp(AllpayFunction.genUnixTimeStamp());
		log.info("allowance params: " + obj.toString());
		String result = "";
		String CheckMacValue = "";
		try{
			VerifyAllowance verify = new VerifyAllowance();
			allowanceUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(obj);
			obj.setCustomerName(AllpayFunction.urlEncode(obj.getCustomerName()));
			obj.setNotifyMail(AllpayFunction.urlEncode(obj.getNotifyMail()));
			obj.setItemName(AllpayFunction.urlEncode(obj.getItemName()));
			obj.setItemWord(AllpayFunction.urlEncode(obj.getItemWord()));
			CheckMacValue = AllpayFunction.genCheckMacValue(HashKey, HashIV, obj);
			log.info("allowance generate CheckMacValue: " + CheckMacValue);
			String httpValue = AllpayFunction.genHttpValue(obj, CheckMacValue);
			log.info("allowance post String: " + httpValue);
			result = AllpayFunction.httpPost(allowanceUrl, httpValue, "UTF-8");
		} catch(AllpayException e){
			e.ShowExceptionMessage();
			log.error(e.getNewExceptionMessage());
			throw new AllpayException(e.getNewExceptionMessage());
		}
		return result;
	}
	
	public String issueInvalid(IssueInvalidObj obj){
		obj.setMerchantID(MerchantID);
		obj.setTimeStamp(AllpayFunction.genUnixTimeStamp());
		log.info("issueInvalid params: " + obj.toString());
		String result = "";
		String CheckMacValue = "";
		try{
			VerifyIssueInvalid verify = new VerifyIssueInvalid();
			issueInvalidUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(obj);
			obj.setReason(AllpayFunction.urlEncode(obj.getReason()));
			CheckMacValue = AllpayFunction.genCheckMacValue(HashKey, HashIV, obj);
			log.info("issueInvalid generate CheckMacValue: " + CheckMacValue);
			String httpValue = AllpayFunction.genHttpValue(obj, CheckMacValue);
			log.info("issueInvalid post String: " + httpValue);
			result = AllpayFunction.httpPost(issueInvalidUrl, httpValue, "UTF-8");
		} catch(AllpayException e){
			e.ShowExceptionMessage();
			log.error(e.getNewExceptionMessage());
			throw new AllpayException(e.getNewExceptionMessage());
		}
		return result;
	}
	
	public String allowanceInvalid(AllowanceInvalidObj obj){
		obj.setMerchantID(MerchantID);
		obj.setTimeStamp(AllpayFunction.genUnixTimeStamp());
		log.info("allowanceInvalid params: " + obj.toString());
		String result = "";
		String CheckMacValue = "";
		try{
			VerifyAllowanceInvalid verify = new VerifyAllowanceInvalid();
			allowanceInvalidUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(obj);
			obj.setReason(AllpayFunction.urlEncode(obj.getReason()));
			CheckMacValue = AllpayFunction.genCheckMacValue(HashKey, HashIV, obj);
			log.info("allowanceInvalid generate CheckMacValue: " + CheckMacValue);
			String httpValue = AllpayFunction.genHttpValue(obj, CheckMacValue);
			log.info("allowanceInvalid post String: " + httpValue);
			result = AllpayFunction.httpPost(allowanceInvalidUrl, httpValue, "UTF-8");
		} catch(AllpayException e){
			e.ShowExceptionMessage();
			log.error(e.getNewExceptionMessage());
			throw new AllpayException(e.getNewExceptionMessage());
		}
		return result;
	}
	
	public String queryIssue(QueryIssueObj obj){
		obj.setMerchantID(MerchantID);
		obj.setTimeStamp(AllpayFunction.genUnixTimeStamp());
		log.info("queryIssue params: " + obj.toString());
		String result = "";
		String CheckMacValue = "";
		try{
			VerifyQueryIssue verify = new VerifyQueryIssue();
			queryIssueUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(obj);
			CheckMacValue = AllpayFunction.genCheckMacValue(HashKey, HashIV, obj);
			log.info("queryIssue generate CheckMacValue: " + CheckMacValue);
			String httpValue = AllpayFunction.genHttpValue(obj, CheckMacValue);
			log.info("queryIssue post String: " + httpValue);
			result = AllpayFunction.httpPost(queryIssueUrl, httpValue, "UTF-8");
		} catch(AllpayException e){
			e.ShowExceptionMessage();
			log.error(e.getNewExceptionMessage());
			throw new AllpayException(e.getNewExceptionMessage());
		}
		return result;
	}
	
	public String queryAllowance(QueryAllowanceObj obj){
		obj.setMerchantID(MerchantID);
		obj.setTimeStamp(AllpayFunction.genUnixTimeStamp());
		log.info("queryAllowance params: " + obj.toString());
		String result = "";
		String CheckMacValue = "";
		try{
			VerifyQueryAllowance verify = new VerifyQueryAllowance();
			queryAllowanceUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(obj);
			CheckMacValue = AllpayFunction.genCheckMacValue(HashKey, HashIV, obj);
			log.info("queryAllowance generate CheckMacValue: " + CheckMacValue);
			String httpValue = AllpayFunction.genHttpValue(obj, CheckMacValue);
			log.info("queryAllowance post String: " + httpValue);
			result = AllpayFunction.httpPost(queryAllowanceUrl, httpValue, "UTF-8");
		} catch(AllpayException e){
			e.ShowExceptionMessage();
			log.error(e.getNewExceptionMessage());
			throw new AllpayException(e.getNewExceptionMessage());
		}
		return result;
	}
	
	public String queryIssueInvalid(QueryIssueInvalidObj obj){
		obj.setMerchantID(MerchantID);
		obj.setTimeStamp(AllpayFunction.genUnixTimeStamp());
		log.info("queryIssueInvalid params: " + obj.toString());
		String result = "";
		String CheckMacValue = "";
		try{
			VerifyQueryIssueInvalid verify = new VerifyQueryIssueInvalid();
			queryIssueInvalidUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(obj);
			CheckMacValue = AllpayFunction.genCheckMacValue(HashKey, HashIV, obj);
			log.info("queryIssueInvalid generate CheckMacValue: " + CheckMacValue);
			String httpValue = AllpayFunction.genHttpValue(obj, CheckMacValue);
			log.info("queryIssueInvalid post String: " + httpValue);
			result = AllpayFunction.httpPost(queryIssueInvalidUrl, httpValue, "UTF-8");
		} catch(AllpayException e){
			e.ShowExceptionMessage();
			log.error(e.getNewExceptionMessage());
			throw new AllpayException(e.getNewExceptionMessage());
		}
		return result;
	}
	
	public String queryAllowanceInvalid(QueryAllowanceInvalidObj obj){
		obj.setMerchantID(MerchantID);
		obj.setTimeStamp(AllpayFunction.genUnixTimeStamp());
		log.info("queryAllowanceInvalid params: " + obj.toString());
		String result = "";
		String CheckMacValue = "";
		try{
			VerifyQueryAllowanceInvalid verify = new VerifyQueryAllowanceInvalid();
			queryAllowanceInvalidUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(obj);
			CheckMacValue = AllpayFunction.genCheckMacValue(HashKey, HashIV, obj);
			log.info("queryAllowanceInvalid generate CheckMacValue: " + CheckMacValue);
			String httpValue = AllpayFunction.genHttpValue(obj, CheckMacValue);
			log.info("queryAllowanceInvalid post String: " + httpValue);
			result = AllpayFunction.httpPost(queryAllowanceInvalidUrl, httpValue, "UTF-8");
		} catch(AllpayException e){
			e.ShowExceptionMessage();
			log.error(e.getNewExceptionMessage());
			throw new AllpayException(e.getNewExceptionMessage());
		}
		return result;
	}
	
	public String invoiceNotify(InvoiceNotifyObj obj){
		obj.setMerchantID(MerchantID);
		obj.setTimeStamp(AllpayFunction.genUnixTimeStamp());
		log.info("invoiceNotify params: " + obj.toString());
		String result = "";
		String CheckMacValue = "";
		try{
			VerifyInvoiceNotify verify = new VerifyInvoiceNotify();
			invoiceNotifyUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(obj);
			obj.setNotifyMail(AllpayFunction.urlEncode(obj.getNotifyMail()));
			CheckMacValue = AllpayFunction.genCheckMacValue(HashKey, HashIV, obj);
			log.info("invoiceNotify generate CheckMacValue: " + CheckMacValue);
			String httpValue = AllpayFunction.genHttpValue(obj, CheckMacValue);
			log.info("invoiceNotify post String: " + httpValue);
			result = AllpayFunction.httpPost(invoiceNotifyUrl, httpValue, "UTF-8");
		} catch(AllpayException e){
			e.ShowExceptionMessage();
			log.error(e.getNewExceptionMessage());
			throw new AllpayException(e.getNewExceptionMessage());
		}
		return result;
	}
	
	public String checkMobileBarCode(CheckMobileBarCodeObj obj){
		obj.setMerchantID(MerchantID);
		obj.setTimeStamp(AllpayFunction.genUnixTimeStamp());
		if(obj.getBarCode().contains("+")){
			String tmp = obj.getBarCode().replaceAll("\\+", " ");
			obj.setBarCode(tmp);
		}
		log.info("checkMobileBarCode params: " + obj.toString());
		String result = "";
		String CheckMacValue = "";
		try{
			VerifyCheckMobileBarCode verify = new VerifyCheckMobileBarCode();
			checkMobileBarCodeUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(obj);
			CheckMacValue = AllpayFunction.genCheckMacValue(HashKey, HashIV, obj);
			log.info("checkMobileBarCode generate CheckMacValue: " + CheckMacValue);
			String httpValue = AllpayFunction.genHttpValue(obj, CheckMacValue);
			log.info("checkMobileBarCode post String: " + httpValue);
			result = AllpayFunction.httpPost(checkMobileBarCodeUrl, httpValue, "UTF-8");
		} catch(AllpayException e){
			e.ShowExceptionMessage();
			log.error(e.getNewExceptionMessage());
			throw new AllpayException(e.getNewExceptionMessage());
		}
		return result;
	}
	
	public String checkLoveCode(CheckLoveCodeObj obj){
		obj.setMerchantID(MerchantID);
		obj.setTimeStamp(AllpayFunction.genUnixTimeStamp());
		log.info("checkLoveCode params: " + obj.toString());
		String result = "";
		String CheckMacValue = "";
		try{
			VerifyCheckLoveCode verify = new VerifyCheckLoveCode();
			checkLoveCodeUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(obj);
			CheckMacValue = AllpayFunction.genCheckMacValue(HashKey, HashIV, obj);
			log.info("checkLoveCode generate CheckMacValue: " + CheckMacValue);
			String httpValue = AllpayFunction.genHttpValue(obj, CheckMacValue);
			log.info("checkLoveCode post String: " + httpValue);
			result = AllpayFunction.httpPost(checkLoveCodeUrl, httpValue, "UTF-8");
		} catch(AllpayException e){
			e.ShowExceptionMessage();
			log.error(e.getNewExceptionMessage());
			throw new AllpayException(e.getNewExceptionMessage());
		}
		return result;
	}
}
