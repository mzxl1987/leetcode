package com.leetcode.problems;

import com.leetcode.clazz.ListNode;

public class NO_86 {

	public ListNode partition(ListNode head, int x) {
		
		ListNode dom = new ListNode(0);
		dom.next = head;
		ListNode tmp = head;
		ListNode pre = dom;
		
		//���Ҽ��������λ��
		while(tmp != null && tmp.val < x){
			pre = tmp;
			tmp = tmp.next;
		}
		
		//����������С��X�Ľڵ�
		ListNode pre_min = tmp;
		while(tmp != null){
			
			if(tmp.val < x){
				//ȡ���ڵ㲢���뵽ָ��λ��
				pre_min.next = tmp.next;    
				tmp.next = pre.next;
				pre.next = tmp;
				pre = pre.next;
				tmp = pre_min.next;
				continue;
			}
			
			pre_min = tmp;
			tmp = tmp.next;
		}
		
		return dom.next;   
    }
	
}
