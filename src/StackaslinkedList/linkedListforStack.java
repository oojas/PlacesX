package StackaslinkedList;

public class linkedListforStack <E>{
     Node<E> head;
     public void add(E data) {
    	 Node<E> toadd=new Node <E> (data);
    	 if(isEmpty()) {
    		head=toadd;
    		return;
    	 }
    	 Node<E> temp=head;
    	 while(temp.next!=null) {
    		 temp=temp.next;
    	 }
    	 temp.next=toadd;
    	 toadd.next=null;
     }
     public E remove(int pos) throws Exception {
    	 if(isEmpty()) {
    		 throw new Exception("Node not found");
    	 }
    	 Node<E> temp=head;
    	 int i=0;
    	 while(i !=pos-1) {
    		 temp=temp.next;
    		 i++;
    	 }
    	 Node<E> val=temp;
    	 temp.next=temp.next.next;
    	 return (E) val.data;
     }
     public boolean isEmpty() {
    	 return head==null;
     }
	public void print() {
		Node<E> temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
			}
	}
	public E show_current() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is empty");}
			Node<E> temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			return temp.data;
		}
	
	public E removeLast() throws Exception {
		if(isEmpty()) {
			throw new Exception("Node not founf");
			
		}
		Node<E> temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		Node <E> val=temp.next;
		temp.next=null;
		return val.data;
	}
	
	class Node<E>{
		Node<E> next;
		E data;
		Node(E data){
			this.data=data;
		}
	}
}
