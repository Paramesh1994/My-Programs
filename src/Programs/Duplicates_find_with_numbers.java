package Programs;

import java.util.ArrayList;

public class Duplicates_find_with_numbers{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hi All Hello everyone";
		findDuplicates(str);

	}

	public static void findDuplicates(String str) {

		int count = 0;
		ArrayList<Character> chlist = new ArrayList<>();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			for (int j = 0; j < str.length(); j++) {

				if (str.charAt(j) != ch)
					continue;

				count++;

			}
			if (!chlist.contains(ch)) {
				// check if count is more than 1 i.e. duplicate and char should not be space
				if (count > 1 && ch != ' ') {

					System.out.println("Char: " + ch + ", Count: " + count + " times.");
					chlist.add(ch);
				}
			}
			count = 0;
		}

	}

}
