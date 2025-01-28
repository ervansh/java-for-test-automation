package java8.ht.constructorreference;

@FunctionalInterface
public interface EmployeeFactory {
	Employee addEmployee(String name, int account, int salary);
}
