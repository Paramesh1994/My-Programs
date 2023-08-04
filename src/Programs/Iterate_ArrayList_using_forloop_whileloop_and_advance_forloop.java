package Programs;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterate_ArrayList_using_forloop_whileloop_and_advance_forloop {

	public static void main(String[] args) {
		ArrayList<String> lists =new ArrayList<String>();
		lists.add("23");
		lists.add("48");
		lists.add("69");
		lists.add("56");
		System.out.println(lists.size());
		System.out.println("While Loop :");
		Iterator<String> it=lists.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("For loop :" );
		for (Object list : lists) {
			System.out.println(list);
		}
		System.out.println("Advance For loop :");
		for (int i = 0; i < lists.size(); i++) {
			System.out.println(lists.get(i));
			
		}
			
	}

}
