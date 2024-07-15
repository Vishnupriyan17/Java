import java.util.Scanner;

class demo{

    private int age/*instance variable */;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age/*local variable */) {
        this.age = age;     
        /*here we can pass the arg age ,and (age = age),but here java can confuse which is local var and instance var. 
        so,this is keyword used, which represent the current object*/
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class Thistype {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String name = sc.nextLine();
        demo d = new demo();
        d.setAge(age);
        d.setName(name);
        System.out.println(d.getName()+ ":" + d.getAge());
        sc.close();
    }
}
