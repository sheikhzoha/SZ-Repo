import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceExample1 {

	static void printmessage(String name) {
		System.out.println("Hello "+name);
	}
	
	static void printValue(int val) {
		System.out.println(val);
	}
	public static void main(String[] args) {
		
		Consumer<String> con1 = ConsumerInterfaceExample1::printmessage;
		con1.accept("FOO");
		
		Consumer<Integer> con2 = ConsumerInterfaceExample1::printValue;
		con2.accept(12);
		
		List<Integer> integers = Arrays.asList(12,43,23,56,34,0,-34);
		Consumer<Integer> intg=a->System.out.println(a);
		Consumer<Integer> consumerWithAndThen = intg.andThen(a->System.out.println("Sqaure"+a*a));
		printValues(integers,intg);
		printValues(integers,consumerWithAndThen);

	}
	public static void printValues(List<Integer> integers, Consumer<Integer> con) {
		for (Integer integer : integers) {
			con.accept(integer);
		}
	}

}
