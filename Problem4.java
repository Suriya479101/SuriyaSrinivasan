import java.util.*;
public class Problem4
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers separated by spaces:");
        String input = sc.nextLine();
        List<Integer> numbers = new ArrayList<>();
        String[] tokens = input.split("\\s+");        
        for (String token : tokens) 
        {
            numbers.add(Integer.parseInt(token));
        }
        Map<Integer, Integer> result = countMultiples(numbers);
        System.out.println(result);
        sc.close();
    }
    
    public static Map<Integer, Integer> countMultiples(List<Integer> numbers) 
    {
        Map<Integer, Integer> multipleCount = new LinkedHashMap<>();    
        for (int i = 1; i <= 9; i++) 
        {
            multipleCount.put(i, 0);
        }
        for (int divisor = 1; divisor <= 9; divisor++) 
        {
            int count = 0;
            for (int num : numbers) 
            {
                if (num % divisor == 0) 
                {
                    count++;
                }
            }
            multipleCount.put(divisor, count);
        }
        return multipleCount;
    }
}