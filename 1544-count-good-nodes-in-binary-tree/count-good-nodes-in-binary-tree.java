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
    int ans=0;
    public void find(TreeNode root,int max){
        if(root.val>=max){
            ans++;
        }
        if(root==null) return;
        if(root.left!=null) find(root.left,Math.max(root.val,max));
        if(root.right!=null) find(root.right,Math.max(root.val,max));
    }
    public int goodNodes(TreeNode root) {
        find(root,root.val);
        return ans;
    }
}