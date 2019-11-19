
public interface Animal {
	public void eat();
	public void speak();
	public default void walk() {
		System.out.println("Animal walks");
	}; 
	// default keyword is used to register the method as non abstract so that it dont disturb the 
	//implemented class contract, so this method is concrete

}
