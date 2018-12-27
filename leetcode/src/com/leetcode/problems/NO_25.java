package com.leetcode.problems;

import com.leetcode.clazz.ListNode;

public class NO_25 {

public ListNode reverseKGroup(ListNode head, int k) {
		
		ListNode dom = new ListNode(0);
		dom.next = head;
		ListNode tmp = head;
		int size = 0;
		
		while(tmp != null){
			tmp = tmp.next;
			size ++;
		}
		
		if(size < k) return head;
		
		int position = 0;
		ListNode pre = dom;
		ListNode rHead = null;
		ListNode rTail = null;
		ListNode next = null;
		for(int count = 0; (count + 1) * k <= size; count++){
			
			position = 0;
			
			rHead = null;
			rTail = null;
			tmp = pre.next;
			
			while(position < k){
				
				next = tmp.next;
				
				if(rTail == null){
					rHead = tmp;
					rTail = tmp;
				}else{
					tmp.next = rHead;
					rHead = tmp;
				}
				
				tmp = next;
				position++;
			}
			
			if(rHead != null){
				pre.next = rHead;
				rTail.next = tmp;
				pre = rTail;
			}
		}
		
		return dom.next;
    }
	
	public static void main(String[] args) {
		
		NO_25 t = new NO_25();
		ListNode dom = new ListNode(0);
		ListNode tmp = dom;
		
		for(int i = 1; i <= 5; i++){
			tmp.next = new ListNode(i);
			tmp = tmp.next;
		}
		
		System.out.println(t.reverseKGroup(dom.next, 2));
		
	}
	
}
