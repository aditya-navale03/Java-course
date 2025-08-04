class Rectangle {
	double length;
	double breadth;
	static int rectcount;

Rectangle(double l, double b) {

		length = l;
		breadth = b;
		rectcount++;
}
double calc_area() {
	return length * breadth;
}


		
		public static void main(String args[]) {
				
				Rectangle r1 = new Rectangle(3.2, 5.6);
				
				Rectangle r2 = new Rectangle(1.1, 7.7);
				System.out.println(rectcount + "object is created");
				
				r1.calc_area();
				r2.calc_area();
		}
	}