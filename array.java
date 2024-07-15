import java.util.*;
public class array {
    public static void main(String[] args) {
         int arr[] = {1,2,3,4,5};
     for(int i=0;i<5;i++)
         {
             System.out.println(arr[i]);
         }
        int arr1[]=new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<5;i++)
        {
            int a = sc.nextInt();
            arr1[i] = a;
            System.out.println(arr1[i]);

        }
        sc.close();
    }
}