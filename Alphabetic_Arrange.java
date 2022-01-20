import java.util.Scanner;
class Alphabetic_Arrange
{
    public static void main(String args[])
    {
        String s,r="",temp="";
        int c=0,k=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sentence");
        s=sc.nextLine();
        s=s+' ';
        int l=s.length();
        for(int j=0;j<l;j++)
        {
            if(s.charAt(j)==' ')
            c++;
        }
        String a[]=new String[c];
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i)!=' ')
            r=r+s.charAt(i);
            else
            {
                a[k++]=r;
                r="";
            }
        }
        for(int j=0;j<c-1;j++)
        {
            for(int i=j+1;i<c;i++)
            {
                if(a[j].charAt(0)>a[i].charAt(0))
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("The sorted string is"); 
        for(int j=0;j<c;j++)
        System.out.print(a[j]+" ");
        System.out.print(".");
    }
}