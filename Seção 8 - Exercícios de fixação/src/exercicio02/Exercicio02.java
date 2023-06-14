package exercicio02;
public class Exercicio02 {
    public static void main(String[] args) {
        Employee e = new Employee("Joao Silva", 6000.00);
        
        System.out.println(e.toString());
        
        e.increaseSalary(10);
        
        System.out.println(e.toString());
    }
}
