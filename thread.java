//Thread - it is nothing but the class which is used to execute multiple task at the same time
class one extends Thread
{
    public void run()
    {
        for(int i =0;i<10;i++)
        {
            System.out.println("Hi");
            try{
                Thread.sleep(10);       //it will wait for 10 ms to execute next
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        }
    }
}
class two extends Thread{
    public void run()
    {
        for(int i =0;i<10;i++)
        {
            System.out.println("Bye");
            try{
                Thread.sleep(10);   //it will wait for 10 ms to execute next 
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
            
        }
    }
}
public class thread 
{
    public static void main(String[] args) {
        one a = new one();
        two b = new two();

        a.start(); //start is the fun which is used to run the thread
        try{
            Thread.sleep(6);
    }
    catch(InterruptedException e){
        e.printStackTrace();
    }
        
        b.start();
    }
}
