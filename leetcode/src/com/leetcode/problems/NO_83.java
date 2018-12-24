package com.leetcode.problems;

import com.leetcode.clazz.ListNode;

/**
 * Remove Duplicates from Sorted List
 * @author Administrator
 *
 */
public class NO_83 {
	public ListNode deleteDuplicates(ListNode head) {

		ListNode tmp = head;
		ListNode next = null;
		while (tmp != null) {
			next = tmp.next;
			while (next != null && next.val == tmp.val) {
				tmp.next = next.next;
				next = tmp.next;
			}
			tmp = tmp.next;
		}

		return head;
	}
}
