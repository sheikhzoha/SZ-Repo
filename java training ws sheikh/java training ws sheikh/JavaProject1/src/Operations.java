@FunctionalInterface
public interface Operations {

	public int operate(int a, int b);
	public default void checkdefault() {
		System.out.println("default works with functional");
	}
}
