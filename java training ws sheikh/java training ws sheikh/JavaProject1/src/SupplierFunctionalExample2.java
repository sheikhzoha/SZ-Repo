import java.util.function.Supplier;

public class SupplierFunctionalExample2 {

	public static void driveVehicle(Supplier<? extends Avehicle> supp) {
		supp.get().drive();
	}
	public static void main(String[] args) {
		
		Supplier<Avehicle> supp = ()->new Avehicle();
		driveVehicle(supp);
		driveVehicle(()->new Car()); // lambda
		
		//method ref
		
		driveVehicle(Avehicle::new);
		driveVehicle(Car::new);

	}

}
