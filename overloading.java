class A{                    //it is an example of overloading
    public int add(int n1,int n2)
    {
        return n1+n1;
    }
}
class B extends A 
{
    public int add(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    }
}
public class overloading {
    public static void main(String[] args) {
        B obj = new B();
        int a = obj.add(2, 3);
        int b =obj.add(3,4,5);
        System.out.println(a);
        System.out.println(b);

        
        /*in this the method in  both class(A and B) are have same name but different parameter 
         * so,it is called method overloading
          */
    }
}
