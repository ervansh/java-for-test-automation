package java8.ht.constructorreference;


public class Task {

	public static void main(String[] args) {
		
		EmployeeFactory factory = Employee::new;
		Employee emp = factory.addEmployee("John", 987654321, 50000);
		
		System.out.println("Employee name: "+emp.getName()+"\n"+
				"Employee account: "+emp.getAccount()+"\n"+
				"Employee name: "+emp.getSalary()+"\n"
				);
		
	}
}
