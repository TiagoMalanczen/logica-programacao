package treinologica.contagem;

public class Anagram {

    public static boolean anagram(String a , String b){
        a = a.toLowerCase();
        b = b.toLowerCase();

        if(a.length() !=  b.length()){
            return false;
        }

        int [] vet = new int[26];

        for(int i = 0; i<a.length(); i++){
            char c = a.charAt(i);
            int position = c - 'a';
            vet[position]++;
        }

        for(int i = 0; i<b.length(); i++){
            char c = b.charAt(i);
            int position = c - 'a';
            vet[position]--;
        }

        for(int i = 0; i<vet.length; i++){
            if (vet[i] != 0){
              return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String a = "Listen";
        String b = "Silent";

        if(anagram(a, b)){
            System.out.println("Anagram");
        }
        else {
            System.out.println("No anagram");
        }

    }
}
