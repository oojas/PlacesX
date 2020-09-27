package tress;

public class node {
    int data;
    node left;
    node right;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public node getLeft() {
		return left;
	}
	public void setLeft(node left) {
		this.left = left;
	}
	public node getRight() {
		return right;
	}
	public void setRight(node right) {
		this.right = right;
	}
    public node(int value) {
    	this.data=value;
    }
    public void insert(int value) {
    	if(value==data) {
    		return;
    	}
    	if(data<value) {
    		if(left==null) {
    			left= new node(value);
    		}
    		else {
    			left.insert(value);
    		}
    	}
    	else {
    		if(right==null) {
    			right=new  node(value);
    		}
    		else {
    			right.insert(value);
    		}
    	}
    }
}
