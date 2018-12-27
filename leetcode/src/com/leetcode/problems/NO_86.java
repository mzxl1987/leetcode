package com.leetcode.problems;

import com.leetcode.clazz.ListNode;

public class NO_86 {

	public ListNode partition(ListNode head, int x) {
		
		ListNode dom = new ListNode(0);
		dom.next = head;
		ListNode tmp = head;
		ListNode pre = dom;
		
		//查找即将插入的位置
		while(tmp != null && tmp.val < x){
			pre = tmp;
			tmp = tmp.next;
		}
		
		//接着向后查找小于X的节点
		ListNode pre_min = tmp;
		while(tmp != null){
			
			if(tmp.val < x){
				//取出节点并插入到指定位置
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
