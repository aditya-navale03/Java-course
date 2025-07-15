import java.util.Scanner;
class UnsufficientBalanceException extends Exception {

static int balance = 1000;

UnsufficientBalanceException(String exp) {

super(exp);
}

static void WithdrawBalance(int withdraw) throws UnsufficientBalanceException {
	if(withdraw > balance) {
	throw new UnsufficientBalanceException("withdraw amount Exceeds");
	} else {
	System.out.println("Cash-out");
	}
}

public static void main(String args[]) {

Scanner sc = new Scanner(System.in);
int amount = sc.nextInt();
	try{
	
	WithdrawBalance(amount);
	
	}catch(UnsufficientBalanceException e) {
		System.out.println(e.getMessage());
	}

	}
}
