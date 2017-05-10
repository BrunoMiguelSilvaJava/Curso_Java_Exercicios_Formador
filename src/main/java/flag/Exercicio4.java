package flag;

import java.util.Scanner;

/**
 * Created by Ricardo on 08/05/2017.
 */
public class Exercicio4 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        FlagUtils.printIntArray(arr1);

        FlagUtils.printIntArray(new int[]{1, 2, 3, 4, 5});

        Scanner sc = new Scanner(System.in);

        int[] arr2 = new int[3];
        for (int i = 0; i != arr2.length; i++) {
            System.out.println("Introduza um número");
            arr2[i] = sc.nextInt();
        }
        FlagUtils.printIntArray(arr2);
    }
}
