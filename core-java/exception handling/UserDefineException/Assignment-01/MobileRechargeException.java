import java.util.Scanner;
class MobileRechargeException extends Exception {
	
	//constructer
	MobileRechargeException(String exp) {
	super(exp);
	}
	
	//function
	static void CheckRecharge(String amount) {
		
		if(amount < 10 || amount >= 50000 )
		throw new MobileRechargeException("Mobile recharge is not valid");
	} else {
		System.out.println("Login");
	}

public static void main(String args[]) {


	

}
}
