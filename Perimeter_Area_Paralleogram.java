import java.util.Scanner;
class Perimeter_Area_Paralleogram
{
    public static void main(String args[])
    {
        double x,y,z;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length,breadth,height");
        x=sc.nextDouble();
        y=sc.nextDouble();
        z=sc.nextDouble();
        Area obj=new Area(x,y,z);
        obj.doArea();
        obj.show();
    }
}
class Area extends Perimeter
{ 
    double h;
    double area;
    public Area(double length, double width, double height)
    {
        super(length, width);
        h = height;
        area = 0.0;
    }
    public void doArea()
    {
        area = b * h;
    }
    public void show()
    {
        super.show();
        System.out.println("Height: " + h);
        System.out.println("Area: " + area);
    }
}
class Perimeter
{
    double a;
    double b;
    public Perimeter(double length, double width)
    {
        a = length;
        b = width;
    }
    public double calculate()
    {
        return 2.0 * (a + b);
    }
    public void show()
    {
        System.out.println("Length: " + a);
        System.out.println("Breadth: " + b);
        System.out.println("Perimeter: " + calculate());
    }
}