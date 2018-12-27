package com.leetcode.problems;

import com.leetcode.clazz.ListNode;

public class NO_92 {

	public ListNode reverseBetween(ListNode head, int m, int n) {
        
		int length = 0;
		ListNode dom = new ListNode(0);
		dom.next = head;
		ListNode pre = dom;
		
		while(length < m - 1){
			pre = pre.next;
			length++;
		}
		
		ListNode rHead = null;
		ListNode rTail = null;
		ListNode tmp = pre.next;
		ListNode next;
		while(length < n){
			
			next = tmp.next;
			
			if(rTail == null){
				rHead = tmp;
				rTail = tmp;
			}else{
				tmp.next = rHead;
				rHead = tmp;
			}
			
			tmp = next;
			length++;
		}
		
		if(rHead != null){
			pre.next = rHead;
			rTail.next = tmp;
		}
		
		return dom.next;
    }
	
}
