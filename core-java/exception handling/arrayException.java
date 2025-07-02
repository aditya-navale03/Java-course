class Exp1 {

    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5};

        try {
        System.out.println(a[2]);
        } 
        catch(Exception e) {
            System.out.println("the array is out of bound");
        }
    }
}
