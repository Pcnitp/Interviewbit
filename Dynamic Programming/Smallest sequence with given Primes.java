public class Solution {
    
    public ArrayList<Integer> helper(int a, int b, int c, int d) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] dp = new int[d+1];
        dp[0] = 1;
        int x=0, y=0, z=0;
        
        for(int i=1; i<=d; i++) {
            int min = Math.min(dp[x]*a, Math.min(dp[y]*b, dp[z]*c));
            dp[i] = min;
            if(min == dp[x]*a) x++;
            if(min == dp[y]*b) y++;
            if(min == dp[z]*c) z++;
        }
        
        for(int i=1;i<=d; i++)
         ans.add(dp[i]);
        return ans;
    }
    
    public ArrayList<Integer> solve(int a, int b, int c, int d) {
        int[] primes = {a, b, c};
        Arrays.sort(primes);
        return helper(primes[0], primes[1], primes[2], d);
    }
}
