package wordCount.treesForStrings;

import java.io.BufferedWriter;
import java.util.ArrayList;

import wordCount.TreeProcessingVisitorI.TreeProcessingVisitorI;

public class BST {
	public static Node root , rr2;
	
	public BST(){
	
		this.root =null;
	}
	int sum=0,max=0,len=0,no=0;
	ArrayList<String> l = new ArrayList<String>();
	int j=1;
	public Node getRoot(){
		return root;
	}
	public void setRoot(Node root){
       this.root =root;
	}
	
	public void accept(TreeProcessingVisitorI visitor ,  BufferedWriter outputWriter ){
		visitor.visit(this, outputWriter);
	}
	
	public void insert(String key) {
	  boolean check = compare(key,root);
     if(check)	
		root = insertNode(root, new Node(key),key);
	}

	private Node insertNode(Node currentParent, Node newNode,String s) {
	    if (currentParent == null) {
	        if(j==1)
	        {
	        rr2=newNode;
	        	j++;
	        }
	        	return newNode;
	    } else if (newNode.st.compareTo(currentParent.st)>0 ) {
	        currentParent.right = insertNode(currentParent.right, newNode,s);
	    } else if (newNode.st.compareTo(currentParent.st)<0) {
	        currentParent.left = insertNode(currentParent.left, newNode,s);
	    }
	    return currentParent;
	}	
		
	public boolean compare(String st2,Node node){
		if (node!=null){
					compare(st2, node.left);
					if(st2.compareTo(node.st)==0){
						node.wordCount++; 
						return false;
					}
					compare(st2, node.right);			
		}
		return true;
	 }  
	
	public void printInorder(Node node){
		if (node!=null){
			printInorder(node.left);
			System.out.print(node.st+ " ");
			System.out.println(node.wordCount);
			printInorder(node.right);
		}
	}
	public int wordCount(Node node){
		if (node!=null){
			wordCount(node.left);
		    sum+= node.wordCount;	
			wordCount(node.right);
		}
		return sum;
	}
	public int freq(Node node){
		if (node!=null){
			freq(node.left);
            if(node.wordCount>max) max= node.wordCount;
			freq(node.right);
		}
		return max;
	}
	public ArrayList<String> fString(Node node,int f){
		if (node!=null){
			fString(node.left,f);
            if(node.wordCount==f) l.add(node.st);
			fString(node.right,f);
		}
		return l;
	}
	public int stringLen(Node node) {
		// TODO Auto-generated method stub
		if (node!=null){
			stringLen(node.left);
            len+= node.st.length();
            stringLen(node.right);
		}	
		return len;
  }
	
	public int search(Node node, String se) {
		// TODO Auto-generated method stub
		if (node!=null){
			search(node.left,se);
            if(se.compareTo(node.st)==0) {
            	no= node.wordCount;
            	return no;
            }
            search(node.right,se);
		}	
		return no; 
	}
}
