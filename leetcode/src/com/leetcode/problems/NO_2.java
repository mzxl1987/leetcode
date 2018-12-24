package com.leetcode.problems;

import com.leetcode.clazz.ListNode;

/**
 * Add Two Numbers
 * @author Administrator
 *
 */
public class NO_2 {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return createNode(l1, l2, 0);
    }
    
    public ListNode createNode(ListNode a,ListNode b,int old){
    	
    	if(null == a && b == null && old == 0){
        	return null;
        }
        
        int r = 0;
        r += (null == a) ? 0 : a.val;
        r += (null == b) ? 0 : b.val;
        r += old;
                
        ListNode result = new ListNode(r >= 10 ? r - 10 : r);
        
        if(a != null && b != null){
        	result.next = createNode(a.next, b.next, r / 10);
        }else if(old != 0 && a == null && b == null){
        	result.next = createNode(null, null, r / 10);
        }else if(a == null){
        	result.next = createNode(null, b.next, r / 10);
        }else if(b == null){
        	result.next = createNode(a.next, null, r / 10);
        }
        
        return result;
        
    }
	
}
