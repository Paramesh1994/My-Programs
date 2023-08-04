package Programs;

public class Reverse_a_string_without_using_String_inbuilt_function {

	public static void main(String[] args) {
		String str1="Paramesh";
		StringBuilder str2= new StringBuilder();
		str2.append(str1);
		str2.reverse();
		System.out.println(str2);

	}

}
