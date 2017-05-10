package exercicios;

import java.util.Scanner;

/**
 * Created by Ricardo on 03/05/2017.
 */
public class Exercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduza o 1º número");
        float firstNumber = scanner.nextFloat();

        System.out.println("Introduza o 2º número");
        float secondNumber = scanner.nextFloat();
        float sum = firstNumber+secondNumber;
        System.out.println(String.format(
                "Resultado da soma: %.2f", sum));

    }
}
