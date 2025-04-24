public class Solution {
    
    public int subsetSum(int[] a, int b, int currIn, int currSum, int[][] dp) {
        int n = a.length;
        if(currSum == b) return 1;
        if(currIn == n || currSum > b) return 0;
        
        if(dp[currIn][currSum] != -1) return dp[currIn][currSum];
        
        int ans = subsetSum(a, b, currIn+1, currSum, dp);
        if(ans == 0) ans = subsetSum(a, b, currIn+1, currSum + a[currIn], dp);
        
        dp[currIn][currSum] = ans;
        return ans;
    }
    
    public int solve(int[] a, int b) {
        int n = a.length;
        int[][] dp = new int[n][b];
        for(int i=0; i<n; i++)
            Arrays.fill(dp[i], -1);
        
        return subsetSum(a, b, 0, 0, dp);
    }
}
