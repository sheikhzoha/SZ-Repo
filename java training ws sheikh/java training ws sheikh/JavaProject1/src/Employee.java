
public class Employee {
//for constructor reference
	private int empId;
	private String name;
	private int salary;
	private int deptNo;
	private String job;
	
	public Employee(int empId, String name, int salary,int deptNo, String job) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.deptNo = deptNo;
		this.job=job;
	}
	
	public Employee(int empId, String name, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		
	}

	public Employee() {
	
		empId=1011;
		name="FOO";
	}

	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	@Override
	public String toString() {
		
		return "Employee [ EmpID ="+empId+", Name = "+name+"]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public static int sortBySalary(Employee obj1, Employee obj2) {
		Integer age1= obj1.getSalary();
		Integer age2= obj2.getSalary();
		return age1.compareTo(age2);
	}
	
	public static int sortByName(Employee obj1, Employee obj2) {
		String age1= obj1.getName();
		String age2= obj2.getName();
		return age1.compareTo(age2);
	}
}
