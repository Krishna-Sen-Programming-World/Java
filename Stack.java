import java.util.Scanner;
class Stack
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the stack");
        int s=sc.nextInt();
        Stack obj=new Stack(s);
        System.out.println("\n 1.push \t 2. pop \t 3.display \t 4. Exit");
        boolean flag=true;
        while(flag)
        {
            System.out.println("\nEnter your choice:");
            int c=sc.nextInt();
            switch(c)
            {
                case 1:
                System.out.println("Enter an element for insertion");
                int x=sc.nextInt();
                obj.push(x);
                break;
                case 2:
                obj.pop();
                break;
                case 3:
                obj.display();
                break;
                case 4:
                flag=false;
                break;
                default:
                System.out.println("Please enter a valid choice");
                break;
            }
        }
    }
    int a[],top,size;
    Stack()
    {
        size=0;
    }
    Stack(int i)
    {
        size=i;
        a=new int[size];
        top=-1;
    }
    void push(int j)
    {
        if(top==size-1)
        System.out.println("Stack Overflow");
        else
        a[++top]=j;
    }
    void pop()
    {
        int k;
        if(top==-1)
        System.out.println("Stack Underflow");
        else
        {
            k=a[top--];
            System.out.println("Element deleted is="+k);
        }
    }
    void display()
    {
        System.out.println("Elements of the stack are as follows:\n");
        for(int i=0;i<=top;i++)
        System.out.print(a[i]+" ");
    }
}