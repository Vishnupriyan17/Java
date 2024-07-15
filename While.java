class While
{
    public static void main(String[] args)
    {
          int i = 0;
          while(i<=5) //while loop
          {
            System.out.println("hi"+i);
            int j=1;
            while(j<=1) //nested loop
            {
                System.out.println("hello");
                j++;
            }
            i++;
          }
          System.out.println(i);
    }
}