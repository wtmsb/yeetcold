/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while ((root.val - p.val) * (root.val - q.val) > 0) //find the root in the middle of q & p
            if(p.val < root.val){  //p or q doesn't matter
                root = root.left;
            }else{
                root = root.right;
            }
        return root;
    }
}
