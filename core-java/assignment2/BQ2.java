class Box {
Integer length;
Integer width;


Box(Integer length, Integer width) {
this.length = length;
this.width = width;
}

void CalculateArea() {
int area = length * width;
System.out.println(area);
}

public static void main(String args[]) {
Box b1 = new Box(5, 5);
b1.CalculateArea();

}
}
