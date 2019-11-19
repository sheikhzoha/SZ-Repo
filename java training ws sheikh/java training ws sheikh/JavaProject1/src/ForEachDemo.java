import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(60);
		list.add(50);
		list.add(40);
		
		list.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});
		//or using lamba exp as consumer is interface having one method so we can use lambda
		list.forEach(a->System.out.println(a));

	}

}
