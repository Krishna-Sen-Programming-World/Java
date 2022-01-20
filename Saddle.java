import java.util.*;
class Saddle
{
    static boolean findSaddlePoint(int mat[][], int n)
    {
        for(int i = 0; i < n; i++)
        {
            int min_row = mat[i][0], col_ind = 0; 
            for(int j = 1; j < n; j++)
            {
                if(min_row > mat[i][j])
                {
                    min_row = mat[i][j];
                    col_ind = j;
                }
            }
            int k;
            for (k = 0; k < n; k++)
            {
                if (min_row < mat[k][col_ind])
                break;
            }
            if (k == n)
            {
                System.out.println("Value of Saddle Point : " + min_row);
                return true;
             }
        }
        return false;
    }
    public static void main(String[] args)
    { 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter size of array :"); 
        int n=sc.nextInt();
        int mat[][]=new int[n][n];
        System.out.println("Enter the elements of array :");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("The source array:");
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++) 
            System.out.print(mat[i][j]); 
            System.out.println();
        }
        if (findSaddlePoint(mat, n) == false) 
        System.out.println("No Saddle Point ");
    }
}