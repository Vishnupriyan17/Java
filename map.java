import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<String,Integer> student = new HashMap<String,Integer>();
        student.put("vishnu", 23);    //hashmap store the values in (key,values)
        student.put("kiran", 20); 
        student.put("pavi", 18); 
        student.put("raj", 78); 

        System.out.println(student.keySet());   //show the key in the o/p

        for(String key : student.keySet())
        {
            System.out.println(key + ":" + student.get(key));    //show key with values in o/p
        }
    }
}
