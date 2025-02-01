import java.util.Arrays;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        // Sort the array
        Arrays.sort(nums);
        
        // Check adjacent elements for duplicates
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true; // Duplicate found
            }
        }
        
        // No duplicates found
        return false;
    }

    // Example usage
    public static void main(String[] args) {
        ContainsDuplicate solution = new ContainsDuplicate();
        
        int[] nums1 = {1, 2, 3, 4, 5};
        System.out.println(solution.containsDuplicate(nums1)); // Output: false
        
        int[] nums2 = {1, 2, 3, 4, 1};
        System.out.println(solution.containsDuplicate(nums2)); // Output: true
    }
}