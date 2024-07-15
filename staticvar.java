class demo
{
    String name;
    String model;
    static String performance;
    /*now these variables are instance(if i change the performance var to static)following is the result
    output:
            maruthi:2018:good
            maruthi:2016:good*/
    public void show()
    {
        
        System.out.println(name+ ":" + model + ":" + performance);
    }

    //this is static method
    public static void show1(demo d)
    {
        System.out.println(d.name+ ":" +d.model + ":" + performance);
        /*here we can't able to print name,model bcoz it is instance var
         (1) instance variable can't be access at static method
         (2) but static var can be access at both methods*/
    }
}
public class staticvar {
    public static void main(String[] args) {
        
        demo d1 = new demo();
        d1.name="maruthi";
        d1.model="2018";
        demo.performance="bad";//static var can be call with their class name        
       

        demo d2 = new demo();
        d2.name="maruthi";
        d2.model="2016";
        //if i make the performance as instance var i need to call with their class obj here also.
        d1.show();
        //d2.show();

        demo.show1(d2);
    }
}
