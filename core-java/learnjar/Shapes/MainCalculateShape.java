
import  Shapes.*;

public class MainCalculateShape {
    public static void main(String args[]) {

       Shape  s1 = new Shape();
        Shape.Circle c1 = s1.new Circle();  // Correct inner class usage
        System.out.println("Area of circle:"+c1.Area(20));
        System.out.println("Perimeter of Circle"+c1.Perimeter(20));

    }
}