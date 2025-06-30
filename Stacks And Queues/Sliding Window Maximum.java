public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    class Pair {
        int index;
        int value;
        public Pair(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
    
    public ArrayList<Integer> slidingMaximum(final List<Integer> a, int b) {
        int n=a.size();
        if(n==0 || b==0) return new ArrayList();
        
        ArrayList<Integer> ans = new ArrayList();
        PriorityQueue<Pair> pq = new PriorityQueue(new Comparator<Pair>() {
            public int compare(Pair a, Pair b){
                return b.value - a.value;
            }
        });
        
        for(int i=0; i<b; i++) 
            pq.add(new Pair(i, a.get(i)));
        
        ans.add(pq.peek().value);
        
        for(int i=b; i<n; i++) {
            pq.add(new Pair(i, a.get(i)));
            while(pq.peek().index < i-b+1)
                pq.poll();
            ans.add(pq.peek().value);
        }
        
        return ans;
    }
}
