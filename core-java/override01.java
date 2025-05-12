final class Emp {
    void fun() {
        System.out.println("This is fun method of final class Emp");
    }
}


class Manager extends Emp {
    void fun() {
        System.out.println("This is fun method of Manager");
    }
}

class Demo {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.fun();
    }
}
