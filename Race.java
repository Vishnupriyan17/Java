class counter
{
    int count = 0;
    public synchronized  void increment()    //synchronized is a keyword which is used to run one task at that time
    {
        count++;
    }
}
public class Race {
    
    public static void main(String[] args) throws InterruptedException {
        counter c = new counter();
        Runnable a = () -> {
            for(int i =0;i<100;i++)
            {
               c.increment();
            }
    };
        Runnable b = () -> {
            for(int i =0;i<100;i++)
            {
                c.increment();
            }
    };
        //now the start method have no idea about the obj a
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        
        t1.start(); //start is the fun which is used to run the thread
        t2.start();

        t1.join();    //join is the method which is used to wait the main thread to come back remaining thread
        t2.join();
        
        System.out.println(c.count);
    }
}

