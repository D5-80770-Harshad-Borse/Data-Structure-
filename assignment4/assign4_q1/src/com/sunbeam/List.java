package com.sunbeam;

public class List {
	static class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node head;
	private Node tail;
	
	public List() {
		head = null;
		tail = null;
	}
	
	public boolean isEmpty() {
		return head==null && tail==null;
	}
	
	public void display() {
		System.out.print("List :");
		Node trav = head;
		while(trav!=null) {
			System.out.print(trav.data+" ");
			trav = trav.next;
		}
		System.out.println();
	}
	
	public void addFirst(int value) {
		Node node = new Node(value);
		if(isEmpty()) {
			head = node;
			tail = node;
		} else {
			node.next = head;
			head = node;
		}
	}
	
	public void addLast(int value) {
		Node node = new Node(value);
		if(isEmpty()) {
			head = node;
		} else {
			tail.next = node;
			tail = node;
		}
	}
	
	public void addPosition(int value,int pos) {
		if (isEmpty()) {
			return;
		} 
		else if(pos<=1) {
			addFirst(value);
		} 
		else {
			Node nn = new Node(value);
			Node trav = head;
			for(int i=1;i<pos-1 && trav.next!=null;i++) {
				trav=trav.next;
			}
			nn.next=trav.next;
			trav.next = nn;
		}
	}
	
	public void delFirst() {
		if(isEmpty()) {
			return;
		}
		head = head.next;
	}
	
	public void delLast() {
		if (isEmpty()) {
			return;
		}
		else if(head.next==null) {
			head = null;
		} else {
			Node trav = head;
			while(trav.next.next!=null) {
				trav = trav.next;
			}
			trav.next = null;
		}
	}
	
	public void delPosition(int pos) {
		if(isEmpty()) {
			return;
		} else if(head.next==null) {
			head=null;
		} else {
			Node trav = head;
			for(int i=1;i<pos-1 && trav.next.next!=null;i++) {
				trav = trav.next;
			}
			
			trav.next=trav.next.next;
		}
	}
	
	public void add(int value) {
		if(isEmpty()) {
			addFirst(value);
		} 
		else if (head.data>value) {
			addFirst(value);
		} else {
			Node node = new Node(value);
			Node trav = head;
			while(trav.next!=null && trav.data<value) {
				trav=trav.next;
			}
			trav.next = node;
		}
	}
	
	
	
	
	
	
}
