enum Status{
    Running, Failed, Pending, Success;
}
public class Demo
    {
    public static void main(String a[])
    {
    int i = 5;
    Status[] ss = Status.values();
    for (Status s :ss)
    {
    System.out.println(s);
    }
}
    }