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
    private int maxDiameter = 0; // Variable to store the global maximum diameter

    public int diameterOfBinaryTree(TreeNode root) {
        height(root); // Compute the height while updating maxDiameter
        return maxDiameter; // Return the maximum diameter found
    }


    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        // Update the maximum diameter (longest path through root)
        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);

        // Return height of the current node
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
