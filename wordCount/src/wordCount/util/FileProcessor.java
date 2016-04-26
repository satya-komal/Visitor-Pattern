package wordCount.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import wordCount.driver.Driver;
import wordCount.treesForStrings.BST;

public class FileProcessor {
	BST bst = new BST();
		public void readLine(String a) throws IOException{
	 Scanner sc =null;
		try {
			sc = new Scanner( new File (a));
		} catch (FileNotFoundException e1) {
	System.out.println("cannot find file");
	System.exit(4);
		}
			while (sc.hasNext()){
				Scanner sc1 = new Scanner(sc.nextLine());	
			while(sc1.hasNext()){
				String s = sc1.next();
				bst.insert(s);
				
				}
			}
			
		 }
      }

