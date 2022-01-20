import java.util.Scanner;
class Boundary_sum
{
    public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in); 
        int m,b_s=0,nb_s=0; 
        System.out.println("Enter the limit"); 
        m=sc.nextInt();
        int a[][]=new int[m][m]; 
        System.out.println("fill the matrix");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==0||i==(m-1)||j==0||j==(m-1))
                b_s=b_s+a[i][j];
                else
                nb_s=nb_s+a[i][j];
            }
        }
        System.out.println("the sum of boundary elements is-"+b_s);
        System.out.println("the sum of non-boundary elements is-"+nb_s);
    }
}