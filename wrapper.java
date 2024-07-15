public class wrapper {
    public static void main(String[] args) 
    {
            int num = 7;
            Integer num1 = num; // autoboxing  storing primitive datatype to obj reference
            int num2 = num1; // auto-unboxing    storing value of obj reference to primitive datatype

            System.out.println(num2);

            String str = "12";  //we get a string
            int num3 = Integer.parseInt(str);   //now we parse the string to int using wrapper class
            System.out.println( num3*2);
            
    }
}
