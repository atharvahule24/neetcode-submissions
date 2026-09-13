class Solution {
    public int rob(int[] nums) {
        int sum = 0;
        // int num1 = nums[0];
        // int num2 = nums[1];
        // int i = 0;
        int s1 = 0;
        int s2 = 0;
        for(int i = 0 ; i < nums.length ; i++){
            int temp = s1;
            s1 = Math.max(s1 , s2 + nums[i]);
            s2 = temp;
        }
        return s1;
    }
}
