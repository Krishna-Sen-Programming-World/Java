import java.util.Scanner;
class Array_Merge
{
    public static void main(String args[])
    {
        int m,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 limits");
        m=sc.nextInt();
        n=sc.nextInt();
        int a[]=new int[m];
        int b[]=new int[n];
        int c[]=new int[m+n];
        System.out.println("enter elements in array a:");
        for(int i=0;i<m;i++)
        a[i]=sc.nextInt();
        System.out.println("enter elements in array b:");
        for(int i=0;i<m;i++)
        b[i]=sc.nextInt();
        int k=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i]==b[j])
                c[k++]=b[j];
            }
        }
        System.out.println("The elements in array c:");
        for(int i=0;i<m;i++)
        System.out.print(c[i]+" ");
    }
}