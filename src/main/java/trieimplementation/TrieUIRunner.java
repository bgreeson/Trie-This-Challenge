package trieimplementation;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class TrieUIRunner {

	
	public static void main(String[] args){
	
	  Scanner scan = new Scanner(System.in);
     
      ArrayBasedTrie trie = new ArrayBasedTrie(); 
      System.out.println("Trie Test\n");          
      char ch;
  
      do    
      {
          System.out.println("\n\n Trie Operations below, enter appropriate integer to indicate function\n");
          System.out.println("1. add ");
          System.out.println("2. contains");
          System.out.println("3. search");
          int choice = 4;
          
          try{
        	  choice = scan.nextInt();
          } catch (InputMismatchException e){
        	  System.out.println("Please enter one of the valid integer options :");
        	  choice = 4;
          }
          
          switch (choice)
          {
          case 1 : 
              System.out.println("Type string element to add");
              String toAdd = scan.next() ;
              boolean isNewlyAdded = trie.add( toAdd );
              if(isNewlyAdded){
            	  //new
            	  System.out.println( toAdd + " is now newly added");
              } else {
            	  System.out.println( toAdd + " Already existed in trie");
              }
              break;                          
          case 2 : 
              System.out.println("Type string to verify it is contained in trie");
              String toVerify = scan.next();
              boolean isFound = trie.contains( toVerify); 
              if(isFound){
            	  System.out.println( toVerify + " exits in trie");
              } else {
            	  System.out.println( toVerify + " MISSING from trie");
              }
              break;                         
          case 3 : 
              System.out.println("Type string element to search prefix");
              String prefix = scan.next();
              List<String> returnedStrings = trie.search(prefix);
              System.out.println("Following strings from trie match prefix : ");
              for( String returned : returnedStrings){
            	  System.out.println("\t" + returned);
              }
              
              break;                                          
          default : 
        	  System.out.println("Please enter one of the valid integer options :");
              break;   
          }
                      
      } while (true);    
		
		
  }
	


	
}
