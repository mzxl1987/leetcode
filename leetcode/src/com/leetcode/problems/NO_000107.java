package com.leetcode.problems;

import java.util.LinkedList;
import java.util.List;

import com.leetcode.clazz.TreeNode;

/**
 * Binary Tree Level Order Traversal II
 * 
 * @author Administrator
 *
 */
public class NO_000107 {

	public List<List<Integer>> levelOrderBottom(TreeNode root) {

		List<List<Integer>> list = new LinkedList<>();
		insert(list, root, 0);
		return list;
	}

	public void insert(List<List<Integer>> r, TreeNode node, int depth) {

		if (null == node)
			return;

		if (r.size() <= depth)
			r.add(0, new LinkedList<Integer>());

		r.get(r.size() - depth - 1).add(node.val);
		insert(r, node.left, depth + 1);
		insert(r, node.right, depth + 1);

	}

}
