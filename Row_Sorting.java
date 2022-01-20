import java.util.Scanner;
class Row_Sorting
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); 
        int a[][]=new int[3][3]; 
        int t;
        System.out.println("Enter the elements");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
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
            for(int j=0;j<3-1;j++)
            {
                for(int k=0;k<3-1-j;k++)
                {
                    if(a[i][k]>a[i][k+1])
                    {
                        t=a[i][k];
                        a[i][k]=a[i][k+1];
                        a[i][k+1]=t;
                    }
                }
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            System.out.print(a[i][j]+" "); 
            System.out.println();
        }
    }
}