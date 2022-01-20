import java.util.Scanner;
import java.util.*;
class Arrange_Size
{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string :");
    String s = sc.nextLine();
    String w="",sent="";
    StringTokenizer st=new StringTokenizer(s); 
    int n=st.countTokens(); String a[]=new String[n];
    int i=0;
    while(st.hasMoreTokens())
    {
        w=st.nextToken();
        a[i]=w;
        i++;
    }
    String temp;
    for (int j = 0; j < n - 1; j++)
    {
        for (int k = j + 1; k < n; k++)
        {
            if (a[j].length()>a[k].length())
            { 
                temp = a[j];
                a[j] = a[k];
                a[k] = temp;
            }
            else if (a[j].length()==a[k].length()){
            if (a[j].compareTo(a[k])>0)
            {
                temp = a[j];
                a[j] = a[k];
                a[k] = temp;
            }
        }
    }
    }
    System.out.println("Sorted string is :");
    for(i=0;i<n;i++){
    System.out.print(a[i]+" ");
    }
    }
}