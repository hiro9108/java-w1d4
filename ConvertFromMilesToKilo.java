
public class ConvertFromMilesToKilo {
    public static void main(String[] args) {

        // table columns
        System.out.println("Miles   kilometers");

        for (int i = 1; i <= 10; i++) {
            double kilo = i * 1.609;
            if (i == 10) {
                System.out.println(i + "      " + kilo);
            } else {
                System.out.println(i + "       " + kilo);
            }
        }
    }
}