package trieimplementation;

public class ArrayTrieNode {


		public static final int ALPHABET_SIZE = 26;
	    private boolean isEndOfWord; 

	    private ArrayTrieNode[] childListLinks; 



		public ArrayTrieNode() {
	    	this.childListLinks = new ArrayTrieNode[ALPHABET_SIZE];
	    }
	    
	    public boolean containsKey(char ch) {
	    	ch = Character.toLowerCase(ch);
	        return this.childListLinks[ch -'a'] != null;
	    }

		public ArrayTrieNode get(char ch) {
			ch = Character.toLowerCase(ch);
	        return this.childListLinks[ch -'a'];
	    }
		
	    public void put(char ch, ArrayTrieNode node) {
	    	ch = Character.toLowerCase(ch);
	    	this.childListLinks[ch -'a'] = node;
	    }
	    public void setEndOfWord() {
	        this.isEndOfWord = true;
	    }
	    public boolean isEndOfWord() {
	        return this.isEndOfWord;
	    }
	    
	    public ArrayTrieNode[] getChildListLinks() {
			return childListLinks;
		}
	    
}
