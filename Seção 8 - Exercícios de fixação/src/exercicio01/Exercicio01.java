package exercicio01;

public class Exercicio01 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(3,4);
        System.out.printf("Area %.3f%n", r.area());
        System.out.printf("Perimeter %.3f%n", r.perimeter());
        System.out.printf("Diagonal %.3f%n", r.diagonal());
    }
}
