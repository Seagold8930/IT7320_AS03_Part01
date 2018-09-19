package part1_Mockito;

public class Employee implements IEmployee {
	private int salary;
	IEmployee obj;
	
	
	public Employee(int salary) {
		this.salary = salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setObj(IEmployee obj) {
		this.obj = obj;
	}

	public double computeTax(int amount) {
		return obj.computeTax(amount);
	}

	public double weeklySalary(Employee emp) {
		return obj.weeklySalary(emp);
	}

	public double fortnightSalary(Employee emp) {
		return obj.fortnightSalary(emp);
	}

	public double computeKiwiSaver(Employee kiwiOption) {
		return obj.computeKiwiSaver(kiwiOption);
	}
	
}
