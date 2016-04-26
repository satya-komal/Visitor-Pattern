package wordCount.visitors;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import wordCount.TreeProcessingVisitorI.TreeProcessingVisitorI;
import wordCount.driver.Driver;
import wordCount.treesForStrings.BST;

public class grepVisitor implements TreeProcessingVisitorI {
	public static int num;
	@Override
	public void visit(BST bst, BufferedWriter outputWriter) {
	
	num= bst.search(bst.getRoot(),Driver.se);
	try {
		outputWriter.append("The word <"+ Driver.se+ "> occurs the following times:"+num);
	} catch (IOException e) {
	System.out.println("cannot write to file");
	System.exit(4);
	}
	}

}
