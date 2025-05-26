abstract class Secrete {
    // abstract method has no body
    abstract void dataSecrete();


    void show() {
        System.out.println("This is a concrete method inside abstract class Secrete.");
    }
}

class Secrete2 extends Secrete {
    
    void dataSecrete() {
        System.out.println("Data is hidden and accessed securely in Secrete2.");
    }


    public static void main(String[] args) {
        Secrete obj = new Secrete2(); 
        obj.dataSecrete();
        obj.show();
    }

}