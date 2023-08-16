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
    public static int getH(TreeNode root){
        if(root == null)
            return 0;

        int leftH = getH(root.left);
        int rightH = getH(root.right);

        return Math.max(leftH, rightH) + 1;
    }

    public int maxDepth(TreeNode root) {
        int height = getH(root);

        return height;
    }
}