import java.util.Scanner;
class Fibonacci
{
    public static void main(String args[])
    {
        Fibonacci obj=new Fibonacci(); 
        int a,x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a limit");
        a=sc.nextInt();
        x=obj.fib(a);
        System.out.println("The fibonacci series is: "+x);
    }
    int fib(int n)
    {
        if(n<=1)
        return n;
        else
        return fib(n-1)+fib(n-2);
    }
}