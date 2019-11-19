import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierConsumerDemo {

	public static void main(String[] args) {
	
		Supplier<Integer> supp = Operation::getNumber;
		Consumer<Integer> con = Operation::calculateSquare;
		
		con.accept(supp.get());

	}

}
