class Student {
    private int rollNo;
    private String name;
    private int marks;

    // Setter for rollNo
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // Getter for rollNo
    public int getRollNo() {
        return rollNo;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for marks with validation
    public void setMarks(int marks) {
        if (marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks. Marks should be 100 or less.");
        }
    }

    // Getter for marks
    public int getMarks() {
        return marks;
    }
}

class settergetter07 {
    public static void main(String[] args) {
        Student s = new Student();

        s.setRollNo(101);
        s.setName("Rahul");
        s.setMarks(95);
        System.out.println("Marks: " + s.getMarks());

        s.setMarks(120);   
    }
}
