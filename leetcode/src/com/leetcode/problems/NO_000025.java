package com.leetcode.problems;

import com.leetcode.clazz.ListNode;

public class NO_000025 {

	public ListNode reverseKGroup(ListNode head, int k) {

		ListNode dom = new ListNode(0);
		dom.next = head;
		ListNode tmp = head;
		int size = 0;

		//获取队列长度
		//get list size
		while (tmp != null) {
			tmp = tmp.next;
			size++;
		}

		//如果长度不够,则直接返回
		if (size < k) return head;

		//切割数组,并转换
		//split list, and reverse sub list
		int position = 0;
		ListNode pre = dom;
		ListNode rHead = null;
		ListNode rTail = null;
		ListNode next = null;
		for (int count = 0; (count + 1) * k <= size; count++) {

			position = 0;

			rHead = null;
			rTail = null;
			tmp = pre.next;
			//翻转子队列
			//reverse sub list
			while (position < k) {

				next = tmp.next;

				if (rTail == null) {
					rHead = tmp;
					rTail = tmp;
				} else {
					tmp.next = rHead;
					rHead = tmp;
				}

				tmp = next;
				position++;
			}

			if (rHead != null) {
				pre.next = rHead;
				rTail.next = tmp;
				pre = rTail;
			}
		}

		return dom.next;
	}
	
	public static void main(String[] args) {
		
		NO_000025 t = new NO_000025();
		ListNode dom = new ListNode(0);
		ListNode tmp = dom;
		
		for(int i = 1; i <= 5; i++){
			tmp.next = new ListNode(i);
			tmp = tmp.next;
		}
		
		System.out.println(t.reverseKGroup(dom.next, 2));
		
	}
	
}
