import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Integer> result = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt() - 1;
        int divOnThree = number / 3;
        int divOnFive = number / 5;

        for (int i = 1; i <= divOnThree; i++) {
            result.add(3 * i);
        }

        for (int i = 1; i <= divOnFive; i++) {
            result.add(5 * i);
        }

        System.out.println(result.stream().mapToInt(Integer::intValue).sum());
    }
}