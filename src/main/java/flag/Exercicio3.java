package flag;

import java.util.Scanner;

/**
 * Created by Ricardo on 08/05/2017.
 */
public class Exercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira uma string");
        String s1 = sc.next();
        String reversed = FlagUtils.reverseString(s1);
        String s = String.format(
                "Resultado do reverse string: %s ", reversed);

        System.out.println(s);

        System.out.println("Insira um número");

        int nr = sc.nextInt();
        int reversedNumber = FlagUtils.reverseNumber(nr);
        s = String.format(
                "Resultado do reverse number: %d ", reversedNumber);

        System.out.println(s);

    }
}
