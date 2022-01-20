import java.util.Scanner;
class Reverse_String
{
    public static void main(String args[])
    {
        String str,r="",s="",st="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        str=sc.nextLine();
        str=str+' ';
        int l=str.length();
        if(str.charAt(l-2)=='.')
        {
            for(int i=0;i<l-2;i++)
            {
                st=st+str.charAt(i) ;
            }
            st=st+' ';
            for(int j=0;j<st.length();j++)
            {
                if(st.charAt(j)!=' ')
                r=r+st.charAt(j);
                else
                {
                    s=r+' '+s;
                    r="";
                }
            }
            System.out.println("The original String "+str);
            System.out.println("The reversed String "+s+".");
        }
        else
        System.out.println("Invalid string");
    }
}