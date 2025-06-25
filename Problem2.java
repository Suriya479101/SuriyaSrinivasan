import java.util.Scanner;
public class Problem2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int a = sc.nextInt();
        StringBuilder output = new StringBuilder();
        for (int i = 1; i <= a; i++) 
        {
            int oddNumber = 2 * i - 1;
            output.append(oddNumber);
            if (i < a) 
            {
                output.append(", ");
            }
        }
        System.out.println("Output: " + output);
        sc.close();
    }
}