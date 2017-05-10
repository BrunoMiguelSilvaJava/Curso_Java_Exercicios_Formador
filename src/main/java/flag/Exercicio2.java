package flag;

import java.util.Scanner;

/**
 * Created by Ricardo on 08/05/2017.
 */
public class Exercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        String merged = FlagUtils.mergeStrings(s1, s2);
        String s = String.format(
                "Resultado do merge: %s ", merged);

        System.out.println(s);
    }
}
