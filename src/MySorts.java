import java.util.stream.IntStream;

public class MySorts {
    public static void main(String[] args) {
 /*       for (int item : mergeSortedArrays(new int [] {0}, 0, new int[] {1}, 1)) {
            System.out.println(item);
        }*/
        System.out.println(findFirstBadVersion(20));
    }

    public static int[] mergeSortedArrays(int[] nums1, int m, int[] nums2, int n) {
        int index = nums1.length - 1;
        int nums1Index = m - 1;
        int nums2Index = n - 1;
        while (nums2Index > - 1) {
            if (nums1Index >= 0 && nums1[nums1Index] > nums2[nums2Index]) {
                nums1[index--] = nums1[nums1Index--];
            } else {
                nums1[index--] = nums2[nums2Index--];
            }
        }
        return nums1;
    }

    public static int findFirstBadVersion(int n) {
        int left = 0;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        if (left == right && isBadVersion(left)) {
            return left;
        }
        return -1;
    }


    public static boolean isBadVersion(int n) {
        return n >= 11;
    }


}
