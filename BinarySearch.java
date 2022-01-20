import java.util.Scanner;
class BinarySearch
{
    public static void main (String args[])
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :"); 
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of the array in asscending order : ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the number to search :");
        int num=sc.nextInt();
        int l=0,h=n-1,m,flag=0;
        do
        {
            m=(l+h)/2;
            if(a[m]==num)
            {
                flag=1;
                break;
            }
            else if(num>a[m])
            l=m+1;
            else if(num<a[m])
            h=m-1;
        }while(l<=h);
        if(flag==1)
        System.out.println("Number found at position"+m);
        else
        System.out.println("Not found..");
    }
}