package treinologica.basico;

import java.util.List;

public class PlusMinus {

    public static void plusMinus(int [] arr) {
        double positive = 0;
        double negative = 0;
        double nullo = 0;

        int tam = arr.length;

        for (int j : arr) {
            if (j > 0) {
                positive++;
            } else if (j < 0) {
                negative++;
            } else {
                nullo++;
            }
        }
        System.out.printf("%.6f%n",positive/tam);
        System.out.printf("%.6f%n",negative/tam);
        System.out.printf("%.6f%n",nullo/tam);

    }

    public static void main(String[] args) {
        int [] vet = {1, 2, 3, 0, 0, -3, -2, -1 };

        plusMinus(vet);
    }
}
