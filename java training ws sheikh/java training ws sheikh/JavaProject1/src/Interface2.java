
public interface Interface2 {

	public default void method1() {
		System.out.println("Interface 2");
		//return 0; we can have differennt return type of same method name in 2 diff interfaces
	}
}
