/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    
    public void inorder(TreeNode a, ArrayList<Integer> ar) {
        if(a==null) return;
        inorder(a.left, ar);
        ar.add(a.val);
        inorder(a.right, ar);
    }
    
    public int t2Sum(TreeNode a, int b) {
        ArrayList<Integer> ar = new ArrayList();
        inorder(a, ar);
        int i=0, j=ar.size()-1;
        
        while(i<j) {
            if(ar.get(i) + ar.get(j) == b) return 1;
            else if(ar.get(i) + ar.get(j) < b) i++;
            else j--;
        }
        
        return 0;
    }
}
