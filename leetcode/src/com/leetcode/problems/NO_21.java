package com.leetcode.problems;

import com.leetcode.clazz.ListNode;

/**
 * Merge Two Sorted Lists
 * @author Administrator
 *
 */
public class NO_21 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		if (l1 == null || l2 == null)
			return null == l1 ? l2 : l1;

		final ListNode head = new ListNode(0);
		ListNode pre = head;

		while (l2 != null && l1 != null) {
			if (l2.val <= l1.val) {
				pre.next = l2;
				l2 = l2.next;
			} else {
				pre.next = l1;
				l1 = l1.next;
			}
			pre = pre.next;
		}

		pre.next = l1 == null ? l2 : l1;

		return head.next;
	}
}
