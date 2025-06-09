public class Solution {
    public String solve(String a) {
        int n = a.length();
        StringBuilder sb = new StringBuilder();
        Queue<Character> queue = new LinkedList<>();
        int[] count = new int[26];
        
        for(int i=0; i<n; i++) {
            int j = (int)(a.charAt(i) - 'a');
            count[j]++;
            
            if(count[j] == 1) queue.add(a.charAt(i));
            else {
                while(!queue.isEmpty() && count[queue.peek()-'a']>1)
                    queue.poll();
            }
            
            if(queue.isEmpty()) sb.append("#");
            else sb.append(queue.peek());
        }
        
        return sb.toString();
    }
}
