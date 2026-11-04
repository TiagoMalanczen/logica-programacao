package treinologica.basico;

public class BirthdayCakeCandles {


    public static int birthdayCakeCandles(int[] candles) {
        int bigger = 0;
        int cont = 1;

        for (int candle : candles){
            if(candle > bigger){
                bigger = candle;
                cont = 1;
            }
            else if (bigger == candle){
                cont++;
            }

        }
        return cont;
    }

    public static void main(String[] args) {
        int [] vet = {3, 2, 1, 3};
        System.out.println(birthdayCakeCandles(vet));;
    }
}
