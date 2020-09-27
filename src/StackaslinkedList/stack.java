package StackaslinkedList;

public class stack {

	public static void main(String[] args) throws Exception {
	myStack<Integer> ll=new myStack<Integer>();
	ll.push(23);
	ll.push(32);
	ll.push(56);
	//int n=ll.pop();
	ll.pop();
	int val=ll.peek();
	//ll.pop();
	System.out.println(val);
	//System.out.println(n);
	ll.print();
	

	}

}
