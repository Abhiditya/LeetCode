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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return solve(root,0, new int[1]);
    }

    public TreeNode solve(TreeNode root, int depth, int[] curr){
        if(root==null){
            curr[0] = depth;
            return null;
        }
        int[] leftD= new int[1];
        int[] rightD= new int[1];

        TreeNode left=solve(root.left, depth+1, leftD);
        TreeNode right=solve(root.right, depth+1, rightD);
        if (leftD[0]== rightD[0]){
            curr[0]=leftD[0];
            return root;
        }
        curr[0] = Math.max(leftD[0], rightD[0]);
        return leftD[0]>rightD[0]? left: right;
    }
}