package treinologica.contagem;

public class NonRepeatCharacter {

    public static void nonRepeatCharacter(String text){
       text = text.toLowerCase().trim();
       int [] vet = new int[26];

       for(int i = 0; i< text.length();i++){
           char c = text.charAt(i);
           int position = c - 'a';
           vet[position]++;
       }

       for(int i = 0; i < vet.length; i++){
           char c = text.charAt(i);
           int position = c - 'a';

          if(vet[position] == 1){
              System.out.println(c);
              return;
          }
       }


    }
    public static void main(String[] args) {
        String text = "programacao";
        nonRepeatCharacter(text);
    }
}
