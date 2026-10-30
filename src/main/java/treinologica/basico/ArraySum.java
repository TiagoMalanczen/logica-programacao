package treinologica.basico;

public class ArraySum {
    public static int arraySum(int[] numbers){
        int sum = 0;
        for(int i = 0; i<numbers.length; i++){
            sum += numbers[i];
        }
        return sum;

    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 4, 5, 234,3,23 ,3};
        System.out.println(arraySum(numbers));;
    }
}
