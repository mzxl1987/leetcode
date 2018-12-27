package com.leetcode.problems;

import com.leetcode.clazz.ListNode;

/**
 * Insertion Sort List
 * @author Administrator
 *
 */
public class NO_000147 {
	public ListNode insertionSortList(ListNode head) {

		ListNode node = new ListNode(-1);
		ListNode n = node.next;
		ListNode tmp = head;
		ListNode tmp_next;
		ListNode pre;
		while (tmp != null) {
			pre = node;
			n = node.next;

			while (null != n && n.val < tmp.val) {
				pre = n;
				n = n.next;
			}

			tmp_next = tmp.next;
			tmp.next = n;
			pre.next = tmp;
			tmp = tmp_next;
		}

		return node.next;
	}
}
