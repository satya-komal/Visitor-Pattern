package wordCount.TreeProcessingVisitorI;

import java.io.BufferedWriter;

import wordCount.treesForStrings.BST;

public interface TreeProcessingVisitorI {
public void visit(BST bst,BufferedWriter outputWriter);
}
