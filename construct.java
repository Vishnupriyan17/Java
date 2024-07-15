class demo{
    private int age;
    private String name;
    demo()     //(this is default constructor) //this is constructor which is mainly used to assign values
    {
        System.out.println("First is default constructor");
        age = 20;
        name = "Vishnu";
    }
    demo(int age,String name)  //paramaterized constructor
    {
        System.out.println("Second is parametrized constructor");
        this.age  = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
public class construct {
    public static void main(String[] args) {
        demo d = new demo();
        //here for every new obj creation constructor is executed.
        demo d1 = new demo(20,"gogul");
        System.out.println(d.getName() + ":" + d.getAge());
        System.out.println(d1.getName() + ":" + d1.getAge());
    }
}
