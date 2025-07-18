class Student {
	int rollno;
	String name;
	
	Student(int rollno, String name) {
	this.rollno = rollno;
	this.name = name;
	}
	class String toString() {
		return rollno + "\t" + name;
	}
	
	public static void main(String args[]) {
		Student s = new Student(12, "aditya");
		System.out.println("Student Details");
		System.out.println(s); //call by toString
	}
}