package com.leetcode.problems;

import com.leetcode.clazz.ListNode;

/**
 * Remove Linked List Elements
 * @author Administrator
 *
 */
public class NO_000203 {
	public ListNode removeElements(ListNode head, int val) {
	    
		ListNode dom = new ListNode(0);
		dom.next = head;
		ListNode pre = dom;
		ListNode tmp = head;
		ListNode next;
		while(tmp != null){
			if(tmp.val == val){
				next = tmp.next;
				while(null != next && next.val == val){
					next = next.next;
				}
				pre.next = next;
				tmp = next;
			}else{
				pre = tmp;
				tmp = tmp.next;
			}
		}
		
		return dom.next;
    }
}
