public class Solution {
    
    public int knapsack(int[] a, int[] b, int c, int in, int sum, int[][] dp) {
        int n = a.length;
        if(in == n) return 0;
        
        if(dp[in][sum] != -1) return dp[in][sum];
        
        int ans = knapsack(a, b, c, in+1, sum, dp);
        if(b[in] + sum <= c) {
            ans = Math.max(ans, a[in] + knapsack(a, b, c, in+1, sum+b[in], dp));
        }
        
        dp[in][sum] = ans;
        return ans;
    }
    
    public int solve(int[] a, int[] b, int c) {
        int n = a.length;
        
        int[][] dp = new int[n+1][c+1];
        for(int i=0; i<=n; i++)
            Arrays.fill(dp[i], -1);
            
        return knapsack(a, b, c, 0, 0, dp);
    }
}
