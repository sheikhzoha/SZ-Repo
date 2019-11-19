import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonMain {

	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<>();
		list.add(new Person(22,"FOO", "123 Main St"));
		list.add(new Person(27,"BOO", "124 Main St"));
		list.add(new Person(24,"ZOO", "125 Main St"));
		list.add(new Person(21,"BAR", "126 Main St"));
		list.add(new Person(26,"CAP", "127 Main St"));
		Person p = new Person();
		//Instead of creating a comparator and writing logic for comapre method we can 
		//just provide a reference for compare method to take logic from here compareBYName
		Collections.sort(list,p::compareByName);
		System.out.println(list);
		
		//we can use static method define in person calss to serve as comparator as method is static
		//so we dont require an object for method reference 
		Collections.sort(list,Person::sortByAge);
		System.out.println(list);
		

	}

}
