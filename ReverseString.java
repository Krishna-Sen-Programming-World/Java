import java.util.Scanner; 
public class ReverseString 
{
    public static void main(String[] args) 
    {
        String s;
        System.out.println("Enter The string: "); 
        Scanner scanner = new Scanner(System.in); 
        s = scanner.nextLine(); 
        Rev_str obj=new Rev_str();
        obj.reverse(s);
    }
}
class Rev_str
{
    void reverse(String str)
    {
        if ((str==null)||(str.length() <= 1))
        System.out.println(str);
        else
        {
            System.out.print(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
    }
}