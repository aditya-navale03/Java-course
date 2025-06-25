class checkClone
{
    String city;
    checkClone(String n)
    {
        this.city=n;
    }
}

class Main implements Cloneable
{
    checkClone a;
    String name;

    Main(checkClone ae, String name)
    {
        this.a=ae;
        this.name=name;
    }

    public String toString()
    {
        return this.a.city+" "+this.name;
    }

    public static void main(String args[])throws Exception
    {
        checkClone a1=new checkClone("America");
        Main m1=new Main(a1,"Alice patil");
        Main m2=(Main)m1.clone();

        System.out.println(m1);
        System.out.println(m2);
    }
}
