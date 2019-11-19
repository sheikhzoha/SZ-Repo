
public class Person {

	private int age;
	private String name;
	private String address;
	
	public Person(int age, String name, String address) {
		this.age=age;
		this.name=name;
		this.address= address;
	}
	
	public Person() {
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		
		return "Person [ age = "+age+", name ="+name+" , Address="+address+ " ]";
	}
	
	public int compareByName(Person obj1, Person obj2) {
		return obj1.getName().compareTo(obj2.getName());
	}
	
	public static int sortByAge(Person obj1, Person obj2) {
		Integer age1= obj1.getAge();
		Integer age2= obj2.getAge();
		return age1.compareTo(age2);
	}
	
	
}
