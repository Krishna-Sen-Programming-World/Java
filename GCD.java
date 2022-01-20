import java.util.*;
class GCD
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); int a,b,r;
        System.out.println("Enter two numbers"); a=sc.nextInt();
        b=sc.nextInt();
        GCD obj=new GCD();
        r=obj.gcd(a,b);
        System.out.println("the Greatest common divisor "+r);
    }
    int gcd(int m,int n)
    {
        if(m>=n&&m%n==0)
        return n;
        else
        return gcd(n,m%n);
    }
}