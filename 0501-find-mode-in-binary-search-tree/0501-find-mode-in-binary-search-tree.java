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
    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();
        inorder(root, map);

        ArrayList<Integer> max = new ArrayList<>();
        max.add(0);
        int m = -1;
        for(Map.Entry<Integer,Integer> el : map.entrySet()){
            if(el.getValue() > m){
                m = el.getValue();
                max.set(0, el.getKey());
            }
        }
        for(Map.Entry<Integer,Integer> el : map.entrySet()){
            int a = max.get(0);
            if(el.getValue() == m && a != el.getKey()){
                max.add(el.getKey());
            }
        }
        int max1[] = new int[max.size()];
        for(int i=0;i<max.size();i++){
            max1[i] = max.get(i);
        }
        return max1;
    }

    static void inorder(TreeNode root, HashMap<Integer, Integer> map){
        if(root == null)
            return;
        inorder(root.left, map);
        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        inorder(root.right, map);
    }
}