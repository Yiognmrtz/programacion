
import java.util.Scanner;

public class VolumenCilindro {

    // Funcion que calcula y muestra el volumen del cilindro
    public static void volumen(double radio, double altura) {

        double volumen = Math.PI * radio * radio * altura;

        System.out.println("El volumen del cilindro es: " + volumen);

    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double radio;
        double altura;

        System.out.print("Introduce el radio del cilindro: ");
        radio = teclado.nextDouble();

        System.out.print("Introduce la altura del cilindro: ");
        altura = teclado.nextDouble();

        volumen(radio, altura);

        teclado.close();
    }
}
