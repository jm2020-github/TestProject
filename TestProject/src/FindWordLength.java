
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindWordLength {

	private static final String DEFAULT_STRING = "The cow jumped over the moon.";
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		if(input == null || input.isBlank()) {
			input = DEFAULT_STRING;
		}
		
		System.out.println("The input sentence is: " + input);
		findLongestWord(input);
		findShortestWord(input);

		scanner.close();
	}
	
	public static String findAnyWord(String input, Ordering order) {
		List<String> wordList = Arrays.asList(input.split(" "));
		String word = "";
		if (!wordList.isEmpty()) {
			switch(order){
				case LONGEST:
					wordList.sort((s1, s2) -> s2.length() - s1.length());
					break;
				case SHORTEST:
					wordList.sort((s1, s2) -> s1.length() - s2.length());
					break;
				default:
					wordList.sort((s1, s2) -> s1.length() - s2.length());
					break;
			}

			word = wordList.get(0);
		}
		return word;
	}
	
	public static String findShortestWord(String input) {
		String res = findAnyWord(input, Ordering.SHORTEST);
		System.out.println("Shortest word: " + res + ", with length: " + res.length());
		return res;
	}
	
	
	public static String findLongestWord(String input) {		
		String res = findAnyWord(input, Ordering.LONGEST);
		System.out.println("Longest word: " + res + ", with length: " + res.length());
		return res;
	}
}

enum Ordering{
	LONGEST,
	SHORTEST
}


