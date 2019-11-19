
@FunctionalInterface
public interface Greeting {

	//public void greet(); // interface with only one method is a functional interface
	//public String greet(); // function with return type
	//public void greet(String name); // function with input param
	public String greet(String name); // function with input param and return type
}
