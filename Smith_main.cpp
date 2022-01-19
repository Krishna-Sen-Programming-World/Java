class Smith_main
{
    public static void main(String args[])
    {
        Smith obj=new Smith();
        obj.read();
        obj.check();
    }
}

import java.util.Scanner;
class Smith
{
    int n;
    void read()
    {
        Scanner sc=new Scanner(System.in); System.out.println("Enter a number");
        n=sc.nextInt();
    }
    int sum_of(int x)
    {
        int s=0,d;
        while(x>0)
        {
            d=x%10;
            x=x/10;
            s=s+d;
        }
        return s;
    }
    void check()
    {
        int a=n;
        int p=sum_of(a);
        int f=2;
        int sum=0;
        while(a>1)
        {
            if(a%f==0)
            {
                sum=sum+sum_of(f);
                a=a /f;
            }
            else
            {
                f++;
            }
        }
        System.out.println("the sum of the digits "+sum);
        System.out.println("the sum of the prime factors "+p);
        if(p==sum)
        System.out.println(n+" is a smith number");
        else
        System.out.println(n+" isn't a smith number");
    }
}