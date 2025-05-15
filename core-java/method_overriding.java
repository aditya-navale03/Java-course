class Employee {

    void salary() {
        System.out.println("Employee salary is ₹30,000");
    }
}

class Manager extends Employee {

    void salary() {
        System.out.println("Manager salary is ₹60,000");
    }

    public static void main(String[] args) {
        Manager mgr = new Manager();
        mgr.salary(); // Calls Manager's version of salary()

        Employee emp = new Employee();
        emp.salary(); // Calls Employee's version of salary()
    }
}
