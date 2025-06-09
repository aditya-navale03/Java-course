package Calculater;

public class Shape {
    static float PI = 3.14f; 

    public class Circle {
        public float Area(float r) {
            return PI * r * r; // Area = πr²
        }

        public float Perimeter(float r) {
            return 2 * PI * r; // Perimeter = 2πr
        }
    }
}
