package com.leetcode.problems;

import com.leetcode.clazz.ListNode;

/**
 * Remove Duplicates from Sorted List II
 * 
 * @author Administrator
 *
 */
public class NO_000082 {
	public ListNode deleteDuplicates(ListNode head) {

		ListNode node = new ListNode(0);
		node.next = head;
		ListNode node_1th = node;
		ListNode node_2th = head;
		ListNode node_3th;
		ListNode pre;
		while (node_2th != null) {
			node_3th = node_2th.next;
			pre = null;
			while (null != node_3th && node_2th.val == node_3th.val) {
				pre = node_2th;
				node_3th = node_3th.next;
			}

			if (null != pre && node_2th.val == pre.val)
				node_1th.next = node_3th;
			else
				node_1th = node_2th;

			node_2th = node_3th;
		}

		return node.next;
	}
}
