class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        backtrack(nums , 0 , target , new ArrayList<>());
        return result;
    }

    public void backtrack(int[] nums , int start , int remTarget ,List<Integer> current){
        if(remTarget == 0){
            result.add(new ArrayList<>(current));
            return;
        }

        if(remTarget < 0){
            return;
        }

        for(int i = start ; i < nums.length ; i++){
            current.add(nums[i]);
            backtrack(nums , i , remTarget - nums[i] , current);
            current.remove(current.size() - 1);
        }

    }
}
