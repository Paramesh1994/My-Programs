package java_imp_concepts;
class methodRepo{
	//https://www.youtube.com/watch?v=uWb_erCjAUA&list=PL-a9eJ2NZlbT0Hoo_Hj43utwgq2VusPyN&index=3
	public methodRepo printName(String name) {
		System.out.println("Name is "+ name);
		//return new methodRepo();
		return this;
		
	}
	public methodRepo printAge(int age){
		System.out.println("age is "+ age);
		//return new methodRepo();
		return this;
		
	}
}
public class Methos_chaining {

	public static void main(String[] args) {
		methodRepo Mrepo=new methodRepo();
		//Mrepo.printName("paramesh");
		//Mrepo.printAge(29);
		Mrepo.printName("paramesh").printAge(29);

	}

}
