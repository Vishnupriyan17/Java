import java.util.Scanner;

public class twod {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ary[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int a=s.nextInt();
                ary[i][j]=a;
            }
        }
        for(int i = 0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(ary[i][j] + " ");
            }
            System.out.println();
        }
        s.close();
    }
}