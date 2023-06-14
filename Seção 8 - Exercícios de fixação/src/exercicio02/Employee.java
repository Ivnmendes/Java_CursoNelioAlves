package exercicio02;
public class Employee {
    private String name;
    private double grossSalary;
    private double salary;
    private double tax;

    public Employee(String name, double grossSalary) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = 1000;
        this.salary = netSalary();
    }

    public double netSalary() {
        return this.grossSalary - this.tax;
    } 
    
    public void increaseSalary(double percentage) {
        this.salary = this.salary + this.grossSalary * (percentage/100);
    }
    
    @Override
    public String toString() {
        return "Employee{" + "\n"
                + "name=" + name + ", \n"
                + "Salary=" + salary + "\n"
                + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
