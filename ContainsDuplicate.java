// **Q6.** Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

// **Example 1:**
// Input: nums = [1,2,3,1]

// Output: true

import java.util.HashMap;
import java.util.Map;
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate (int[] nums){
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                return true;
            }
            else {
                mp.put(nums[i],i);
            }
        }
        return false;
    }
    
}
