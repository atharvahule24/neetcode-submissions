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

    // public TreeNode swap(TreeNode root){
    //     TreeNode node = root;
    //     if(root == null){
    //         return null;
    //     }
    //     TreeNode temp = node.left;
    //     node.left = node.right;
    //     node.right = temp;
    //     node.left = swap(node.left);
    //     node.right = swap(node.right);
        
    //     return temp;
    // }


    public int maxDepth(TreeNode root) {
        
        if(root == null){
            return 0;
        }
        
        return Math.max(maxDepth(root.left) , maxDepth(root.right)) + 1;
    }
}
