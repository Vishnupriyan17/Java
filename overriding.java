class A{                            //It is an example of runtime polymorphisim
    public int show(int a)
    {
        System.out.println("in a show()");
        return a;
    }
    public int print(int a1)
    {
        System.out.println("in a print()");
        return a1;
    }
}
class B extends A{
    public int show(int a) //here this method with same name and same argument which in class A
    {
        System.out.println("in b show()");
        return a;
    }
    public int display(int b1)
    {
        System.out.println("in b display()");
        return b1;
    }
}
public class overriding {
    public static void main(String[] args) {
        B obj = new B();
        int c = obj.show(2); 
        System.out.println(c);
        int d = obj.print(3);
        System.out.println(d);
        /*this fun call the show() methos in class B ,
        because it first give preference to the obj class and then to parent class*/
        //This is called method overriding

        /*suppose we create a obj for class A 1st it call show() method in class A */
    }
}
