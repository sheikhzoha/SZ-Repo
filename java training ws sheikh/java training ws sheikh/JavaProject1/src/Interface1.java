
public interface Interface1 {

	public default void method1() {
		System.out.println("Interface 1");
	}
	
	static void staticMethod() {
		System.out.println("Static method in interface");
	}
}
