package treinologica.contagem;

import java.util.HashSet;
import java.util.Set;

public class SockMerchant {
    public static int sockMerchant(int n , int[] ar){
        Set<Integer> unmatchedColors = new HashSet<>();
        int pairs = 0;

        for(int color: ar){
            if(unmatchedColors.contains(color)){
                unmatchedColors.remove(color);
                pairs++;
            }
            else {
                unmatchedColors.add(color);
            }
        }
        return pairs;
    }
    public static void main(String[] args) {
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int n = ar.length;

        System.out.println("Pares encontrados: " + sockMerchant(n, ar));
    }
}
