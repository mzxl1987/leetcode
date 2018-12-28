package com.leetcode.problems;

import com.leetcode.clazz.ListNode;
import com.leetcode.clazz.TreeNode;

public class NO_000109 {
	private ListNode findMiddleElement(ListNode head) {

	    // The pointer used to disconnect the left half from the mid node.
	    ListNode prevPtr = null;
	    ListNode slowPtr = head;
	    ListNode fastPtr = head;

	    // Iterate until fastPr doesn't reach the end of the linked list.
	    while (fastPtr != null && fastPtr.next != null) {
	      prevPtr = slowPtr;
	      slowPtr = slowPtr.next;
	      fastPtr = fastPtr.next.next;
	    }

	    // Handling the case when slowPtr was equal to head.
	    if (prevPtr != null) {
	      prevPtr.next = null;
	    }

	    return slowPtr;
	  }

	  public TreeNode sortedListToBST(ListNode head) {

	    // If the head doesn't exist, then the linked list is empty
	    if (head == null) {
	      return null;
	    }

	    // Find the middle element for the list.
	    ListNode mid = this.findMiddleElement(head);

	    // The mid becomes the root of the BST.
	    TreeNode node = new TreeNode(mid.val);

	    // Base case when there is just one element in the linked list
	    if (head == mid) {
	      return node;
	    }

	    // Recursively form balanced BSTs using the left and right halves of the original list.
	    node.left = this.sortedListToBST(head);
	    node.right = this.sortedListToBST(mid.next);
	    return node;
	  }
	
	public static void main(String[] args) {
		
		ListNode dom = new ListNode(0);
		ListNode tmp = dom;
		
		int[] iArr = {-10,-3,0,5,9};
		
		for(int i : iArr){
			tmp.next = new ListNode(i);
			tmp = tmp.next;
		}
		
		NO_000109 t = new NO_000109();
		System.out.println(t.sortedListToBST(dom.next));
	}
}
