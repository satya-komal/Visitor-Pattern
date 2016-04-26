CS542 Design Patterns
Spring 2016
Assignment 3 README FILE

Due Date: <4/21/2016, IN FORMAT: Thursday, April 21, 2016>
Submission Date: <4/21/2016, IN FORMAT: Thursday, April 21, 2016>
Author(s): <Satya Komal Gutta, Jenil Shah> 
e-mail(s): <sgutta1@binghamton.edu> 


PURPOSE:

[
  To find the total no of words, most frequently occuring string, No of times a given search string is present in a tree built from input file using visitors pattern.
]

PERCENT COMPLETE:

[
  "I believe I have completed 100% of this project."
]

PARTS THAT ARE NOT COMPLETE:

[
  None
]

BUGS:

[
None
]

FILES:

[
README.txt
Diver.java, BST.java,FileProcessor.java,TreeProcessingVisitorI.java,Node.java,populateVisitor.java,wordCountVisitor.java,grepVisitor.java,build.xml
  
]

SAMPLE OUTPUT:

[
  If input.txt conatins :  The cat is a cat
The total no of words are: 4
The most frequently occuring word is : cat
The frequncy of most frequently occuring word is : 2
The no of characters in the bst are : 9
The word <is> occurs the followong times : 1

Avg performance time is 10 
]

TO COMPILE:

[
 ## To clean:
ant -buildfile src/build.xml clean

## To compile: 
ant -buildfile src/build.xml all
 
]

TO RUN:

[
ant -buildfile src/build.xml run -Darg0=input.txt -Darg1=output.txt -Darg2=the -Darg3=20  
]


EXTRA CREDIT:

[
  "N/A"
]


BIBLIOGRAPHY:

[

]

Choice of Data Structure:

a).we used BST data structure to store the distinct strings read from the given input file as its time complexity is log(n) in the average case.
b).we used Arraylist list to store the strings that are having the maximum frequency in the given input file as we dont have to know the size of arraylist 
and it grows dynamically based on the no of strings.
c).Time Complexity of BST is log(N) if the data coming into the BST is not in sorted order, otherwise its Time Complexity is N.

