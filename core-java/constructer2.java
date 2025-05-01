class Student {

	String Name;
static	String College = "AVCOE";
	int Regno;


	//constructer
	Student(String N,  int R) {
	this.Name = N;
	this.Regno = R;
	
	}

	//print all
	void print() {
	System.out.println(this.Name);
	System.out.println(College);
	System.out.println(this.Regno);
	}

	public static void main(String args[]) {
	
		Student S1 = new Student("Aditya navale", 121);
		Student S2 = new Student("Vishal Varpe", 212);
		Student S3 = new Student("Bob", 132);
	
		S1.print();
		System.out.println();
		S2.print();
		System.out.println();
		S3.print();
	}
}
