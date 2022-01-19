import java.util.Scanner;
class Calendar
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int yy = sc.nextInt(); // To enter the year
        System.out.print("Enter month : ");
        int mm = sc.nextInt(); // To enter the month
        int d = 1; // Default date
        int m = 1; // Default month
        int y = 1; // Default year
        int a = 1; // Default day
        String day[] = { "SUN", "MON", "TUE", "WED","THU", "FRI", "SAT" };
        String month[] = { "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER" };
        int ar[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        while (true) 
        {  
            if (d == 1 && m == mm && y == yy) {
                break;
            }
            ar[1] =((y % 4 == 0 && y % 100 != 0 || y % 400 == 0) ? 29 : 28);
            a++;
            d++;
            if (d > ar[m - 1]) {
                m++;
                d = 1;
            }
            if (m > 12) {
                m = 1;
                y++;
            }
            if (a == 7) {
                a = 0;
            }
        }
        int c = a;
        ar[1] =((y % 4 == 0 && y % 100 != 0 || y % 400 == 0) ? 29 : 28);
        System.out.println("Calender for :  " + month[mm - 1] +" "+yy); //Shows input month and year 
        for (int k = 0; k < 7; k++) {
            System.out.print("   " + day[k]);
        }
        System.out.println();
        for (int j = 1; j <= (ar[mm - 1] + a); j++) {
            if (j > 6) {
                a = a % 6;
            }
        }
        int sp = a;
        if (sp < 0)
            sp = 6;
        for (int i = 0; i < sp; i++)  // Printing the calendar space
            System.out.print("      ");
        for (int i = 1; i <= ar[mm - 1]; i++) // Printing the calendar
        {
            System.out.printf(" %4d ", i);
            if (((i + sp) % 7 == 0) || (i == ar[mm - 1]))
                System.out.println();
        }
    }
}