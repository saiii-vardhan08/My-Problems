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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();

        avg(root,ans);

        return ans;
    }
    void avg(TreeNode root,List<Double> ans)
    {
        if(root == null) return;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty())
        {
            int sz = q.size();
            long s = 0;
            for(int i=0;i<sz;i++)
            {
                TreeNode temp = q.remove();
                s+=temp.val;
                if(temp.left!=null)
                q.add(temp.left);
                if(temp.right!=null)
                q.add(temp.right);
            }
            ans.add((double)s/sz);
        }
    }
}