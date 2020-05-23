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
        System.out.println(rightSideView(1,2,3,null,5,null,4));
    }

    public static List<Integer> rightSideView(TreeNode root) {
        if (root == null) return Collections.emptyList();

        Deque<TreeNode> queue = new ArrayDeque<>();
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
