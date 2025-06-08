public class Solution {
    
    public int solve(int[] a, int b) {
        int n = a.length;
        int start = 0, end=0, max=0;
        int c=b;
        
        while(end<n) {
            if(a[end] == 0) {
                if(c>0) {
                    end++;
                    c--;
                }
                else {
                    while(a[start]==1) start++;
                    start++;
                    c++;
                }
            }
            else end++;
            
            max = Math.max(max, end-start);
        }
        
        return max;
    }
}
