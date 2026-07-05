class Solution {
    List<List<Integer>> sum = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates , 0 , target , new ArrayList<>());
        return sum;
    }

    public void backtrack(int[] candidates,int start , int remTarget , List<Integer> current){
        if(remTarget == 0){
            sum.add(new ArrayList<>(current));
            return;
        }

    if(remTarget < 0){
        return;
    }

    for(int i = start ; i < candidates.length ; i++){
        if(i > start && candidates[i] == candidates[i - 1]){
            continue;
        }
        current.add(candidates[i]);
        backtrack(candidates , i + 1 , remTarget - candidates[i] , current );
        current.remove(current.size() - 1);
    }

    }
}
