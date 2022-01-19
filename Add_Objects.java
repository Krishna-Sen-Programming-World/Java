import java.util.Scanner;
class Add_Objects
{
    public static void main(String args[])
    {
        Time t1=new Time();
        Time t2=new Time();
        t1.input();
        t2.input();
        t1.show();
        t2.show();
        Time t3=new Time();
        t3.add(t1,t2);
        t3.show();
    }
}
import java.util.Scanner;
class Time
{
    int hour,min;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the time");
        hour=sc.nextInt();
        min=sc.nextInt();
    }
    void show()
    {
        System.out.println("The time is "+hour+":"+min);
    }
    void add(Time t1,Time t2)
    {
        hour=t1.hour+t2.hour;
        min=t1.min+t2.min;
        hour=hour+min/60;
        min=min%60;
    }
}