package java8.ht.lambdaExpressionsHT;

public class Employee {

	private String name;
	private int empid;

	public Employee(String name, int empid) {
		super();
		this.name = name;
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	@Override
	public String toString() {
		return "Empoyee [name: " + name + " empid : " + empid + " ]";
	}

}
