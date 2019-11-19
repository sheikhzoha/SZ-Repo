package assignments;

public class TestCalculator {

	static int addition (int a , int b) {
		return a+b;
	}
	
	public int substraction(int a , int b) {
		return a-b;
	}
	public static void main(String[] args) {
		
		Calculator add = TestCalculator::addition;
		System.out.println(add.operation(1, 2));
		
		TestCalculator sub = new TestCalculator();
		Calculator subs = sub::substraction;
		System.out.println(subs.operation(3, 2));

	}

}
