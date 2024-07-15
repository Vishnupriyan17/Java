/*class -> class = extends
 * interface -> class = implements
 * interface -> interface = extends
 */
interface gaggdet {

    //in interface we cant decleare the var 
    //interface only take the final and static variable
    int age = 10;
    String area = "Tamilnadu";


    void forsurf();

}
//suppose we have a another interface
interface system{
        void process();
    
    } 

//again another interface but it inhert system interface
 interface device extends system{

    
} 
//in class to inherit we use extends but in interface we use implements
class laptop implements gaggdet,system
{
    public void forsurf()
    {
        System.out.println("in lap surf");
    }
    public void process()
    {
        System.out.println("in process");
    }
}
class mobile implements gaggdet
{
    public void forsurf()
    {
        System.out.println("in mobile surf");
    }
}
class computer
{
    public void run(gaggdet a)
    {
        a.forsurf();
    }
    
}
public class Interface{
    public static void main(String[] args) {
        //now we can create reference for gaggdet
        gaggdet g = new laptop();
        gaggdet g1 = new mobile();
        computer c = new computer();
        c.run(g);
        //for accessing final and static var we dont want to create obj
        //and also we cant change the value of the final and static variable
        System.out.println(gaggdet.age);
        System.out.println(gaggdet.area);

        system s = new laptop();
        s.process();
    }
}