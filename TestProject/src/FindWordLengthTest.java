
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class FindWordLengthTest {
	
	@Test
	public void testFindLongestWordLength() {
		String message = "The cow jumped over the moon.";
		System.out.println("Running testFindLongestWordLength with input sentence: " + message);
		int length = FindWordLength.findLongestWord(message).length();
		assertEquals(6, length);
	}
	   
	@Test
	public void testFindLongestWord() {
		String message = "The cow jumped over the moon.";
		System.out.println("Running testFindLongestWord with input sentence: " + message);
		String word = FindWordLength.findLongestWord(message);
		assertEquals("jumped", word);
	}
	
	@Test
	public void testFindShortestWordLength() {
		String message = "The cow jumped over the moon.";
		System.out.println("Running testFindShortestWordLength with input sentence: " + message);
		int length = FindWordLength.findShortestWord(message).length();
		assertEquals(3, length);
	}
	   
	@Test
	public void testFindShortestWord() {		
		String message = "The cow jumped over the moon.";
		 List<String> list = new ArrayList<String>( 
		            Arrays.asList("The",
		                          "cow", 
		                          "the")); 
		System.out.println("Running testFindShortestWord with input sentence: " + message);
		String word = FindWordLength.findShortestWord(message);		
		assertTrue(list.contains(word));
	}
}
 