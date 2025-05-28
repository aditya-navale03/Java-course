interface bank {

    void withdraw();
    void deposit();
    void checkSum();
    void first();
    void second();
    void loan();
    void emi();

};

class Sbi_bank implements bank {

    public void withdraw() {
        System.out.println("withdraw");
    }

    public void deposit() {
         System.out.println("deposit");
    }

    public void checkSum() {
         System.out.println("checksum");
    }

    public void first() {
         System.out.println("first");
    }

    public void second() {
         System.out.println("second");
    }

    public void loan() {
         System.out.println("loan");
    }

    public void emi() {
         System.out.println("EMI");
    }

public static void main(String args[]) {

    Sbi_bank s1 = new Sbi_bank();
    s1.checkSum();
    s1.deposit();
    s1.emi();
    s1.withdraw();

}

}