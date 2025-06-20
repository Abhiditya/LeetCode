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
    public TreeNode invertTree(TreeNode root) {
        return inverted(root);
    }

    private TreeNode inverted(TreeNode root){
        if(root==null) return root;
        //1st approach
        // TreeNode temp=root.left;
        // root.left=root.right;
        // root.right=temp;
        // inverted(root.left);
        // inverted(root.right);
        //2nd approach
        TreeNode left=  inverted(root.right);
        TreeNode right=  inverted(root.left);
        root.left=left;
        root.right=right;

        return root;
    }
}