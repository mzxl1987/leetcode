package com.leetcode.problems;

import com.leetcode.clazz.ListNode;

public class NO_000061 {

	public ListNode rotateRight(ListNode head, int k) {
		ListNode dom = new ListNode(0);
		dom.next = head;
		
		int length = 0;
		ListNode tmp = head;
		ListNode tail = null;
		
		//������г���
        //get length and tail
		while(tmp != null){
			tail = tmp;
			tmp = tmp.next;
			length++;
		}
		
		if(length == 0) return null;
		
		//����λ��
        // find position
		k %= length;
        
        if(length == 1 || k == 0) return head;
        
		int position = length - k;
		ListNode p = null;
		tmp = dom.next;
		while(position > 0){
			p = tmp;
			tmp = tmp.next;
			position --;
		}
		
		//�����б�
        // swap list
		dom.next = p.next;
		p.next = tail.next;
		tail.next = head;
		
		return dom.next;
	}

}
