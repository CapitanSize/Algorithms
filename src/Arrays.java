import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        for (int item : intersectionOfTwoArrays(nums1, nums2)) {
            System.out.println(item);
        }
    }

    public static int containsDuplicates(int[] nums) {
/*        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            if (numSet.contains(num)) {
                numSet.remove(num);
            } else {
                numSet.add(num);
            }
        }
        return numSet.iterator().next();*/
    }

    public static int[] intersectionOfTwoArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> nums1Map = new HashMap<>();
        for (int nums : nums1) {
            if (nums1Map.containsKey(nums)) {
                nums1Map.put(nums, nums1Map.get(nums) + 1);
            } else {
                nums1Map.put(nums, 1);
            }
        }
        for (int nums : nums2) {
            if (nums1Map.containsKey(nums) && nums1Map.get(nums) != 0) {
                result.add(nums);
                nums1Map.put(nums, nums1Map.get(nums) - 1);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
