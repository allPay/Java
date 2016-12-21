<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="AllPay.Payment.Integration.*" %>
<%@ page import="java.util.Hashtable" %>
<%@ page import="java.util.Set" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AllPay</title>
</head>
<body>
<%
	/*
 	*  廠商通知退款的範例程式碼。
 	*/
	List<String> enErrors = new ArrayList<String>();
	try {
		AllInOne oPayment = new AllInOne();
		
		/* 服務參數 */
		oPayment.ServiceMethod = HttpMethod.ServerPOST;	
		oPayment.ServiceURL = (String) session.getAttribute("AllPayURL") + "/Cashier/AioChargeback";
		oPayment.HashKey = (String) session.getAttribute("HashKey");
		oPayment.HashIV = (String) session.getAttribute("HashIV");
		oPayment.MerchantID = (String) session.getAttribute("MerchantID");
		
		/* 基本參數 */
		oPayment.ChargeBack.MerchantTradeNo = "1417670194169";
		oPayment.ChargeBack.TradeNo = "1412041316340188";
		oPayment.ChargeBack.Remark = "Test"; ;
		oPayment.ChargeBack.ChargeBackTotalAmount = new Decimal("300");
		
		Hashtable<String, String> htFeedback = new Hashtable<String, String>();		
		enErrors.addAll(oPayment.AioChargeback(htFeedback));
		
		if (enErrors.size() == 0) {
			out.println("0|" + "無回傳值(遠端服務無法回傳到測試網站, 請檢查測試的網路環境)" + "<br/>");
		} else {		
			Set<String> key = htFeedback.keySet();
			String name[] = key.toArray(new String[key.size()]);
			
			/* 執行後的回傳的基本參數 */
			String szRtnCode = "";
			String szRtnMsg = "";
			
			// 取得資料
			for(int i = 0 ; i < name.length ; i++) {
				/* 執行後的回傳的基本參數 */
				if(name[i].equals("RtnCode"))
					szRtnCode = htFeedback.get(name[i]);
				else if(name[i].equals("RtnMsg"))
					szRtnMsg = htFeedback.get(name[i]);
			}
			/* 執行後的回傳的基本參數 */
			out.println("執行後的回傳的基本參數" + "<br/>");
			out.println("RtnCode = " + szRtnCode + "<br/>");
			out.println("RtnMsg = " + szRtnMsg + "<br/>");
			out.println("<br/>");
		}	
	}
	catch (Exception e) {
		// 例外錯誤處理。
		enErrors.add(e.getMessage());
	}
	finally {
		// 回覆錯誤訊息。
	    if (enErrors.size() > 0) {
	    	out.println("0|" + enErrors);
		}	
		out.println("<br/>");
	}
%>

<form action="<%=session.getAttribute("ServerIP")%>" method="post">
	<input type="button" value="回到Allpay金流測試首頁" onClick="submit()">	
</form>

</body>
</html>