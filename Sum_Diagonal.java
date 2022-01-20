import java.util.Scanner;
class Sum_Diagonal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); int a[][]=new int[3][3]; int r=0,l=0;
        System.out.println("Enter the elements in the matrix");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            a[i][j]=sc.nextInt();
        }
        System.out.println("the original matrix");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            System.out.print(a[i][j]);
            System.out.println();
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i==j)
                l=l+a[i][j];
            }
        }
        int j=2;
        for(int i=0;i<3;i++)
        {
            if(j>=0)
            {
                r=r+a[i][j--];
            }
        }
        System.out.println("the sum of left diagonal is= "+l);
        System.out.println("the sum of right diagonal is= "+r);
    }
}