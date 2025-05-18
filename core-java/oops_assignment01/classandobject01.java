class Laptop {
  String  brand;
  String  model;
  int  price;

Laptop(String b, String m, int p) {
    this.brand = b;
    this.model = m;
    this.price = p;
}

void ShowDetail() {
    System.out.println(this.brand);
    System.out.println(this.model);
    System.out.println(this.price);
}


    public static void main(String args[]) {
        Laptop l =new Laptop("Lenovo","DEIP",123);
        Laptop l1= new Laptop("dell","SEIP",2312);
        l.ShowDetail();
        System.out.println("");
        l1.ShowDetail();
    
    }
}