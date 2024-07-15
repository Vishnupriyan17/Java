class demo{
    String name;
    String model;
    static String performance;

    public demo()   //constructor name should be in class name
    {
        name = "maruthi";
        model="2019";
        System.out.println("in constructor");//here we use this becoz of initializing the value for variables in constructor
    }

    static          //static block is used to initalize static variable
    {
        performance = "good";
        System.out.println("in static");   
        //imprtn point is static block gets 1st execute (i.e) it loads a class in class loader,it loads a class only once for object
    }

    public void show()
    {
        System.out.println(name+ ":" + model + ":" + performance);
    }
}
public class staticblock {
    public static void main(String[] args) 
    {
        demo d = new demo();
        d.show();
        demo d1 = new demo();
        d1.show();
    }
}
