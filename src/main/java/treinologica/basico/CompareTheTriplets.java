package treinologica.basico;

import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {

    public static int[] compareTriplets(int[] a, int[] b) {
        int alice = 0;
        int bob = 0;

        for(int i = 0; i < a.length; i++){
            if (a[i] > b[i]){
                alice++;
            }
            if (a[i] < b[i]) {
                bob++;
            }
        }
        int [] valores = {alice, bob};

        return valores;
    }

    public static void main(String[] args) {
        int[] a = {5, 6, 7};
        int[] b = {3, 6, 10};

        int[] result = compareTriplets(a, b);

        System.out.println("Resultado: " + Arrays.toString(result));

    }
}
