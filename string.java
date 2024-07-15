import java.util.Scanner;
public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String cs = "";
        String ss = "";
        //String m = sc.nextLine(); 
        // if(n.equals(m))   //.equals check the values are equal
        // {                   //== checks the address are equal
        //     System.out.println("true");
        // }
        //converting string to char and store in array

        char a[] = n.toCharArray();
        for(char c:a)       //enhanced or for each loop
        {
            if(c >= 65 && c<=90)
            {
                cs = cs+c; 
            }
            else 
            {
                ss=ss+c;
            }
        } System.out.println("Capital Alphabets: "+ cs+"  "+"Small Letters: "+ss);
        sc.close();
    }
}
