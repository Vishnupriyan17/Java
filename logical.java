class logical
{
    public static void main(String[] args)
    {
        float x = 3.5f;
        float y = 4.5f;

        int a = 4;
        int b =5;

       /* (&&) - AND operator it return true if both exp are true*/
       boolean result = x < y && a < b /*(here you can add more conditions)*/;
       System.out.println(result);
       // (||) - OR operator it return true if one exp is true
       boolean result1 = x < y || a > b /*(here you can add more conditions)*/;
       System.out.println(result1);
    }
}