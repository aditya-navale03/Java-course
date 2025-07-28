class ConvertStringToInt {
String inputString;

ConvertStringToInt(String inputString) {
this.inputString = inputString;
}


public static void main(String args[]) {


ConvertStringToInt con = new ConvertStringToInt("1");

int newNumber = Integer.parseInt(con.inputString);
int result = newNumber + 10;
System.out.println(result);

}
}
