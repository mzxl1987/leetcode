package com.leetcode.problems;

import java.util.HashSet;
import java.util.Set;

import com.leetcode.clazz.ListNode;

public class NO_000160 {

	public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {

		Set<ListNode> setA = new HashSet<>();
		Set<ListNode> setB = new HashSet<>();

		while (headA != null || headB != null) {

			if (headA != null) {
				if (setB.contains(headA))
					return headA;
				setA.add(headA);
				headA = headA.next;
			}

			if (headB != null) {
				if (setA.contains(headB))
					return headB;
				setB.add(headB);
				headB = headB.next;
			}
		}

		return null;
	}

	/**
	 * 算法很精妙
	 * 将链表分成3部分  ：Apre,Bpre,Common
	 * A链表构成 ：Apre + Common 
	 * B链表构成 : Bpre + Common
	 * 则 遍历的方法为算法的核心
	 * tmpA : Apre + Common + Bpre + Common
	 * tmpB : Bpre + Common + Apre + Common
	 * 当两者都便利到第二个Common的时候程序结束
	 * @param headA
	 * @param headB
	 * @return
	 */
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		ListNode tmpA = headA;
		ListNode tmpB = headB;

		while (tmpA != tmpB) {
			tmpA = tmpA == null ? headB : tmpA.next;
			tmpB = tmpB == null ? headA : tmpB.next;
		}

		return tmpA;
	}

}
