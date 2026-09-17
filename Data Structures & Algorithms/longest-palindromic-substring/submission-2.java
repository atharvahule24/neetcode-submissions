class Solution {
    public String longestPalindrome(String s) {
       
        int start = 0;
        int maxLen = 1;
        int n = s.length();
        boolean[] dp = new boolean[n];
        if(n == 0){ return "";}
        for(int i = n - 1 ; i >= 0 ; i--){
            boolean prev = false;
            for(int j = i ; j < n ; j++){
                boolean temp = dp[j];
                if(s.charAt(i) == s.charAt(j)){
                if(j - i <= 2){
                    dp[j] = true;
                }else{
                    dp[j] = prev;
                }

                if(dp[j] && j - i + 1 > maxLen){
                    start = i;
                    maxLen = j - i + 1;
                }
                }else{
                    dp[j] = false;
                }
                prev = temp;
            }
        }

        return s.substring(start , start + maxLen);

    }
}
