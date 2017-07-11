package tests.trieimplementation;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import trieimplementation.ArrayBasedTrie;

public class TrieTest {

	
	@Test
	public void baseTest(){
		ArrayBasedTrie testTrie = new ArrayBasedTrie();
		
		
		testTrie.add("so");

		testTrie.add("sole");
		testTrie.add("some");
		testTrie.add("soot");
		testTrie.add("solar");
		testTrie.add("somatic");
		testTrie.add("sore");
		testTrie.add("soy");
		testTrie.add("sow");
		testTrie.add("sock");
		testTrie.add("sob");
		testTrie.add("sonogram");
		testTrie.add("soggy");
		testTrie.add("soft");
		
		testTrie.add("sam");
		testTrie.add("sand");
		testTrie.add("sank");
		testTrie.add("sandwich");
		testTrie.add("samoa");
		testTrie.add("sale");
		
		testTrie.add("sat");
		testTrie.add("satch");
		testTrie.add("satchel");
		
		
	
		List<String> strs = testTrie.search("sat");
		List<String> strs2 = testTrie.search("so");
		List<String> strs3 = testTrie.search("sa");
		
		assertEquals(strs.size(), 3);
		assertEquals(strs2.size(), 14);
		assertEquals(strs3.size(), 9);
		
	}
}
