import java.util.HashMap;
import java.util.Map;


public class Solution {
	public boolean makeEqual(String[] words) {
		HashMap<Character, Integer> charCount = new HashMap<>();
		
		for (String word : words) {
				for (char ch : word.toCharArray()) {
						charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
						System.out.println(charCount.get(ch) + " " + ch);
				}
		}
		
		for (int count : charCount.values()) {
				if (count % words.length != 0) {
						return false;
				}
		}

		return true;
}
public static void main(String[] args){
		Solution sol = new Solution();
		String[] words = {"abc","aabc","bc"};
		System.out.println(sol.makeEqual(words));
}
}