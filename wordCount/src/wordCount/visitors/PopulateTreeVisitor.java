package wordCount.visitors;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

import wordCount.TreeProcessingVisitorI.TreeProcessingVisitorI;
import wordCount.driver.Driver;
import wordCount.treesForStrings.BST;
import wordCount.util.FileProcessor;

public class PopulateTreeVisitor implements TreeProcessingVisitorI {

	@Override
	public void visit(BST bst,BufferedWriter out) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
	 FileProcessor fp = new FileProcessor();
	 try {
		fp.readLine(driver.ip);
	} catch (IOException e) {
		System.out.println("cannot open input file");
		System.exit(4);
	}
	}
}
