import java.util.Scanner;
class Number_Conversion
{   
    public static void main(String args[])
    {
        int a;
        Scanner sc=new Scanner(System.in); System.out.println("enter a no"); a=sc.nextInt();
        Conversion obj=new Conversion();
        obj.dec_bin(a);
        obj.dec_oct(a);
        obj.dec_hex(a);
    }
}

import java.util.Scanner;
class Conversion
{
    void dec_bin(int n)
    { 
        String x="";
        for(int a=n;a>0;a=a/2)
        {
            x=(a%2)+x;
        }
        System.out.println("The decimal equivalent ="+x);
    }
    void dec_oct(int n)
    {
        String x="";
        for(int a=n;a>0;a=a/8)
        {
            x=(a%8)+x;
        }
        System.out.println("The octal equivalent ="+x);
    }
    void dec_hex(int n)
    {
        String x="";
        char arr[]={'A','B','C','D','E','F'}; 
        for(int a=n;a>0;a=a/16)
        {
            if(a%16>9)
                x=arr[(a%16)-10]+x;
            else
                x=(a%16)+x;
        }
        System.out.println("The hexadecimal equivalent ="+x);
    }
}