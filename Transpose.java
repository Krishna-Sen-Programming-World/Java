import java.util.Scanner;
class Transpose
{
    public static void main(String args[])
    {
        Transpose obj=new Transpose(); obj.accept();
        obj.find_transpose();
        obj.print();
    }
    int a[][],t[][],n,m;
    Transpose()
    {
        n=0;
        m=0;
    }
    Transpose(int u,int v)
    {
        m=u;
        n=u;
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Squate matrix");
        n=sc.nextInt();
        m=n;
        a=new int[m][n];
        t=new int[m][n];
        System.out.println("Enter the elements");
        for(int i=0;i<m;i++)
        for(int j=0;j<n;j++)
        a[i][j]=sc.nextInt();
    }
    void find_transpose()
    {
        for(int i=0;i<m;i++)
        for(int j=0;j<n;j++)       
        t[j][i]=a[i][j];
    }
    void print()
    {
        int flag=0;
        System.out.println("The source array:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            System.out.print(a[i][j]);
            System.out.println();
        }
        System.out.println("The transpose array:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            System.out.print(t[i][j]);
            System.out.println();
        }
    }
}