package treinologica.basico;

import java.util.List;

public class VeryBigSum {
    public static long veryBigSum(List<Long> arr){
        long sum = 0;
        for(Long num : arr){
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Long> numbers = List.of(1L, 3L, 4L, 3L, 4L);
        System.out.println(veryBigSum(numbers));
    }
}
