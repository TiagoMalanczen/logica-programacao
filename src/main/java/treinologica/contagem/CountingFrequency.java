package treinologica.contagem;

import java.util.Locale;

public class CountingFrequency {

    public static void countingFrequency(String text){
        text = text.toLowerCase();
        int[] vet = new int[26];

        for(int i = 0; i<text.length(); i++){
            char c = text.charAt(i);
            if(c >= 'a' && c <= 'z') {
                int position = c - 'a';
                vet[position]++;
            }
        }

        for (int i = 0; i < vet.length; i++){
            if(vet[i] > 0) {
                char letter = (char)('a' +i);
                System.out.println(letter + ": " + vet[i]);
            }
        }

    }
    public static void main(String[] args) {
        String world = "Program";
        countingFrequency(world);
    }
}
