class demo{
    private int age;
    private String name;
    //if we make the data private we cant access the data outside the class but we can access the data inside the class
    //another type of access the data is by using methods
    public int getAge()
    {
        public void show()
        {

        }
        return age;
    }
    public void setAge(int a)
    {
        age = a;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
}
public class encapsulation{
    //encapsulation means a closed data we cant access that data outside the closed part
    public static void main(String[] args) {

        //here now we create an obj and call the fuction
        demo d = new demo();
        d.setAge(23);
        d.setName("Vishnu");
        d.getAge();
        
        d.getName();
        System.out.println(d.getName()+ ":" + d.getAge());
        
    }
}