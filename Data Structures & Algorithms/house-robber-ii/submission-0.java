class Solution {
    public int rob(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }

        int s1 = 0;
        int s2 = 0;

        for(int i = 0 ; i < nums.length - 1 ; i++){
            int temp = s1;
            
            s1 = Math.max(s1 , s2 + nums[i]);
            s2 = temp;
            // if(i % nums.length == 0){
            //     continue;
            // }
        }
        int ans1 = s1;

        s1 = 0;
        s2 = 0;

        for(int i = 1 ; i < nums.length ; i++){
            int temp = s1;
            
            s1 = Math.max(s1 , s2 + nums[i]);
            s2 = temp;
            // if(i % nums.length == 0){
            //     continue;
            // }
        }
        int ans2 = s1;

        return Math.max(ans1 , ans2);

        
    }
}
