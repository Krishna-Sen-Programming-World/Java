import java.util.Scanner;
class Date_Valid
{
    public static void main(String args[])
    {
        String date="",r="";
        int len=0,a1=0,b1=0,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a date in format dd/mm/yyyy");
        date=sc.next();
        int a[]={31,28,31,30,31,30,31,31,30,31,30,31};
        String b[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        len=date.length();
        if(len==10)
        {
            a1=Integer.parseInt(date.substring(0,2));
            b1=Integer.parseInt(date.substring(3,5));
            c=Integer.parseInt(date.substring(6));
            if(c%100==0&&c%4==0||c%400==0||c%4==0)
            {
                if(b1!=02)
                {
                    if(a1>0||a1<32||b1>0||b1<12)
                    {
                        if(a1==1||a1==31)
                        r=a1+"st";
                        else if(a1==2)
                        r=a1+"nd";
                        else if(a1==3)
                        r=a1+"rd";
                        else
                        r=a1+"th";
                        System.out.println("date valid"+"\n"+r+" "+b[b1-1]+" "+c);
                    }
                    else
                    System.out.println("the date is invalid!");
                }
                else if(a1<0||a1>32||b1<0||b1>12) 
                System.out.println("the date is invalid!");
                else if(b1==02)
                {
                    a[1]=29;
                    if(a1==1||a1==31)
                    r=a1+"st";
                    else if(a1==2)
                    r=a1+"nd";
                    else if(a1==3)
                    r=a1+"rd";
                    else
                    r=a1+"th";
                    System.out.println("date valid"+"\n"+r+" "+b[b1-1]+" "+c);
                }
            }
            else
            System.out.println("The date is invalid!");
        }
    }
}