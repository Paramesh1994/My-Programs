package Programs;

public class Remove_all_white_spaces_from_a_string_with_using_replace {

	public static void main(String[] args) {
		String str = "Paramesh Reddy";
		String newstr=str.replaceAll("\\s", "");
		System.out.println(newstr);
		
		//remove all white spaces from a string without using replace()

		
		 String str1 = "Saket Saurav        is an Autom ation Engi ne      er";
		  
	        char[] chars = str1.toCharArray();
	  
	        StringBuffer sb = new StringBuffer();
	  
	        for (int i = 0; i< chars.length; i++)
	        {
	            if( (chars[i] != ' ') )
	            {
	                sb.append(chars[i]);
	            }
	        } 
	        System.out.println(sb);
	}

}
