package com.leetcode.problems;

import com.leetcode.clazz.ListNode;

public class NO_000141 {

	public boolean hasCycle(ListNode head) {
		if(head == null) return false;
		
		ListNode follow = head;
		ListNode go = head.next;
		
		while(follow != go){
			if(go == null || go.next == null) return false;
			follow = follow.next;
			go = go.next.next;
			
			System.out.println(String.format("fast : %d, slow : %d", go.val,follow.val));
		}
		
		return true;
    }
	
	public static void main(String[] args) {
		
		NO_000141 t = new NO_000141();
		ListNode dom = new ListNode(0);
		ListNode tmp = dom;
		
		for(int i = 1; i <= 10; i++){
			tmp.next = new ListNode(i);
			tmp = tmp.next;
		}
		
		ListNode loopPoint = dom.next.next.next;
		System.out.println(loopPoint.val);
		
		tmp.next = loopPoint;
		
		System.out.println(t.hasCycle(dom.next));
		
	}
	
}
