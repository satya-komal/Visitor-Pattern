package wordCount.visitors;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import wordCount.TreeProcessingVisitorI.TreeProcessingVisitorI;
import wordCount.driver.Driver;
import wordCount.treesForStrings.BST;
import wordCount.util.FileProcessor;

public class WordCountVisitor implements TreeProcessingVisitorI{

	@Override
	public void visit(BST bst,BufferedWriter outputWriter) {
		// TODO Auto-generated method stub
		int val = bst.wordCount(bst.getRoot());
		int freq = bst.freq(bst.getRoot());
		int len = bst.stringLen(bst.getRoot());
		int occur = grepVisitor.num;
		ArrayList<String> arr = new ArrayList<>();
		
		arr= bst.fString(bst.getRoot(),freq);
		    try {
				outputWriter.write("The total no of words is "+ val);
				outputWriter.newLine();
				outputWriter.append("The most frequently used word is: ");
				outputWriter.newLine();
			    for(int i=0;i<arr.size();i++){
							outputWriter.append(arr.get(i));
							outputWriter.newLine();}
			    outputWriter.append("The frequency of the most frequently used word is: "+ freq);
				outputWriter.newLine();
				outputWriter.append("The no of characters in the BST are "+ len);
				outputWriter.newLine();
			
			} catch (IOException e) {
				System.out.println("cannot write to file");
			}
	}	
}
