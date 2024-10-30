import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class MyMath {
    public static void main(String[] args) {
        System.out.println(powerOfThree(243));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(Integer.toString(i));
            }
        }
        return result;
    }

    public static int countOfPrimes(int n) {
        if (n <= 1) return 0;
        int[] nums = new int[n + 1];
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (nums[i] == 0) {
                primes.add(i);
                nums[i] = 1;
                for (int j = 2; i*j <= n; j++) {
                    nums[i*j]++;
                }
            }
        }
        return primes.size();
    }

    public static boolean powerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }


}
