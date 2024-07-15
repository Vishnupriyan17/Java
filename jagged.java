class jagged
{
    public static void main(String[] args)
    {
        int nums[][] = new int[3][4];    
        /*this is called multidimensiional array[3] represent 
        rows and [4] represent columns*/

        int nums1 [][] = new int[3][];

        nums1[0] = new int[6];
        nums1[1] = new int[5];
        nums1[2] = new int[4];
        /*this is called jagged array
         * in this we can change the each row by defining no of elements be there*/
        for(int i=0;i<3;i++)
        {
            for(int j = 0;j<4;j++)
            {
                nums[i][j] = (int)(Math.random() *10);  //this is the inbuilt math library in java to find ran numbers
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        int a[][][] = new int[4][5][6]; //this is 3d array
        for(int i=0;i<4;i++)
        {
            for(int j = 0;j<5;j++)
            {
                for(int k = 0;k<6;k++)
                {
                a[i][j][k] = (int)(Math.random() *10);  //this is the inbuilt math library in java to find ran numbers
                System.out.print(a[i][j][k] + " ");
                }
            }
            System.out.println();
        }
    }
}