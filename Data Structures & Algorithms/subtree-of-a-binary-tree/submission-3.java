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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot ==null){
            return true;
        }
        if(root==null){
            return false;
        }
       if(sameTree(root, subRoot)){
        return true;
       }
       return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }


    TreeNode findNode(TreeNode root, TreeNode subRoot){
        if(root == null ){
            return null;
        }
        if(root.val == subRoot.val)
        return root;
      TreeNode leftSearch = findNode(root.left, subRoot);
    if (leftSearch != null) {
        return leftSearch;
    }
        return findNode(root.right, subRoot);
     
    }
    boolean sameTree(TreeNode root, TreeNode subRoot){
        if(root ==null && subRoot== null)
        return true;
         if(root == null || subRoot== null)
         return false;
         return (root.val == subRoot.val)&&sameTree(root.left, subRoot.left) && sameTree(root.right, subRoot.right);
    }
    
}
