import java.util.*;
class Evil_Number
{
    static int convBinary(int n)
    {
        int bin=0;
        while(n>0)
        {
            bin=bin*10+(n%2);
            n=n/2;
        }
        return bin;
    }
    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        System.out.print("INPUT A NUMBER : "); 
        int n=sc.nextInt();
        int binary = convBinary(n);
        int c=0,d,copy=binary;
        while(binary>0)
        {
            if((binary%10)==1)
            c++;
            binary=binary/10;
        }
        System.out.println("INPUT : "+n);
        System.out.println("BINARY EQUIVALENT : "+copy);
        System.out.println("NUMBER OF 1's : "+c);
        System.out.print("OUTPUT : ");
        if(c%2==0)
        System.out.println("EVIL NUMBER");
        else
        System.out.println("NOT EVIL NUMBER");
    }
}