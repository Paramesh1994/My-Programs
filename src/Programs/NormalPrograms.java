package Programs;

public class NormalPrograms {

	public static void main(String[] args) {
		String st = "Java,selenium,maven,testng,automation";
		String[] sp = st.split(",");
		for (String s1 : sp) {
			System.out.println(s1);
		}
		System.out.println("\r"); 			// regex "\r" and "\n" gives new row or line 
		
		// Split numbers, Alphabets and Special chars
		
		String str = "$$Paramesh$$1^&&^374347fjjfn#$%#";
		// str = str.replaceAll("[^0-9]", ""); // this regex gives only number

		// System.out.println(str);
		StringBuffer alpha = new StringBuffer(), num = new StringBuffer(), special = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)))
				num.append(str.charAt(i));
			else if (Character.isAlphabetic(str.charAt(i)))
				alpha.append(str.charAt(i));
			else
				special.append(str.charAt(i));
		}
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(special);
		
		
		// string reverse 
		
		
		System.out.println("\n");
        String param= "Saiteja";
        String mesh = " is a good boy";
        StringBuilder str2 = new StringBuilder();
        str2.append(param);
        str2.append(mesh);
        str2 = str2.reverse();     // used string builder to reverse
       System.out.println(str2);
       
       System.out.println("\n");
		
		
	    String stri = "Paramesh123456789";  
	    String st1=stri.replaceAll("[^A-Za-z]", "");  
	    String st2=stri.replaceAll("[^0-9]", "");  
	    System.out.println("String b = "+st1);  
	    System.out.println("Int c = "+st2); 
	}

}
