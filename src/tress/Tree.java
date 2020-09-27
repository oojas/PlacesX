package tress;

public class Tree {
   node root;
   public void insert(int value) {
	   if(root==null) {
		   root=new node(value);
	   }
   }
   
}
