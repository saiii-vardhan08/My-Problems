/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> alst = new ArrayList<>();
            if(root == null) return alst;
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty())
            {
                int n = q.size();
                List<Integer> ilst = new ArrayList<>();

                for(int i=0;i<n;i++)
                {
                    TreeNode x = q.poll();
                    ilst.add(x.val);

                    if(x.left!=null)
                    q.add(x.left);
                    if(x.right!=null)
                    q.add(x.right);
    
                }
                
                alst.add(ilst);
            }
            return alst;
    }
}