//final -  is used for variable to make constant;method for not overriding;class for no inheritance;
final class A         //if a class is maked as final we dont able to inherit it
{
    int num = 8; 
    //now we can change the value of the variable num anywhere
    //let assume,
    final int num1 = 9;  
    //if we make the num1 as final we cant change the value of the variable
    public final void show()      
    //now this method is execute in the child class if this class is not final
    //and also we cant override (same method name and same variable) if the method is decleared as final
    //this is the concept of final keyword
    {
        System.out.println("in A show in final class and method");
    }
    public void print()
    {
        System.out.println(num + "," + num1 + " num1 is final");
    }
}
public class Final {
    public static void main(String[] args) {
        A a = new A();
        a.show();
        a.print();
    }
}
