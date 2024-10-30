import java.util.ArrayList;
import java.util.List;

public class MyOthers {
    public static void main(String[] args) {
        System.out.println(pascalTriangle(5));
    }
    public static int numberOfBits(int n) {
        /*return Integer.bitCount(n);*/
        int count = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                count++;
            }
            n /= 2;
        }
        return count;
    }

    public static int hammingDistance(int x, int y) {
/*        int count = 0;
        while (x > 0 || y > 0) {
            count += (x & 1) ^ (y & 1);
            x >>= 1;
            y >>= 1;
        }
        return count;*/
        int sum=0;
        String s=Integer.toBinaryString(x^y);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') sum++;
        }
        return sum;
    }

    public static int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans <<= 1;
            ans = ans | (n & 1);
            n >>= 1;
        }
        return ans;
    }

    public static List<List<Integer>> pascalTriangle(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> row,prev = null;

        for (int i = 0; i < numRows; i++) {
            row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add( prev.get(j - 1) + prev.get(j));
                }
            }
            prev = row;
            result.add(row);
        }
        return result;
    }
}
