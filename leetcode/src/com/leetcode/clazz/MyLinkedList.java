package com.leetcode.clazz;

public class MyLinkedList {
	
	int size ;
	Node<Integer> first;
	Node<Integer> last;
	
	/** Initialize your data structure here. */
    public MyLinkedList() {
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(!isElementIndex(index)) return -1;
        return node(index).item;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
    	final Node<Integer> f = first;
        final Node<Integer> newNode = new Node<>(null, val, f);
        first = newNode;
        if (f == null)
            last = newNode;
        else
            f.prev = newNode;
        size++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
    	final Node<Integer> l = last;
        final Node<Integer> newNode = new Node<>(l, val, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
    	
    	if (index == size)
    		addAtTail(val);
        else if(isElementIndex(index)) 
            linkBefore(val, node(index));
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
    	if(!isElementIndex(index)) return;
    	
    	unlink(node(index));
    }
    
    void unlink(Node<Integer> x) {
        // assert x != null;
        final int element = x.item;
        final Node<Integer> next = x.next;
        final Node<Integer> prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;
    }
    
    void linkBefore(Integer e, Node<Integer> succ) {
        // assert succ != null;
        final Node<Integer> pred = succ.prev;
        final Node<Integer> newNode = new Node<>(pred, e, succ);
        succ.prev = newNode;
        if (pred == null)
            first = newNode;
        else
            pred.next = newNode;
        size++;
    }
    
    Node<Integer> node(int index) {
        // assert isElementIndex(index);

        if (index < (size >> 1)) {
            Node<Integer> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<Integer> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }
    
    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }
    
    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
    
    
}
