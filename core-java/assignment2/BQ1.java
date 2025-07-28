class Student {
	String name;
	Integer roll_no;
	Float marks;
	
Student(String name, Integer roll_no, Float marks) {

this.name = name;
this.roll_no = roll_no;
this.marks = marks;
}

void DisplayData() {
	System.out.println("name :"+ this.name);
	System.out.println("rollno :"+ this.roll_no);
	System.out.println("marks :"+ this.marks);
}

public static void main(String args[]) {
	
	Student s1 = new Student("aditya",23, 89.0f);
	s1.DisplayData();
		
	
}
}
