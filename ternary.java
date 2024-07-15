class ternary
{
    public static void main(String[] args)
    {
        int a = 5;

        //to find the number is odd or even we use if else and mod(%)
        /*by using ternary operator(?:)
        (?) this represent the condition is true or false
        (:) this represent that if the  o/p is true then the first result 
        will execute if it is false second result will execute
        here the example
        this is not suitable for all if else*/
        a = a%2==0?10:20;
        System.out.println(a);
    }
}