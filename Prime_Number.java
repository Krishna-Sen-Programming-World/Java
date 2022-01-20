import java.util.Scanner;
class Prime_Number
{
    public static void main(String args[])
    {
        int n,x;
        Scanner sc=new Scanner(System.in); 
        System.out.println("enter a number"); 
        n=sc.nextInt();
        Prime obj=new Prime();
        x=obj.Prime(n,2);
        if(x==1)
        System.out.println(n+" is a prime number"); 
        else
        System.out.println(n+" isn't a prime number");
    }
}