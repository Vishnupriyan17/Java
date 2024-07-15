public class foreach {
    int num;
    String name;
    public static void main(String args[])
    {
        foreach f = new foreach();
        f.num = 56;
        f.name = "vishnu";

        foreach f1 = new foreach();
        f1.num = 56;
        f1.name = "hari";

        foreach fo[] = new foreach[2];
        fo[0] = f;
        fo[1] = f1;

        for(foreach each:fo)
        {
            System.out.println(each.num + ":" + each.name);
        }
    }
    
}

