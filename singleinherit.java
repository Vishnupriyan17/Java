import java.util.Scanner;
public class singleinherit { 
    
    
    //it is both single inheritance and multilevel inheritance


    //in java there is no direct possibility of writtrn multiple ihneritance,because of ambiguity problem

    public static void main(String[] args) {
        three t = new three();
        String name = t.getname();
        int age = t.getage();
        String dob = t.getdob();
        System.out.println("Name: " + name + " Age: " + age + " DOB: " + dob);
    }
}
class two extends singleinherit{
    Scanner sc = new Scanner(System.in);
    public String getname()
    {
        String name = sc.nextLine();
        return name;
    }
    public int getage()
    {
        int age = sc.nextInt();
        return age;
    }
   
}
class three extends two{
    Scanner sc = new Scanner(System.in);
    public String getdob()
    {
        
        String dob = sc.nextLine();
        return dob;
    }
}

