import java.util.Scanner;
class Diagonal
{
    public static void main(String args[]) 
    {
        int m,n,c=0,d=0,b=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limits of the matrix");
        m=sc.nextInt();
        n=sc.nextInt();
        int a[][]=new int[m][n];
        System.out.println("enter the elements in the matrix");
        for(int i=0;i<m;i++) 
            for(int j=0;j<n;j++) 
            a[i][j]=sc.nextInt(); 
        System.out.println("the matrix is:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            System.out.print(a[i][j]);
            System.out.println();
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    if(a[i][j]==0)
                    b++;
                    else if(a[i][j]!=0)
                    c++;
                }
                else
                {
                    if(a[i][j]==0)
                    d++;
                }
            }
        }
        if(c==(m-b)&&d==((m*n)-m)&&b!=m)
        System.out.print("It is a diagonal matrix");
        else
        System.out.print("It isn't a diagonal matrix");
    }
}