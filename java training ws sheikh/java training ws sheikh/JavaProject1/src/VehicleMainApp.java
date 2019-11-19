
public class VehicleMainApp {

	public static void main(String[] args) {
		Vehicle car = new Car();
		car.accelarate();
		car.applyBrakes();
		
		Vehicle bus = new Vehicle() { // anonymous class

			@Override
			public void accelarate() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void applyBrakes() {
				// TODO Auto-generated method stub
				
			}
			public void  honkHorns() { 
				// this can be called using only in the one of the defined method
				
			}
			
		};
		//anonymous class are used when you don't require reusability of a class
		bus.accelarate();
		bus.applyBrakes();
		
		//lambda expressions
/*		Void return type and no input param impl 
 * 		Greeting greeting = () -> System.out.println("Good Morning");
		greeting.greet();
*/
		
/*		//lambda with return tpye and no input param
		Greeting greeting = ()-> "Good morining";
		System.out.println(greeting.greet());
		//Or
		Greeting greeting1 = ()-> {return "Good morining";};
		System.out.println(greeting1.greet());
*/
/*		//lambda with input params
		Greeting greeting =(name)-> System.out.println("Good morning "+name);
		greeting.greet("foo");
*/
		//lambda with return type and input param
		Greeting greeting =(name)-> "Good morning"+name;
		System.out.println(greeting.greet("Foo"));
		
// Operation implementation
		Operations add = (a,b)-> a+b;
		Operations substract = (a,b)-> a-b;
		Operations multiply = (a,b)-> a*b;
		Operations division = (a,b)-> a/b;
		
		System.out.println(add.operate(2, 3));
		add.checkdefault();
		System.out.println(substract.operate(10, 8));
		System.out.println(multiply.operate(2, 3));
		System.out.println(division.operate(10, 5));
		

	}

}
