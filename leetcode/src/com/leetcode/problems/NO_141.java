package com.leetcode.problems;

import com.leetcode.clazz.ListNode;

public class NO_141 {

	public boolean hasCycle(ListNode head) {
		if(head == null) return false;
		
		ListNode follow = head;
		ListNode go = head.next;
		
		while(follow != go){
			if(go == null || go.next == null) return false;
			follow = follow.next;
			go = go.next.next;
		}
		
		return true;
    }
	
}
