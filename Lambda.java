@FunctionalInterface   //it is the annotation which defines that there only one fun in the interface
//lambda use only in functionalinterface
interface A{
        //iterface contains the method declarationm
        public void show(int i);
    
}
public class Lambda {
    public static void main(String[] args) {
        //now we cant create an obj for interface ,but we can create through implementing the interface into class
        //but using lambda we can create a reference for interface and call the method
        /*A obj = new A()
        
        {
            public void show()  
            {
                System.out.println();
            }
        };
        this is the anonymous inner class,
        through this we can access the show method and create reference for interface */


        //but the another type is using lambda fun and also lambda expression use only in functionalinterface
            A obj = (i) -> System.out.println("in show "+ i);        //(->)  this is lambda fun
            //here we can pass the value 
            obj.show(5);

            /*suppose we need to add two num we want to pass two values
             * and the fun is return type(int) ,if there is only one stamt no need to put return
             * eg:
             *      A obj = (i,j) -> return i+j;
             *      instesd of we put A obj = (i,j) -> i+j;
            */

    }
}
