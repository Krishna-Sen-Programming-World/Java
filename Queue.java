import java.util.Scanner;
class Queue
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the size of the queue"); 
        int s=sc.nextInt();
        Queue obj=new Queue(s);
        System.out.println("\n1. insert \t 2. delete \t 3. display \t 4.Exit");
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
                obj.insert(x);
                break;
                case 2:
                obj.delete();
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
    int a[],front,rear,size;
    Queue(int n)
    {
        size=n;
        a=new int[size];
        front=rear=-1;
    }
    void insert(int x)
    {
        if(rear==size-1)
        {
            System.out.println("Queue Overflow");
            return;
        }
        a[++rear]=x;
        if(front==-1)
        front=0;
    }
    void delete()
    {
        int x;
        if(front==-1)
        {
            System.out.println("Queue Underflow");
            return ;
        }
        x=a[front];
        System.out.println("Element deleted is="+x);
        if(front==rear)
        front=rear=-1;
        else
        front++;
    }
    void display()
    {
        if(front==-1)
        {
            System.out.println("Queue empty");
            return ;
        }
        for(int i=front;i<=rear;i++)
        System.out.print(a[i]+" ");
    }
}