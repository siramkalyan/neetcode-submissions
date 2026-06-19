class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int resInd = 0, resLen = 0;

        for(int i = n-1; i >= 0 ;i--){
            for(int j = i; j < n ;j++){
                if(s.charAt(i) == s.charAt(j) &&
                (j-i <= 2 || dp[i+1][j-1])){
                    dp[i][j] = true;
                    if(resLen < (j-i + 1)){
                        resInd = i;
                        resLen = j-i+1;
                    }
                }
            }
        }
        return s.substring(resInd, resInd + resLen);
    }
}
