import java.util.Scanner;
class Circular_Queue
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the queue"); 
        int s=sc.nextInt();
        Circular_Queue obj=new Circular_Queue(s);
        System.out.println("\n1. insert \t 2. delete \t 3. display \t 4. Exit");
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
    int q[],front,rear,size;
    Circular_Queue(int n)
    {
        size=n;
        q=new int[size];
        front=rear=-1;
    }
    void insert(int x)
    {
        if((rear==size-1 && front==0) || (front==rear+1)) 
        System.out.println("Queue Overflow"); 
        else if (front==-1)
        {
            front=rear=0;
            q[rear]=x;
        }
        else if(rear==size-1 && front>0)
        {
        rear=0; 
        q[rear]=x;
        }
        else
        {
            rear++; 
            q[rear]=x;
        }
    }
    void delete()
    {
        int x;
        if(front==-1)
        {
            System.out.println("Queue Underflow"); 
            return;
        }
        x=q[front];
        System.out.println("Element deleted is="+x);
        q[front]=-1;
        if(front==rear)
        front=rear=-1;
        else if(front==size-1)
        front=0;
        else
        front++;
    }
    void display()
    {
        if(front==-1)
        {
            System.out.println("Queue empty");
            return;
        }
        if(rear>=front)
        {
            for(int i=front;i<=rear;i++)
            System.out.print(q[i]+" ");
        }
        else
        {
            for(int i=front;i<size;i++)
            System.out.print(q[i]+" ");
            for(int i=0;i<=rear;i++)
            System.out.print(q[i]+" ");
        }
    }
}