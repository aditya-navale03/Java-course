import java.util.Scanner;
class InvalidMarksException extends Exception {

InvalidMarksException(String exp)  {
super(exp);
}

static void checkMarks(int marks) throws InvalidMarksException {
	if (marks < 0 || marks > 100 )  {
	throw new InvalidMarksException("Percentage is invalid");
	} else {
		System.out.println("Login");
	}
}

	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	int marks = sc.nextInt();
	try {
	
		checkMarks(marks);
		}catch(InvalidMarksException e) {
		System.out.println(e.getMessage());
		}
	
	
	
	}

}
