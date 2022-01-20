import java.util.Scanner;
class Circular_Prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); 
        int a,c=0,d=0,f=0,e=0,s=0,g=0,r=0,k=0; 
        System.out.println("Enter a number"); 
        a=sc.nextInt();
        for(int b=a;b>0;b=b/10)
        c++;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            d++;
        }
        if(d==2)
        {
            int b=a;
            s=b;
            for(int i=1;i<=c;i++)
            {
                e=s%(int)Math.pow(10,c-1);
                g=s/(int)Math.pow(10,c-1);
                s=(e*10)+g;
                for(int j=1;j<=s;j++)
                {
                    if(s%j==0)
                    r++;
                }
                if(r!=2)
                k=1;
                r=0;
            }
            if(k==1)
            System.out.println(a+" is not a circular prime no");
            else
            System.out.println(a+" is a circular prime no");
        }
        else
        System.out.println(a+" isn't a circular prime no");
    }
}