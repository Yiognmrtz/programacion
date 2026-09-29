import java.util.Scanner;

public class Volumen {
    public static void main (String [] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print ("introduce radio:");
        double radio = teclado.nextDouble();
        
        System.out.print ("intruduce altura:");
        double altura = teclado.nextDouble();
        
        double volumen = (1.0 / 3.0) * 3.14 * radio * radio * altura;

        System.out.println("el volumen es: " + volumen);

        teclado.close();
    }
}