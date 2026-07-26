class Solution {
    public int missingNumber(int[] nums) {
        int x = nums.length;
        int expectedsum  = x*(x+1)/2;
        int currentsum = 0;
        for(int i = 0;i<x;i++){
            currentsum+=nums[i];

        }
        int t = expectedsum -currentsum;
        return t; 
    }
}