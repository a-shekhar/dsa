import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /** Returns indices of two values that sum to target, or [-1, -1] if none exist. */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            Integer previousIndex = seen.get(complement);

            // Look before inserting so the same element cannot be used twice.
            if (previousIndex != null) {
                return new int[] {previousIndex, i};
            }
            seen.put(nums[i], i);
        }

        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] result = twoSum(new int[] {2, 7, 11, 15}, 9);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
