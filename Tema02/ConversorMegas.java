import java.util.Scanner;

public class ConversorMegas {
    public static void main (String [] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print ("introduce los Kb: ");
        double kilobytes = teclado.nextDouble();
        
        double megabytes = kilobytes / 1024;

        
        System.out.println("el megabytes es: " + megabytes);

        teclado.close();
    }
}