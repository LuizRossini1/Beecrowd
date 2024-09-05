package exercises.beecrowd.exercise1002;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextDouble();
        double n = Math.PI;
        double area = n * (Math.pow(raio, 2));

        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("0.0000", symbols);

        System.out.println("A=" +df.format(area));
    }
}