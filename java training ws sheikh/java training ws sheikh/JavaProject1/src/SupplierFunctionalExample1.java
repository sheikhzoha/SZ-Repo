import java.util.Date;
import java.util.function.Supplier;

public class SupplierFunctionalExample1 {

	public static void main(String[] args) {
		
		Supplier<String> sup = ()->new String("hello foo");
		System.out.println(sup.get());
		
		//using constructor rference
		
		Supplier<String> sup1 = String::new;
		System.out.println("Empty string "+sup1.get());
		
		//using method reference
		Supplier<Date> sup2 = SupplierFunctionalExample1::getSysDate;
		System.out.println("Date "+sup2.get());

	}
	
	public static Date getSysDate() {
		return new Date();
	}

}
