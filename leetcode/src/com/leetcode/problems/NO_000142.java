package com.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.clazz.ListNode;

public class NO_000142 {

	//�򵥵�List����
//	List<ListNode> key = new ArrayList<>();
//	public ListNode detectCycle(ListNode head) {
//        if(head == null) return null;
//        
//        if(key.contains(head)) return head;
//        key.add(head);
//        
//        return detectCycle(head.next);
//        
//    }
	
	/**
	 * ���ÿ���ָ�����
	 * @param head
	 * @return
	 */
	public ListNode detectCycle(ListNode head) {
		
		if(head == null || head.next == null) return null;
		
		ListNode slow = head;
		ListNode fast = head.next;
		
		//�ҵ��ڻ������������
		while( fast != null && fast.next != null && slow != fast){
			slow = slow.next;
			fast = fast.next.next;
			
			System.out.println(String.format("fast : %d, slow : %d", fast.val,slow.val));
		}
		
		if(fast != slow) return null;

		//slow�ڻ��ϵ��ڵ�ľ������head�����ڵ�ľ���
		fast = head;
		slow = slow.next;
		while(fast != slow){
			
			System.out.println(String.format("fast : %d, slow : %d", fast.val,slow.val));
			
			fast = fast.next;
			slow = slow.next;
		}
		
		return fast;
		
	}
	
	public static void main(String[] args) {
		
		NO_000142 t = new NO_000142();
		ListNode dom = new ListNode(0);
		ListNode tmp = dom;
		
		for(int i = 1; i <= 10; i++){
			tmp.next = new ListNode(i);
			tmp = tmp.next;
		}
		
		ListNode loopPoint = dom.next.next.next;
		System.out.println(loopPoint.val);
		
		tmp.next = loopPoint;
		
		System.out.println(t.detectCycle(dom.next).val);
		
	}
	
}
