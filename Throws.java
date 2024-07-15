class A{ 
    public void show() throws ClassNotFoundException   
    //this throws do if there is an error in finding the class it thrown the error to the main method to handle it
    {
        Class.forName("witch");  //this is to find the class is there with this name
    }
}
public class Throws {
    public static void main(String[] args) {
        A a = new A();
        try{
        a.show();
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("no such class");
        }
    }
}
