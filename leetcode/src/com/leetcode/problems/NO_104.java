package com.leetcode.problems;

import com.leetcode.clazz.TreeNode;

/**
 * Maximum Depth of Binary Tree
 * @author Administrator
 *
 */
public class NO_104 {
	public int maxDepth(TreeNode root) {
		return root == null ? 0 : 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
