package oops;

public class PersonMain {

	public static void main(String args[]) {
		Person vishnu = new Person(10, "Vishnu", 'M');

		System.out.println(vishnu.id);
		System.out.println(vishnu.name);
		System.out.println(vishnu.gender);

		Person rahul = new Person(11, "rahul", 'M');

		System.out.println(rahul.id);
		System.out.println(rahul.name);
		System.out.println(rahul.gender);
	}
}
