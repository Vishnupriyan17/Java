enum Status{
    Running,pending,restart,failed;
}
public class Enumswitch
{
    public static void main(String[] args) {
        Status s = Status.Running;

        switch(s)
        {
            case Running:
            System.out.println("All Good");
            break;
            case pending:
            System.out.println("Try Again");
            break;
            case restart:
            System.out.println("Please Wait");
            break;
            default:
            System.out.println("Done");
            break;
        }
    }
}