package wordCount.driver;
//import TreeProcessingVisitorI.TreeProcessingVisitorI;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import wordCount.TreeProcessingVisitorI.TreeProcessingVisitorI;
import wordCount.treesForStrings.BST;
import wordCount.visitors.PopulateTreeVisitor;
import wordCount.visitors.WordCountVisitor;
import wordCount.visitors.grepVisitor;

public class Driver {
	/**
	 * @param args
	 * @throws IOException 
	 */
	 public static String  ip ;
	 public static String se;
	 public static String op;

	public static void main(String[] args) throws IOException {
      
		if(args.length!=4) System.out.println("Error:There has to be 4 arguments");
        else {
           if( Integer.parseInt(args[3])<=0 || args[3]==null){
        	   System.out.println("Error:You have to enter a positive no");
        	   System.exit(4);
           }
           else if(args[2]==null){
              System.out.println(" Error: You should input a string");        	   
              System.exit(4);
           }
           else {
    	   ip = args[0];
    	   op = args[1];
    	   se = args[2];
    	   int no = Integer.parseInt(args[3]);
    	  
 // Printing the time   	   
    	 long startTime = System.currentTimeMillis();
    	 for(int i=0;i<no;i++){
    	   BST bst = new BST();
    	   BufferedWriter outputWriter=null;
      		try {
      			outputWriter = new BufferedWriter(new FileWriter(op));
      		} catch (IOException e) {
      			System.out.println("cannot open file");
      			System.exit(4);
      		}
    	   TreeProcessingVisitorI pop = new PopulateTreeVisitor();
      	   TreeProcessingVisitorI count = new WordCountVisitor();
      	   TreeProcessingVisitorI grep = new grepVisitor();  
	    	   bst.accept(pop,outputWriter);
	       	   bst.accept(count,outputWriter);
	       	   bst.accept(grep,outputWriter);
	       	outputWriter.close();
    	 }
    	 long finishTime = System.currentTimeMillis();
    	 long total_time = (finishTime-startTime)/no;
    	 System.out.println("Avg Performance test time is "+ total_time);
    	   
        }
      }     
   }
}
