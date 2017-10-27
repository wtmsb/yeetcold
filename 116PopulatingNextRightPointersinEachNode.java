/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        TreeLinkNode ite = root;
        while(ite != null){
            TreeLinkNode curr = new TreeLinkNode(-1);// point node used tin the next level
            TreeLinkNode temp = curr;//store the beginning of next level
            while(ite != null){ //each level
                if(ite.left!=null){
                    curr.next = ite.left;
                    curr = curr.next;
                }
                if(ite.right!= null){
                    curr.next = ite.right;
                    curr = curr.next;
                }
                ite = ite.next;
            }
            ite = temp.next;// go to the next level
        }
    }
}
