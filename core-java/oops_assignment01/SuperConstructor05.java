class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    double salary;

    Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}

public class SuperConstructor05 {
    public static void main(String[] args) {
        Employee emp = new Employee("vishal", 30, 75000);
    }
}
