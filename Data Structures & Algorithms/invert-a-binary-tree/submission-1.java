
// //  Definition for a binary tree node.
//   class TreeNode {
//       int val;
//       TreeNode left;
//       TreeNode right;
      
//       TreeNode(int val) { this.val = val; }
//      TreeNode(int val, TreeNode left, TreeNode right) {
//          this.val = val;
//           this.left = left;
//           this.right = right;
//       }
//   }
 

class Solution {

    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }

    TreeNode t = invertTree(root.left);   // t = a  (temp mein a ki value bachayi)
root.left = invertTree(root.right);   // a = b
root.right = t;    
return root;                   // b = temp

    }
}
