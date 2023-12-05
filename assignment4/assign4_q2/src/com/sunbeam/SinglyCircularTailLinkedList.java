package com.sunbeam;

public class SinglyCircularTailLinkedList {
	static class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next=null;
		}
	}
	
	private Node tail;
	public SinglyCircularTailLinkedList() {
		tail=null;
	}
	
	public boolean isEmpty() {
		return tail==null;
	}
	
	public void addFirst(int value) {
		Node node = new Node(value);
		if(isEmpty()) {
			tail = node;
			tail.next = tail;
		} else {
			node.next = tail.next;
			tail.next = node;
		}
	}
	
	public void addLast(int value) {
		Node node = new Node(value);
		if(isEmpty()) {
			tail = node;
			tail.next = tail;
		} else {
			node.next = tail.next;
			tail.next = node;
			tail = node;
		}
	}
	
	public void addPosition(int value,int pos) {
		Node node = new Node(value);
		if(isEmpty()) {
			tail = node;
			tail.next = tail;
		}
		else if(pos<=1) {
			addFirst(value);
		} else {
			Node trav = tail.next;
			for(int i=0;i<pos-1 && trav.next!=null;i++) {
				trav = trav.next;
			}
			node.next = trav.next;
			trav.next = node;
		}
	}
	
	public void delFirst() {
		if(isEmpty()) {
			return;
		}
		tail.next = tail.next.next;
	}
	
	public void delLast() {
		if(isEmpty()) {
			return;
		}
		Node trav = tail.next;
		while(trav.next != tail) {
			trav = trav.next;
		}
		trav.next = tail.next;
		tail = trav;
		trav = null;
	}
	
	public void display() {
		if(isEmpty()) {
			return;
		} 
		Node trav = tail.next;
		do {
			System.out.print(trav.data+" ");
			trav = trav.next;
		}while(trav!=tail.next);
		System.out.println();
	}
}
