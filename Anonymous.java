public class Anonymous {
    public static void main(String[] args) {
        A a = new A()   //dont put (;) here after obj creation
        //a.show();  
        //this is normal func call

        //but in anonymous we want to give implementation after the obj creation
        {
            public void show()  
            {
                System.out.println("in new show");
            }
        };
        a.show();       //now this new show wil be called

    }
}
class A{
    public void show()   //this is the normal class and method
    {
        System.out.println("in class A show");
    }
}
