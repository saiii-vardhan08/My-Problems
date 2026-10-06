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
    public int sumNumbers(TreeNode root) {
        List<List<Integer>> ap = new ArrayList<>();

        List<Integer> cp = new ArrayList<>();
        
        cp.add(root.val);

        allpath(root,ap,cp);

        int os = 0;
        for(int i=0;i<ap.size();i++)
        {
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<ap.get(i).size();j++)
            {
                sb.append(ap.get(i).get(j));
            }
            os+= Integer.parseInt(sb.toString());
        }
        return os;
    }

    public void allpath(TreeNode root, List<List<Integer>> ap,List<Integer> cp)
    {
        if(root.left==null && root.right ==null)
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