package allpay.invoice.integration.exception;

public class AllpayException extends Error{
	private static final long serialVersionUID = 1L;
	String NewExceptionMessage;
	public AllpayException(String s){
		this.NewExceptionMessage = s;
	}
	public String getNewExceptionMessage() {
		return NewExceptionMessage;
	}
	public void setNewExceptionMessage(String newExceptionMessage) {
		NewExceptionMessage = newExceptionMessage;
	}
	public void ShowExceptionMessage(){
		
		System.out.println("µo¥Í¿ù»~: " + getNewExceptionMessage());
	}
}
