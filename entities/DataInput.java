package entities;

import java.util.Scanner;

public class DataInput {
    private Scanner scanner;

    public void input(){
        Calculo calculo = new Calculo();
        scanner = new Scanner(System.in);
        System.out.println("numero1: ");
        double soma1 = scanner.nextDouble();
        System.out.println("numero2: ");
        double soma = scanner.nextDouble();
        calculo.setSoma1(soma1);
        calculo.setSoma2(soma);
        System.out.println(calculo.x());

    }
}
