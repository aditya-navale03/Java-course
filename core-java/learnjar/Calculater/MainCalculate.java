import Calculater.*;

public class MainCalculate {
 
    
    public static void main(String args[]) {
        Calculate c1 = new Calculate();
       System.out.println("ADDITION:"+c1.add(10, 20)); 
       System.out.println("subtraction:"+c1.subtract(10, 20)); 
        System.out.println("MULTLIPLICATION:"+c1.multiply(10, 20));
        System.out.println("DIVISION:"+c1.divide(10, 20));
    }

}