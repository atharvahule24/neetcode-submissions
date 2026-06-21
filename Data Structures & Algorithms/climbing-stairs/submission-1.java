class Solution {
    int[] memo;
    public int climbStairs(int n) {
        
        if(memo == null){
            memo = new int[n + 1];
            Arrays.fill(memo , -1);
        }
        if(memo[n] != -1){
            return memo[n];
        }
        if(n == 1){return 1;}
        if(n == 2){return 2;}

        memo[n] = climbStairs(n - 1) + climbStairs(n - 2);
        return memo[n];

    }
}
