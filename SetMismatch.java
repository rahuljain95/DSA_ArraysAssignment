// **Q8.** You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

// You are given an integer array nums representing the data status of this set after the error.

// Find the number that occurs twice and the number that is missing and return them in the form of an array.

// **Example 1:**
// Input: nums = [1,2,2,4]
// Output: [2,3]


public class SetMismatch {
    public static int[] findErrorNums(int[] nums) {
        int ans[]=new int[2];        
        int f[]=new int[nums.length];
        for(int i:nums){            
            f[i-1]++;
        }
        for(int i=0;i<f.length;i++){
            if(f[i]==2){
                ans[0]=i+1;
            }
            else if(f[i]==0){
                ans[1]=i+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(findErrorNums(nums));
    }
}
