class School {

	String Name;
	String  SchoolType;
	String Board_of_school;
	String Medium_of_school;
	String Location;
	int SchoolCode;
	String Mbno;


	//create constructer
	School(String Name, String SchoolType, String Board_of_School, String Medium_of_school, String Location, int SchoolCode, String Mbno) {
		this.Name = Name;
		this.SchoolType = SchoolType;
		this.Board_of_school = Board_of_School;
		this.Medium_of_school = Medium_of_school;
		this.Location = Location;
		this.SchoolCode = SchoolCode;
		this.Mbno = Mbno;
	
	}


	//print data function
	void PrintData() {
	System.out.println(this.Name);
	System.out.println(this.SchoolType);
	System.out.println(this.Board_of_school);
	System.out.println(this.Medium_of_school);
	System.out.println(this.Location);
	System.out.println(this.SchoolCode);
	System.out.println(this.Mbno);
		
	}


	public static void main(String args[]) {
	

	//create object
	School  S1 = new School("Amrutvahini","Private", "CBSC", "English", "Ghulewadi", 54321, "9087654321");

	School S2 = new School("Shramik", "Aided", "ICSC", "English","Sangamner", 12345, "1234567890" );

	School S3 = new School("Loknete", "Private", "CBSE", "Marathi", "Pune", 67890, "9876543210");
	School S4 = new School("Vidya Mandir", "Government", "State Board", "Hindi", "Nashik", 24680, "9012345678");
	

	S1.PrintData();
	System.out.println();
	S2.PrintData();
	System.out.println();
	S3.PrintData();
	System.out.println();
	S4.PrintData();
	System.out.println();
	}

}
