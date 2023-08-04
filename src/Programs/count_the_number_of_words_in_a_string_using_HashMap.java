package Programs;

import java.util.HashMap;

public class count_the_number_of_words_in_a_string_using_HashMap {

	public static void main(String[] args) {
		 String str = "this this is is a a Automation";
	        String[] split = str.split(" ");
	         
	        HashMap<String,Integer> map = new HashMap<String,Integer>();
	        for (int i=0; i<split.length; i++) {
	            if (map.containsKey(split[i])) {
	                int count = map.get(split[i]);
	                map.put(split[i], count+1);
	            }
	            else {
	                map.put(split[i], 1);
	            }
	        }
	        System.out.println(map);
	}
}
