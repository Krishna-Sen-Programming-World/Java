import java.util.Scanner;
class Mid_Point
{
    int x,y;
    Mid_Point()
    {
        x=0;
        y=0;
    }
    Mid_Point(int x1,int y1)
    {
        x=x1;
        y=y1;
    }
    void display()
    {
        System.out.println("co-ordinates are ( "+x+" , "+y+" )");
    }
    void mid_pt(Mid_Point pt,Mid_Point pt1)
    {
        double mid,mid1;
        mid=(pt.x+pt.y)/2.0;
        mid1=(pt1.x+pt1.y)/2.0;
        System.out.println("mid pts of the lines are "+mid+" and "+mid1);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,e;
        System.out.println("enter the first 2 points ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("enter the second 2 points ");
        c=sc.nextInt();
        e=sc.nextInt();
        Mid_Point pt=new Mid_Point(a,b);
        Mid_Point pt1=new Mid_Point(c,e);
        pt.display();
        pt1.display();
        Mid_Point pt2=new Mid_Point(0,0);
        pt2.mid_pt(pt,pt1);
    }
}