package flag;

import java.util.Scanner;

/**
 * Created by Ricardo on 08/05/2017.
 */
public class Exercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        boolean iguais = FlagUtils.equalStrings(s1, s2);
        String s = String.format(
                "As strings%s são iguais", iguais?"":" não");

        System.out.println(s);
    }
}
