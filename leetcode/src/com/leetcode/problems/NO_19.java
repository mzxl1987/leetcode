package com.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.clazz.ListNode;

/**
 * Remove Nth Node From End of List
 * @author Administrator
 *
 */
public class NO_19 {
	public ListNode removeNthFromEnd(ListNode head, int n) {

		List<ListNode> result = new ArrayList<>();
		ListNode tmp = head;
		while (tmp != null) {
			result.add(tmp);
			tmp = tmp.next;
		}

		tmp = result.get(result.size() - n);

		if (head == tmp)
			head = tmp.next;
		else
			result.get(result.size() - n - 1).next = tmp.next;

		return head;
	}
}
