enum Status{
    Running,pending,restart,failed;
}
public class Enumif
{
    public static void main(String[] args) {
        Status s = Status.Running;

        if(s == Status.Running)
         System.out.println("on process");
        else if(s == Status.pending)
            System.out.println("please wait");
        else if(s == Status.restart)
            System.out.println("please restart");
        else
            System.out.println("done");
    }
}