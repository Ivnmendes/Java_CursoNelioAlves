package exercicio03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();        
        
        student.setFirstQuarter(sc.nextDouble());
        student.setSecondQuarter(sc.nextDouble());
        student.setThirdQuarter(sc.nextDouble());
        
        System.out.println(student);
    }
}
