import java.util.Scanner;
class Binarysearch_rec
{
    int rec_bin_search(int my_arr[], int left, int right, int x)
    {
        if (right >= left)
        {
            int mid = left + (right - left) / 2; 
            if (my_arr[mid] == x) 
            return mid;
            if (my_arr[mid] > x)
            return rec_bin_search(my_arr, left, mid - 1, x); 
            return rec_bin_search(my_arr, mid + 1, right, x);
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Binarysearch_rec my_object = new Binarysearch_rec();
        System.out.println("Enter the size of array :");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of the array in asscending order : ");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println("Enter the number to search : ");
        int num=sc.nextInt();
        int result = my_object.rec_bin_search(a, 0, n - 1, num);
        if (result == -1)
        System.out.println("The element is not present in the array");
        else
        System.out.println("The element has been found at index " + result);
    }
}