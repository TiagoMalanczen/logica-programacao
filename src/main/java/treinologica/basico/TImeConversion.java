package treinologica.basico;

public class TImeConversion {
    public static String timeConversion(String s) {
        String time = s.substring(8);

        String hours = s.substring(0,2);
        String minutes = s.substring(3,5);
        String seconds = s.substring(6,8);

        Integer hoursInt = Integer.valueOf(hours);

        if(time.equals("PM") && hoursInt != 12){
            hoursInt += 12;
        } else if (time.equals("AM") && hoursInt == 12) {
            hoursInt = 0;
        }

        String hoursFormat = String.format("%2d", hoursInt);

        return hoursFormat + ":" + minutes + ":" + seconds;
    }

    public static void main(String[] args) {

        String input = "07:05:45PM";
        String result = timeConversion(input);

        System.out.println("Entrada: " + input);
        System.out.println("Saída obtida: " + result);

    }
}
