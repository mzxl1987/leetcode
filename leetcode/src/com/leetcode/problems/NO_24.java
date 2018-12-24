package com.leetcode.problems;

import com.leetcode.clazz.ListNode;

/**
 * Swap Nodes in Pairs
 * 
 * @author Administrator
 *
 */
public class NO_24 {
public ListNode swapPairs(ListNode head) {
        
		ListNode dom = new ListNode(0);
		dom.next = head;
		ListNode tmp = head;
		ListNode pre = dom;
		ListNode next;
		
		while(null != tmp && tmp.next != null){
			pre.next = next = tmp.next;
			tmp.next = next.next;
			next.next = pre = tmp;
			tmp = tmp.next;
		}
		
		return dom.next;
    }
}
