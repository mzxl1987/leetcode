package com.leetcode.problems;

import com.leetcode.clazz.MyLinkedList;

public class NO_000707 {

	//Ïê¼û MyLinkedList class
	public static void main(String[] args) {
		/**
		 * ["MyLinkedList","addAtHead","addAtIndex","get","get","get"]
		 * [[],[1],[1,2],[1],[0],[2]]
		 */
		MyLinkedList t = new MyLinkedList();
		t.addAtHead(1);
		t.addAtIndex(1, 2);
		
		System.out.println(t.get(1));
		System.out.println(t.get(0));
		System.out.println(t.get(2));
		
	}
}
