import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.function.Predicate;

public class PredicateInterfaceExample1 {

	public static void main(String[] args) {
		
		Predicate<Integer> pr = age -> {return age>18;};
		Predicate<Integer> pr2 = age -> {return age<30;};
		pr.test(10);
		pr.and(pr2).test(20); // two predicates combined using and operation
		
		Predicate<String> pr1 = pwd -> {return pwd.length()>=4 && pwd.length()<=8;};
		pr1.test("2321");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		sdf.format(date);
		System.out.println(sdf.format(date));
		
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);

	}

}
