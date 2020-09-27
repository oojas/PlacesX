package com.placement1.ojas;

public class linkedList {
	Node head;
	
	void add(int data) {
		Node toadd=new Node(data);
		if(isEmpty()) {
			head=toadd;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
			
		}
		temp.next=toadd;
		toadd.next=null;
		
	}

	boolean isEmpty() {
		return head==null;
	}
	public void print() {
		Node temp;
		temp=head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
		temp=temp.next;	
		}
	}
   static class Node{
	   int data;
	   Node next;
	   public Node(int data) {
		   this.data=data;
		   next=null;
	   }
   }
}
