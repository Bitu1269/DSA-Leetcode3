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
    public void inOrder(TreeNode root, ArrayList<Integer> list){  // This is step 1:- to sort bst
        if(root == null) return ;

        inOrder(root.left, list);  // recursive clall inOrder()
        list.add(root.val);
        inOrder(root.right, list);

    }

    public TreeNode constructTree(ArrayList<Integer> list, int start, int end){
        if(start > end){ // Base condition of my recursive call when start is big than end then stoping condition
            return null;

        }

        int mid = start + (end - start)/2;
        TreeNode newNode = new TreeNode(list.get(mid)); // create new node name= newNode

        newNode.left = constructTree(list, start, mid-1); // recursively callying constructTre();
        newNode.right = constructTree(list, mid+1, end);
        return newNode; 
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>(); // creating new arraylist to store node

        inOrder(root, list); // calling inOrder function

        return constructTree(list, 0, list.size()-1); // start=0, end = list.size()-1;
    }
}