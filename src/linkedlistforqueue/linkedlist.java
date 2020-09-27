package linkedlistforqueue;

public class linkedlist {
	node head;
	public boolean isEmpty() {
		return head==null;
	}
	public void add(int data) {
		node toAdd=new node(data);
		if(isEmpty()) {
			head=toAdd;
		}
		node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=toAdd;
		toAdd.next=null;
	}
	public void remove() throws Exception{
		node temp=head;
		if(isEmpty()) {
			throw new Exception("Node not found");
		}
		
	}
   class node{
	   int data;
	   node next;
	   node(int data){
		   this.data=data;
		   next=null;
	   }
   }
}
