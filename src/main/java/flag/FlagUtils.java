package flag;

/**
 * Created by Ricardo on 08/05/2017.
 */
public class FlagUtils {

    public static boolean equalStrings(String s1, String s2) {
        return s1.equals(s2);
    }

    public static String mergeStrings(String s1, String s2) {
        StringBuilder sb = new StringBuilder(s1.length() + s2.length());

        int min = Math.min(s1.length(), s2.length());

        for (int i = 0; i != min; i++) {
            sb.append(s1.charAt(i));
            sb.append(s2.charAt(i));
        }

        if (s1.length() > min) {
            sb.append(s1.substring(min));
        }
        if (s2.length() > min) {
            sb.append(s2.substring(min));
        }

        return sb.toString();
    }

    public static String reverseString(String s1) {
        StringBuilder sb = new StringBuilder(s1.length());
        for (int i = s1.length() - 1; i >= 0; i--) {
            sb.append(s1.charAt(i));
        }
        return sb.toString();
    }

    public static int reverseNumber(int nr) {
        String nrStr = Integer.toString(nr);
        String nrStrReversed = reverseString(nrStr);
        int nrReversed = Integer.parseInt(nrStrReversed);
        return nrReversed;
    }

    public static void printIntArray(int[] arr) {
        StringBuilder sb = new StringBuilder(arr.length * 3);
        sb.append("{ ");
        for (int i = 0; i != arr.length; i++) {
            sb.append(arr[i]);
            if (i != arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append(" }");
        String resultado = sb.toString();
        System.out.println(resultado);
    }

    public static int[] removeZeros(int[] batatas) {
        //contar números != zero
        int count = 0;

        for(int nr : batatas){
            if(nr != 0) {
                count++; //Ou count = count + 1;
            }
        }

        //O ciclo anterior é igual a este:
        for(int i=0; i!= batatas.length; i++) {
            int nr = batatas[i];
            if(nr != 0) {
                count++;
            }
        }

    }
}
