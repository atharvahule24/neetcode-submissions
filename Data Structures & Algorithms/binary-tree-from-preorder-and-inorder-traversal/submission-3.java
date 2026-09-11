
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
    private int preOrderIndex;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preOrderIndex = 0;
        return buildHelperTree(preorder , inorder , 0 , inorder.length - 1);

    }

    public TreeNode buildHelperTree(int[] preorder , int[] inorder , int inStart , int inEnd){

        if(inStart > inEnd){
            return null;
        }

        int rootVal = preorder[preOrderIndex];
        preOrderIndex++;


        TreeNode root = new TreeNode(rootVal);
        

        int inOrderIndex = inStart;
        for(int k = inStart ; k <= inEnd ; k++){
            if(inorder[k] == rootVal){
                inOrderIndex = k;
                break;
            }
        }

        root.left = buildHelperTree(preorder , inorder , inStart , inOrderIndex - 1);
        root.right = buildHelperTree(preorder , inorder , inOrderIndex + 1 , inEnd);

        return root;
    }
}
