public class Solution {
    public int maxPoints(ArrayList<Integer> a, ArrayList<Integer> b) {
        int n = a.size();
        if(n==0) return 0;
        else if(n==1) return 1;
        
        int max = 0;
        
        for(int i=0;i<n;i++) {
            HashMap<Double, Integer> map = new HashMap<>();
            int samePoint = 0;
            
            for(int j=0;j<n;j++) {
                if(i==j) continue;
                else if((a.get(i) == a.get(j)) &&  (b.get(i) == b.get(j)))
                    samePoint++;
                else {
                    Double slope = (b.get(i) - b.get(j)) / (double)(a.get(i) - a.get(j));
                    if(map.containsKey(slope)) 
                        map.put(slope, map.get(slope) + 1);
                    else map.put(slope, 1);
                }
                
            }

            max = Math.max(max, samePoint);
            for(double key: map.keySet()) 
                max = Math.max(max, map.get(key)+samePoint);
                
            
        }
        
        return max + 1;
    }
}
