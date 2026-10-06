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
    public List<List<Integer>> pathSum(TreeNode root, int k) {
        List<List<Integer>> ap = new ArrayList<>();

        List<List<Integer>> ans = new ArrayList<>();

        if(root == null) return ans;
        
        List<Integer> cp = new ArrayList<>();
        cp.add(root.val);
        
        allpath(root,ap,cp);

        for(int i=0;i<ap.size();i++)
        {
            int s = 0;
            for(int j=0;j<ap.get(i).size();j++)
            {
                s+=ap.get(i).get(j);
            }
            if(s == k)
            {
                ans.add(ap.get(i));
            }
        }

        return ans;

    }
    public void allpath(TreeNode root, List<List<Integer>> ap,List<Integer> cp)
    {
        if(root.left == null && root.right == null)
        {
            ap.add(new ArrayList<>(cp));
            return;
        }
        if(root.left!=null)
        {
            cp.add(root.left.val);
            allpath(root.left,ap,cp);
            cp.remove(cp.size()-1);
        }
        if(root.right!=null)
        {
            cp.add(root.right.val);
            allpath(root.right,ap,cp);
            cp.remove(cp.size()-1);
        }
    }
}