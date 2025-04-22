public class Solution {
    
    public int lcs(String a, String b, int xa, int xb, int[][] dp) {
        int m = a.length();
        int n = b.length();
        
        if((xa == m) || (xb ==n)) return 0;
        
        if(dp[xa][xb] != -1) return dp[xa][xb];
        int ans = 0;
        
        if(a.charAt(xa) == b.charAt(xb)) 
            ans = 1 + lcs(a, b, xa+1, xb+1, dp);
        else 
            ans = Math.max(lcs(a, b, xa+1, xb, dp), lcs(a, b, xa, xb+1, dp));
        
        dp[xa][xb] = ans;
        return ans;
    }
    
    public int solve(String a, String b) {
        int m = a.length();
        int n = b.length();
        
        int[][] dp = new int[m][n];
        for(int i=0;i<m; i++){
            Arrays.fill(dp[i], -1);
        }
        
        int ans = lcs(a, b, 0, 0, dp);
        return ans;
    }
}
