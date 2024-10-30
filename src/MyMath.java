import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class MyMath {
    public static void main(String[] args) {
        System.out.println(romanToInteger("MCMXCIV"));
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

    public static int romanToInteger(String s) {
        Map<Character, Integer> numsMap = new HashMap<>();
        numsMap.put('I', 1);
        numsMap.put('V', 5);
        numsMap.put('X', 10);
        numsMap.put('L', 50);
        numsMap.put('C', 100);
        numsMap.put('D', 500);
        numsMap.put('M', 1000);
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int c = numsMap.get(s.charAt(i));
            if (i > 0 && numsMap.get(s.charAt(i - 1)) < c) {
                c -= numsMap.get(s.charAt(i - 1));
                i--;
            }
            result += c;
        }
        return result;
    }


}
