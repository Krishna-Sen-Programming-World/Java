import java.util.Scanner;
class Identity_Matrix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        int flag=0;
        System.out.println("Enter the elements");
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
                if(i==j&&a[i][j]==1||i!=j&&a[i][j]==0)
                flag=1;
                else
                flag=0;
            }
        }
        if(flag==1)
        System.out.println("it is an identity matrix");
        else
        System.out.println("it isn't an identity matrix");
    }
}