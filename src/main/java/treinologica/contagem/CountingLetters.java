package treinologica.contagem;

public class CountingLetters {

    public static void countingLetters(String text){
        text = text.toLowerCase().trim();
        int [] vet = new int[26];

        for(int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            int position = c - 'a';
            vet[position]++;
        }

        for(int i = 0; i< vet.length; i ++){
            if(vet[i] > 0){
                char letter = (char)(i+ 'a');
                System.out.println(letter + ": " + vet[i]);
            }
        }

    }
    public static void main(String[] args) {
        String world = "Program";
        countingLetters(world);
    }
}
