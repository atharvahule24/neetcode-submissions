class Solution {
    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);

        if(nums.length == 0){
            return 0;
        }
        int CurrentCount = 1; int MaxCount = 1; 
        for(int i = 1 ; i < nums.length ; i++){
        if(nums[i] == nums[i - 1]){
            continue;
        }else if(nums[i] == nums[i - 1] + 1){
            CurrentCount++;
        }else{
           CurrentCount = 1;
        }
        MaxCount = Math.max(MaxCount,CurrentCount);
        }
        return MaxCount;
    }
}
