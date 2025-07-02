
class NullException {

    public static void main(String args[]) {

        String Str = null;

        try{
        System.out.println(Str.length());
        }
        catch(Exception e) {
            System.out.println("cannot find length due to null value");
        }
    }
}