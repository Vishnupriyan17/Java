class a
{
    a() //default constructor
    {
        /*in this the super() represent the super class of (a)  but (a) does not extend any class,but it is wrong ,by default 
        it extend object class, if we does not mentioned also*/
        super();
        System.out.println("default a");
    }
    a(int n) //parametrized constructor
    {
        super();
        System.out.println("paramaterized a");
    }
}
class b extends a
{
    b()  //default constructor
    {
        super();
        System.out.println("default b");
    }
    b(int n)  //parametrized constructor
    {
        this(); //it represent the this class default constructor to execute
        System.out.println("paramaterized b");
    }
}
public class THIS {
    public static void main(String[] args) {
        //creating the obj for class b
        b B = new b(5);
        /*here are some conditions
         * if we create a obj without any arg it call both the default constructor (a,b)
         * if we pass the arg it call the paramaterized constructor in (b class ) but not in a
         * if we want to print both classes parametrized constructor we use the keyword[super()]
         * the function of the super keyword is to call the constructor of its super class
         * if we pass arg in super it call the parametrized constructor
         */
    }
}





/*o/p:

default a
default b
paramaterized b*/

