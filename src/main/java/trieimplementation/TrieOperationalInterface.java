package trieimplementation;

import java.util.List;

public interface TrieOperationalInterface {

	
	public boolean add(String word);
	
	public boolean contains(String word);
	
	public List<String> search(String prefix);
}
