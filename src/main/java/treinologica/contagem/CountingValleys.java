package treinologica.contagem;

public class CountingValleys {

    public static int countingValleys(int steps, String path) {
        int height = 0;
        int valleys = 0;
        for(int i = 0; i<path.length();i++){
            if (path.charAt(i) == 'U' ){
                height ++;
                if (height == 0){
                    valleys++;
                }
            }
            else {
                height--;
            }
        }
        return valleys;
    }

    public static void main(String[] args) {
        int steps = 8;
        String path = "UDDDUDUU";

        int result = countingValleys(steps, path);

        System.out.println("Passos: " + steps);
        System.out.println("Caminho: " + path);
        System.out.println("Vales encontrados: " + result);
        // Saída esperada: 1
    }
}
