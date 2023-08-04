package Programs;

import java.util.HashMap;

public class Duplicate_characters_in_a_string {

	public static void main(String[] args) {
		String str = "Parameshdsdcdhcvcbdgdbcdhgp";// here 'P' is case sensitive
		char[] chars = str.toLowerCase().toCharArray();
		// char[] chars=str.toCharArray(); // for all lower case
		// "parameshdsdcdhcvcbdgdbcdhgp"

		System.out.println("Duplicate chars are :");
		for (int i = 0; i < chars.length; i++) {
			int count = 1;
			if (chars[i] == '0')
				continue;
			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i] == chars[j]) {

					count++;
					chars[j] = '0';
				}
			}
			if (count > 1) {
				System.out.println(chars[i] + " ");
			}

		}

		// Duplicate char by using Hashmap

		String strNum = "1122334";

		printDuplicateChars(strNum);
	}

	public static void printDuplicateChars(String str) {

		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		for (char ch : str.toCharArray()) {

			charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
		}

		for (char ch : charCountMap.keySet()) {
			int count = charCountMap.get(ch);

			if (count > 1) {
				System.out.println(ch);

			}

		}
	}
}
