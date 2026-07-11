// LeetCode #217 - Contains Duplicate
// Pattern: HashSet - Size Comparison
// Time Complexity: O(n) | Space Complexity: O(n)

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        if(hs.size() == nums.length)
            return false;
        else
            return true;
    }
}
