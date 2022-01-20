import java.util.Scanner;
class Alphabet_Frequency
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any string: ");
        String s = sc.nextLine();
        s=s.toLowerCase();
        int l=s.length();
        char ch;
        System.out.println("Output:");
        System.out.println("==========================");
        System.out.println("Alphabet\tFrequency");
        System.out.println("==========================");
        int count=0;
        for(char i='a'; i<='z'; i++)
        {
            count = 0;
            for(int j=0; j<l; j++)
            {
                ch=s.charAt(j);
                if(ch==i)
                count++;
            }
            if(count!=0)
            {
                System.out.println(i+"\t\t"+count);
            }
        }
    }
 }