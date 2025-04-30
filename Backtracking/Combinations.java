public class Solution {
    ArrayList<ArrayList<Integer>> ans;
    
    public void solve(int n, int k, int currElement, ArrayList<Integer> currArray) {
        if(currArray.size() == k) {
            ans.add(new ArrayList(currArray));
            return;
        }
        
        if(currElement > n) return;
        
        currArray.add(currElement);
        solve(n, k, currElement+1, currArray);

        currArray.remove(currArray.size()-1);
        solve(n, k, currElement+1, currArray);
    }
    
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
        ans  = new ArrayList();
        ArrayList<Integer> curr = new ArrayList();
        solve(n, k, 1, curr);
        
        return ans;
    }
}
