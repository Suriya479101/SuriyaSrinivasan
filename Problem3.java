import java.util.*;
public class Problem3
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Output: ");
        generateOddSeries(a);
        sc.close();
    }
    public static void generateOddSeries(int n) 
    {
        int count;
        if (n % 2 == 1) {
            count = n;
        } else {
            count = n - 1;
        }
        for (int i = 1; i <= count; i++) 
        {
            int oddNumber = 2 * i - 1;
            System.out.print(oddNumber);
            if (i < count) 
            {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}