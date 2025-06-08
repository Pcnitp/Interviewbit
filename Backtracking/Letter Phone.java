public class Solution {
    ArrayList<String> ans;
    
    public String getLetters(int x) {
        switch(x) {
            case 1: return "1";
            case 2: return "abc";
            case 3: return "def";
            case 4: return "ghi";
            case 5: return "jkl";
            case 6: return "mno";
            case 7: return "pqrs";
            case 8: return "tuv";
            case 9: return "wxyz";
            case 0: return "0";
        }
        return null;
    }
    
    public void solve(String a, int in, int n, String b){
        if(in==n) {
            ans.add(b);
            return;
        }
        String s = getLetters((int)(a.charAt(in)- '0'));
        int m = s.length();
        for(int i=0;i<m;i++) 
            solve(a, in+1, n, b+s.charAt(i));
    }
    
    public ArrayList<String> letterCombinations(String a) {
        ans = new ArrayList<>();
        int n = a.length();
        solve(a, 0, n, "");
        return ans;
    }
}
