package trieimplementation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayBasedTrie implements TrieOperationalInterface {

	private ArrayTrieNode root;
	 
    /* Constructor */
   public ArrayBasedTrie()
   {
       root = new ArrayTrieNode(); 
   }
   
   public void insert(String word) {
	   //start at the top
       ArrayTrieNode node = root;
       for (int i = 0; i < word.length(); i++) {
           char currentChar = Character.toLowerCase( word.charAt(i) );
           if (!node.containsKey(currentChar)) {
               node.put(currentChar, new ArrayTrieNode());
           }
           node = node.get(currentChar);
       }
       node.setEndOfWord();
   }

   public boolean add(String word) {
	   //start at the top
       ArrayTrieNode node = root;
       for (int i = 0; i < word.length(); i++) {
           char currentChar = Character.toLowerCase( word.charAt(i) );
           if (!node.containsKey(currentChar)) {
               node.put(currentChar, new ArrayTrieNode());
           }
           node = node.get(currentChar);
       }
       if(node.isEndOfWord()){
    	   //was already inserted
    	   return false;
       } else {
    	   node.setEndOfWord();
    	   return true;
       }
   }

   
   private ArrayTrieNode searchPrefix(String word) {
       ArrayTrieNode node = root;
       for (int i = 0; i < word.length(); i++) {
          char curLetter = Character.toLowerCase( word.charAt(i) );
          if (node.containsKey(curLetter)) {
              node = node.get(curLetter);
          } else {
              return null;
          }
       }
       return node;
   }

   // Returns if the word is in the trie.
   public boolean contains(String word) {
      ArrayTrieNode node = searchPrefix(word);
      return node != null && node.isEndOfWord();
   }
  
   
   public boolean hasWordWithPrefix(String prefix) {
       ArrayTrieNode node = searchPrefix(prefix);
       return node != null;
   }
 
	
   public List<String> search(String prefix){
	   // figure this out -- else google how to utilize trie
	   
	   ArrayTrieNode beginHere = searchPrefix(prefix);
	   if(beginHere != null){
		   List<String> matches = new ArrayList<String>();
		   traverseSubtree(prefix, beginHere, matches);
		   return matches;
	   } else {
		   return new LinkedList<String>();
	   }
   }
   
   
   private void traverseSubtree(String prefix, ArrayTrieNode beginHere, List<String> matches) {
	   if(beginHere.isEndOfWord()){
		   matches.add(prefix);
	   }
	   
	   for( int i = 0; i < ArrayTrieNode.ALPHABET_SIZE; i++){
		   if(beginHere.getChildListLinks()[i] != null) {
			   String newPrefix = prefix + (char)(i +'a') ;
			   traverseSubtree(newPrefix, beginHere.getChildListLinks()[i], matches);
		   }
	   }
   }
	
}
