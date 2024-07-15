//Thread - it is nothing but the class which is used to execute multiple task at the same time
class one extends Thread
{
    public void run()
    {
        for(int i =0;i<10;i++)
        {
            System.out.println("Hi");
        }
    }
}
class two extends Thread{
    public void run()
    {
        for(int i =0;i<10;i++)
        {
            System.out.println("Bye");
        }
    }
}
public class thread 
{
    public static void main(String[] args) {
        one a = new one();
        two b = new two();

        a.start(); //start is the fun which is used to run the thread
        b.start();
    }
}
