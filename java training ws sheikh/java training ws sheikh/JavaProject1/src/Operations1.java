
public interface Operations1 {

	public String checkNumber(Integer num); //prime, even odd, palindrome
	public default void checkdefault() {
		System.out.println("default works with functional");
	}
	
}
