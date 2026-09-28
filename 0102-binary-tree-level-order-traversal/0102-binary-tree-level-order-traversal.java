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
       List<List<Integer>> ans = new ArrayList<>();
       lorder(root,ans);
       return ans;
    }
    public static void lorder(TreeNode root, List<List<Integer>> ans)
    {
         if(root == null)  return;
         Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
         while(!q.isEmpty())
         {
                int sz = q.size();
                List<Integer> level = new ArrayList<>();

                for(int i=0;i<sz;i++)
                {
                    TreeNode temp = q.remove();
                    level.add(temp.val);
                    if(temp.left!=null)
                    q.add(temp.left);
                    if(temp.right!=null)
                    q.add(temp.right);
                }
                ans.add(level);
         }
    }
}