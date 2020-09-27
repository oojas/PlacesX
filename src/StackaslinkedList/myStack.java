package StackaslinkedList;

public class myStack <E>{
    linkedListforStack<E> ll=new linkedListforStack<E>();
    public void push(E data) {
    	ll.add(data);
    }
    public void print() {
    	ll.print();
    }
    public E pop()throws Exception {
    	if(ll.isEmpty()) {
    		throw new Exception("Value cannot be deleted from empty stack");
    	}
      E val =ll.removeLast();
      return val;
    }
    public E peek()throws Exception{
    	E val=ll.show_current();
    	return val;
    }
}
