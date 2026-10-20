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
    public void find(TreeNode root,ArrayList<Integer> ans){
        if(root.left==null && root.right==null){
            ans.add(root.val);
            return;
        }
        if(root.left!=null) find(root.left,ans);
        if(root.right!=null) find(root.right,ans);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> r1=new ArrayList<>();
        find(root1,r1);
         ArrayList<Integer> r2=new ArrayList<>();
        find(root2,r2);
        System.out.println(r1);
System.out.println(r2);
        if(r1.size()!=r2.size()) return false;
        for(int i=0;i<r1.size();i++){
            if(!r1.get(i).equals(r2.get(i))) return false;
        }
        
        return true;


    }
}