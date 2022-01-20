import java.util.Scanner;
class UniqueNumber
{
    static boolean isUnique(int number)
    {
        int n1 = number;
        int lastDigit = 0;
        int n2;
        int count;
        while(n1 != 0)
        {
            lastDigit = n1 % 10;
            n2 = number;
            count = 0;
            while(n2 != 0)
            {
                if(lastDigit == n2%10)
                count++;
                n2 /= 10;
            }
            if(count != 1)
            return false;
            n1 /= 10;
        }
        return true;
    }
     public static void main(String[] args)
    {
        int number = 0;
        boolean result = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number::");
        number = sc.nextInt();
        result = isUnique(number);
        if(result)
        System.out.println(number +" is an Unique number.");
        else
        System.out.println(number +" is not an Unique number.");
    }
}