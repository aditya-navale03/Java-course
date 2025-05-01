import java.util.Scanner;

class Person {
    String name;
    int age;
    String gender;
}

class Student extends Person {
    int id;
    boolean isPass;
    private int  Reg_no;
    static String institute = "Thinking Minds";

    //setter for private 
    public void setreg(int Reg_no) {
    
    	this.Reg_no = Reg_no;
    
    }

    //getter for private 
    public int  getreg( ) {
    
	    return Reg_no;
    }

    // Constructor
    Student(int id, String name, int age, String gender, boolean isPass) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isPass = isPass;
    }

    void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Institute: " + institute);
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Passed: " + isPass);
	System.out.println("registration number is:" + getreg());
    }
}

public class studmanage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = s.nextInt();
        s.nextLine(); 

        System.out.print("Enter Name: ");
        String name = s.nextLine();

        System.out.print("Enter Age: ");
        int age = s.nextInt();
        s.nextLine(); 

        System.out.print("Enter Gender: ");
        String gender = s.nextLine();

	System.out.print("enter  registration number:");
	int Reg_no = s.nextInt();

        System.out.print("Did the student pass? (true/false): ");
        boolean isPass = s.nextBoolean();

        Student student = new Student(id, name, age, gender, isPass);
	
	student.setreg(Reg_no);

        student.display();
    }
}
