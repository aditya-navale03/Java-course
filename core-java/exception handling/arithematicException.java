import java.util.Scanner;
class ExceptionHandle {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

       int  a = sc.nextInt();
       int  b = sc.nextInt();

       try {
       int c = a/b;
       } catch(Exception e) {

            System.out.println("you enterec number 0 at denominater is cannot be calculated");
       }
       
    } 
}