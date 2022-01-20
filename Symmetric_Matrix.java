import java.util.Scanner;
class Symmetric_Matrix
{
    public static void main(String args[])
    {
        int m;
        boolean flag=true;
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the order of matrix"); 
        m=sc.nextInt();
        int a[][]=new int [m][m];
        int b[][]=new int [m][m];
        if(m>2&&m<10)
        {
            System.out.println("fill the matrix");
            for(int i=0;i<m;i++) 
            {
                for(int j=0;j<m;j++)
                a[i][j]=sc.nextInt();
            }
            System.out.println("the original matrix");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                System.out.print(a[i][j]);
                System.out.println();
            }
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                b[j][i]=a[i][j];
            }
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(a[i][j]!=b[i][j])
                    {
                        flag=false;
                        break;
                    }
                }
            }
            if(flag==false)
            System.out.println("THE GIVEN MATRIX ISN'T SYMMETRIC");
            else
            System.out.println("THE GIVEN MATRIX IS SYMMETRIC");
        }
        else
        System.out.println("MATRIX SIZE OUT OF RANGE");
    }
}