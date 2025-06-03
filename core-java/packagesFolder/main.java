import com.*;

public class Main {
    public static void main(String[] args) {
        A a1 = new A();
        a1.show();

        // Cannot access private method
        // forPrivate p1 = new forPrivate();
        // p1.data1(); // Error

        // Cannot access protected method directly (not subclass)
        // forProtected p2 = new forProtected();
        // p2.data2(); //  Error
    }
}


class forPro extends forProtected {
    void accessProtected() {
        data2(); // Valid because of inheritance
    }
}
