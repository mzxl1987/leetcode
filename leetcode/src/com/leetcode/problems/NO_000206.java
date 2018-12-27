package com.leetcode.problems;

import com.leetcode.clazz.ListNode;

public class NO_000206 {

	public ListNode reverseList(ListNode head) {
		ListNode dom = new ListNode(0);
		dom.next = head;
		ListNode tmp = head;
		ListNode next = null;
		ListNode newHead = null;
		while(tmp != null){
			next = tmp.next;
			tmp.next = newHead;
			newHead = tmp;
			tmp = next;
		}
		
		return newHead;
	}

}
