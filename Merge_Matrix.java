import java.util.Scanner;
class Merge_Matrix
{
    public static void main(String args[])
    {
        int k,x,d=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 limits");
        k=sc.nextInt();
        x=sc.nextInt();
        int A[]=new int[k];
        int B[]=new int[x];
        int C[]=new int[k+x];
        System.out.println("enter elements in a");
        for(int i=0;i<k;i++)
        A[i]=sc.nextInt();
        System.out.println("enter elements in b");
        for(int i=0;i<x;i++)
        B[i]=sc.nextInt();
        for(int i=0;i<k;i++)
        {
        C[d++]=A[i];
        }
        for(int i=0;i<x;i++)
        {
        C[d++]=B[i];
        }
        System.out.println("enter elements in c");
        for(int i=0;i<k+x;i++)
        System.out.print(C[i]);
    }
}