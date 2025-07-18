import java.util.Scanner;
class ProductCodeException extends Exception {

	ProductCodeException(String exp) {
	super(exp);
	}
	
	//function to check
	static void CheckCode(String m) throws ProductCodeException {
		
		if(m.length() < 4 || !m.matches("[a-zA-Z0-9]+"))	 {
		
		throw  new ProductCodeException("product code is wrong!");
		
		}		else {
		System.out.println("Login");
		}
	}
	
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	
	String code = sc.nextLine();
	
	try{
	CheckCode(code);
	} catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	
	
	}

}
