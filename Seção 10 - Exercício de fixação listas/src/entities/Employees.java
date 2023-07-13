package entities;

public class Employees {

	private int id;
	private String name;
	private double salary;
	
	public Employees(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void salaryIncrease(double percentile) {
		this.salary = this.salary + this.salary * (percentile / 100);
	}

	@Override
	public String toString() {
		return String.format("id=%d, name=%s, salary=%.2f", id, name, salary);
	}
	
	
}
