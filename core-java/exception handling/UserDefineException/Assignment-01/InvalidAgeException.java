import java.util.Scanner;
class InvalidAgeException extends Exception {


    InvalidAgeException(String exp) {
        super(exp);
    }

    static void check(int age) throws InvalidAgeException {
        if (age < 18 ) {
            throw new InvalidAgeException("Age must be Above 18");
        } else {
            System.out.println("Login");
        }
    }


    public static void main(String args[])  {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
        check(age);
        }catch(InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

    }

}
