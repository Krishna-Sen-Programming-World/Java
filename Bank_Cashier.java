import java.util.Scanner;
class Bank_Cashier
{
    public static void main(String args[])
    {
        String p,q;
        int r,s;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name, account number, principal amount, amount to deposit or withdrawn");
        p=sc.nextLine();
        q=sc.nextLine();
        r=sc.nextInt();
        s=sc.nextInt();
        Account obj=new Account(p,q,r,s);
        System.out.println("1.deposit"+"\n"+"2.withdraw");
        int c;
        c=sc.nextInt();
        switch(c)
        {
            case 1:
            obj.deposit();
            obj.display();
            break;
            case 2:
            obj.withdraw();
            obj.display();
            break;
            default:
            System.out.println("Invalid choice!");
        }
    }
}
class Account extends Bank
{
    int amt;
    Account(String w,String x,int y,int z)
    {
        super(w,x,y);
        amt=z;
    }
    void deposit()
    {
        p=p+amt;
    }
    void withdraw()
    {
        if(amt>p)
        System.out.println("INSUFFICIENT BALANCE");
        else
        p=p-amt;
        if(p<500)
        p=p-(500-p)/10;
    }
    void display()
    {
        super.display();
    }
}
class Bank
{
    String name,accno;
    int p;
    Bank(String a,String b,int c)
    {
        name=a;
        accno=b;
        p=c;
    }
    void display()
    {
        System.out.println("the name "+name);
        System.out.println("the account number "+accno);
        System.out.println("the principal amount "+p);
    }
}