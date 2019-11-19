import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {

	public static void main(String[] args) {

		List<String> cities = Arrays.asList("agra","delhi","pune","allahabad","mumbai");
		
		List<String> filteredList = cities.stream().filter(a->a.startsWith("a")).map(y->y+" XX").collect(Collectors.toList());
		List<String> SortedList = cities.stream().sorted().collect(Collectors.toList());
		
		System.out.println(SortedList);		
		System.out.println(filteredList);
		cities.forEach(a-> {
			if(a.startsWith("a"))
				System.out.println(a);
		});
		
		Employee e1 = new Employee(1, "ONE", 10000);
		Employee e2 = new Employee(2, "TWO", 20000);
		Employee e3 = new Employee(3, "THREE", 15000);
		Employee e4 = new Employee(4, "FOUR", 13000);
		
		List<Employee> empList = Arrays.asList(e1,e2,e3,e4);
		
		List<Employee> empFilteredList = empList.stream().filter(e->e.getSalary()>10000).collect(Collectors.toList());
		System.out.println(empFilteredList);
		
		//sorting using comparator method reference
		List<Employee> empSortedList = empList.stream().sorted(Employee::sortBySalary).collect(Collectors.toList());
		System.out.println(empSortedList);
		
		List<String> customDish = Dish.menu.stream().filter(a->a.getCalories()<400).sorted(Dish::compareByName).map(a->a.getName()).collect(Collectors.toList());
		
		System.out.println("Custom Dish menu "+customDish);
		
		
		List<Employee> empList1 = Arrays.asList(new Employee(1, "1", 100, 1, "A"),
				new Employee(2, "2", 25, 2, "B"),new Employee(3, "3", 130, 1, "A"),new Employee(4, "4", 120, 2, "A"),new Employee(5, "5", 50, 1, "B"));
	
		List<Employee> empFilList =empList1.stream().filter(e-> e.getSalary()>50 && e.getDeptNo()==1).sorted(Employee::sortByName).collect(Collectors.toList());
		System.out.println(empFilList);
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
		
		
	
	

}
