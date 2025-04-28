public class Solution {
    public String serialize(String[] a) {
        int n = a.length;
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<n;i++) {
            int m = a[i].length();
            sb.append(a[i]).append(m).append("~");
        }
        
        return sb.toString();
    }
}
