package com.leetcode.problems;

import com.leetcode.clazz.ListNode;

/**
 * Merge k Sorted Lists
 * 
 * @author Administrator
 *
 */
public class NO_000023 {
public ListNode mergeKLists(ListNode[] lists) {
		
		if(lists == null || lists.length == 0) return null;
		if(lists.length == 1) return lists[0];
		return mergeList(lists,0,lists.length - 1);
    }
	
	public ListNode mergeList(ListNode[] lists,int first,int last){
		if(first == last) return lists[first];
		int middle = first + (last - first) / 2;
		return mergeListNode(mergeList(lists, first, middle), mergeList(lists, middle + 1, last));
	}
	
	public ListNode mergeListNode(ListNode one, ListNode two){
		
		ListNode head = new ListNode(0);
		ListNode tmp = head;
		while(one != null && two != null){
			if(one.val <= two.val){
				tmp.next = one;
				tmp = one;
				one = one.next;
			}else{
				tmp.next = two;
				tmp = two;
				two = two.next;
			}
		}
		
		tmp.next = null == one ? two : one;
		return head.next;
	}
}
