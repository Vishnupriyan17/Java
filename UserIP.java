import java.io.BufferedReader;
import java.io.IOException;  //this is the import for IO Exception
import java.io.InputStreamReader;
import java.util.Scanner;
public class UserIP {
    public static void main(String[] args) {
        /*in earlyier to get input from the user we use [System.in.read()] 
         * next we use inputstream and bufferreader
         * next we use Scanner
        */

        /*in System.out.println ,the class for println is printStream,out is the object of the class system
         * like wise for System.in.read 
         */
                    /*TYPE-1
                    int num = 0;
                    try{
                    num = System.in.read(); //this read get the i/p from user but it store it as ASCII value 
                    //And also this i/p method takes only one char ad i/p
                    }
                    catch(IOException e)
                    {
                        System.out.println("This is IO Exception 1");
                    }*/
        /*TYPE-2
        
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in); 
        //here (in) denotes we want to pass the value as obj,here it has inputstream obj(in)
        int num1 = 0;
        try{
        num1 = Integer.parseInt(bf.readLine());
        }
        catch(IOException e)
        {
            System.out.println("This is exception 2");
        }
        System.out.println(num1);
        bf.close();*/

        //TYPE-3
        int num = 0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println(num);

        sc.close();
    }
}
