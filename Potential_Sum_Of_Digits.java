import java.util.*;
class Potential_Sum_Of_Digits
{
    static int potentialOf(String w)
    {
        char c;
        int p=0;
        for(int i=0;i<w.length();i++)
        {
            c=w.charAt(i);
            p=p+((int)c-64);
        }
        return p;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :");
        String s=sc.nextLine();
        StringTokenizer st=new StringTokenizer(s);
        int n=st.countTokens();
        String words[]=new String[n];
        int potential[]=new int[n];
        int i=0;
        String word;
        while(st.hasMoreTokens())
        {
            word=st.nextToken();
            words[i]=word;
            potential[i]=potentialOf(word);
            i++;
        }
        String temp;
        int t;
        for (int j = 0; j < n - 1; j++)
        {
            for (int k = j + 1; k < n; k++)
            {
                if (potential[j]>potential[k])
                { 
                    temp = words[j]; 
                    words[j] = words[k]; 
                    words[k] = temp;
                    t = potential[j];
                    potential[j] = potential[k];
                    potential[k] = t;
                }
             }
         }
        System.out.println("Changed string : ");
        for(i=0;i<n;i++)
        {
            System.out.print(words[i]+" ");
        }
    }
}