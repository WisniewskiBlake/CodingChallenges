package BSTRightSideView;

//Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
//
//        Example:
//
//        Input: [1,2,3,null,5,null,4]
//        Output: [1, 3, 4]
//        Explanation:
//
//        1            <---
//        /   \
//        2     3         <---
//        \     \
//        5     4       <---

import java.util.*;

public class BSTRightSideView {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode = new TreeNode();
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode blankTree = new TreeNode();
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.right = treeNode4;
        treeNode2.left = treeNode;
        treeNode3.right = treeNode5;
        treeNode3.left = blankTree;


        System.out.println(rightSideView(treeNode1));

    }

    public static List<Integer> rightSideView(TreeNode root) {
        if (root == null) return Collections.emptyList();

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        List<Integer> res = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode n = queue.peek();
            res.add(n.val);

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                // queue: left ... right
                if (node.right != null) {
                    queue.add(node.right);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
            }
        }
        return res;
    }

}
