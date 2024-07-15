abstract class one  //we can't create obj for abstract class
{
    /*not all the methods in abstract class is abstract, abstract method want to mention it as abstract */
    abstract void get();
    abstract void put();
     public void show() 
     //it will accept non-abstract method and abstract method
    {
        System.out.println("welcome");
    }
}

abstract class two extends one
{
    abstract void put();
    
    
}
class three extends two
{
    public void get()
    {
        System.out.println("bye");
    }
    public void put()
    {
    System.out.println("hi");
    }
}
public class Abstract
{
    public static void main(String[] args) 
    {
        three t = new three();
        t.get();
        t.show();
        t.put();
    }   
}