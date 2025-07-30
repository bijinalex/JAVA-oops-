package java_lab_projects;

class paymentGateway{
	public void makePayment(String cardnumber,String expiryDate,int i){
		System.out.println("Credit Card Payment");
		System.out.println("payment succesful using credit card" +cardnumber);
	}
	public void makePayment(String uplid) {
		System.out.println("UPI payments");
		System.out.println("payment Successful using UPI ID:" +uplid);
	}
	public void makePayment(double amount) {
		System.out.println("Cash On Delivery");
		System.out.println("Payment Successful using cash on delivery");
	}	
}

public class ECommerseApp {
	public static void main(String[] args) {
		paymentGateway p1 =new paymentGateway();
		
		p1.makePayment("4532 8563 0974","19-09-2028",504);
		p1.makePayment("upi@24");
		p1.makePayment(2500);
	}
}
