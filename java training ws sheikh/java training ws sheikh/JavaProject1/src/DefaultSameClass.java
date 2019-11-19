
public class DefaultSameClass implements Interface1,Interface2{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		Interface1.super.method1();
		Interface2.super.method1();
	}

}
