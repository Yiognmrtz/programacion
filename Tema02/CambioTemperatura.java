import java.util.Scanner;

public class CambioTemperatura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce los grados Fahrenheit: ");
        double fahrenheit = teclado.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("Temperatura en Celsius: " + celsius);

        teclado.close();
    }
}
