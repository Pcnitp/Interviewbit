public class Solution {

    public int trap(final int[] a) {
        int n = a.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        
        leftMax[0] = a[0];
        for(int i=1; i<n; i++) 
            leftMax[i] = Math.max(a[i], leftMax[i-1]);
        
        rightMax[n-1] = a[n-1];
        for(int i= n-2; i>-1; i--) 
            rightMax[i] = Math.max(a[i], rightMax[i+1]);
            
        int ans = 0;
        for(int i=0; i<n; i++) 
            ans += Math.min(leftMax[i], rightMax[i]) - a[i];
            
        return ans;
    }
}
