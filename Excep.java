class VishnuException extends Exception{
    public VishnuException(String s)
    {
        super(s);
    }
}
public class Excep {
    public static void main(String[] args) {
        /*there are three types of error
         * compile time - it is easy tofind
         * runtime error - execution of the program stops running  
         * logical error - error we create in logig eg:2+2= it print as 5
         * these errors are handled by the exception,in this
         * we use try and catch block
         * try-
         *      if the developer knows that this part will make error ,it is recommended to use try
         *      in this try block if there is error found it throws the error as an object
         * catch-
         *      catch is the block which catch the error which is thrown by try block as a object
            for eg:
        */
            int i = 0;
            int j = 0;
            try{
            j = 8/0;
                if(j == 0)
                {
                    throw new VishnuException("something went wrong ");
                }
            }
            catch(VishnuException e)
            {
                System.out.println("no problem");
            }
            //anything div by 0 is infinity ,so it has a chance to make error so it is recommended to put it in a try block
            //always the catch should come after the try block
            catch(Exception e)  //this is the obj to catch the errors in try block
            {
                System.out.println("something went wrong....");
            }
            System.out.println(j);
    }
}
