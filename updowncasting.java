class A 
{
    public void show()
    {
        System.out.println("in A show");
    }
}
class B extends A
{
    public void show1()
    {
        System.out.println("in B show");
    }
}
public class updowncasting
{
    public static void main(String[] args) {
        

        // down and up casting defines that the creating a object with reference
        A obj = new B();
        //it is called upcasting because we creating the obj for class B by using the reference Class A(Parent class)
        B obj1 = (B) obj;
        /*here we creating the same object(obj) for reference class(B) 
        in this we use (B) before obj 
        because we actually typecasting the reference of object A to the type of object B with reference B*/
        obj.show();
        obj1.show1();
        obj1.show();
    }
}