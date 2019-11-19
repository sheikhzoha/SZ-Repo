
public class EmployeeMain {

	public static void main(String[] args) {
		IEmployee1 employee1 = Employee::new;
		Employee emp1 = employee1.getEmployee();
		System.out.println(emp1);
		IEmployee2 employee2 = Employee::new;
		Employee emp2 = employee2.getEmployee(101,"BAR");
		System.out.println(emp2);
	}

}
