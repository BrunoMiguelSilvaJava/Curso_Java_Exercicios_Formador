package flag;

import java.util.Scanner;

/**
 * Created by Ricardo on 08/05/2017.
 */
public class Exercicio5 {
    public static void main(String[] args) {

        int[] arr1 = {0, 1, 2, 3, 4, 0};
        int[] arr2 = {0, 0, 1, 0, 2, 3, 4, 0};
        int[] arr1SemZeros = FlagUtils.removeZeros(arr1);
        int[] arr2SemZeros = FlagUtils.removeZeros(arr2);

        FlagUtils.printIntArray(arr1SemZeros);
        FlagUtils.printIntArray(arr2SemZeros);
    }
}
