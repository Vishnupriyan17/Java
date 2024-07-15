public class AnonyAbstract {
    public static void main(String[] args) {
        A a = new A()   
        //we cant create obj for abstract class but here is possible
        //dont put (;) here after obj creation
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
abstract class A{
    public abstract void show();   //this is the normal class and method
    /*{
        System.out.println("in class A show");
    }*/
}
