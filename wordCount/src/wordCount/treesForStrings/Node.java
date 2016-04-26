package wordCount.treesForStrings;

public class Node {
   public String st;
   public Node left;
   public Node right;
   public int wordCount;
  
  
  public Node (String st) {
      this.st = st;
      right = null;
      left = null;
      wordCount =1;
  }
}


/*	if(check) {
Node newNode = new Node(id);
if(root==null){
root = newNode;
return;
}
else{
current = root;
Node parent = null;
while(true){
parent = current;
int i= id.compareTo(current.st);
if(i<0){				
	current = current.left;
	if(current==null){
		parent.left = newNode;
		System.out.println(newNode.st);
		return;
	}
}else{
	current = current.right;
	if(current==null){
		parent.right = newNode;
		System.out.println(newNode.st);
	}
}
}
}
}  */