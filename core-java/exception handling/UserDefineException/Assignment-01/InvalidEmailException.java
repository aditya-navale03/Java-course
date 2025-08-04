import java.util.Scanner;
class InvalidEmailException extends Exception {

InvalidEmailException(String exp)  {
super(exp);
}

static void mail(String m) throws InvalidEmailException {
	if(!m.contains("@gmail.com")) {
		throw new InvalidEmailException("mail is incorrect");
	} else {
	System.out.println("Login");
	}
}

public static void main(String args[]) {

Scanner sc= new Scanner(System.in);

String user = sc.nextLine();

try {
	mail(user);
}catch(InvalidEmailException e) {
System.out.println(e.getMessage());
}

}
}
