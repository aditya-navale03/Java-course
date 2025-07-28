class Person {
String name;
int age;
//person constructer
Person(String name, int age) {
this.name = name;
this.age = age;
	}
}

class Employee extends Person {
	Integer empid;
	Double salary;

//empllyee const
Employee(String name, int age, Integer empid, Double salary) {
super(name, age);
this.empid = empid;
this.salary = salary;
}

void DisplayInfo() {
System.out.println("student data");
System.out.println(this.name);
System.out.println(this.age);
System.out.println("employee data");
System.out.println(this.empid);
System.out.println(this.salary);
}

public static void main(String args[]) {
	
	Employee e1 = new Employee("aditya",19, 101, 45000.0);
	e1.DisplayInfo();
	
}
}
