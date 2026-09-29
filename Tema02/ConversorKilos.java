import java.util.Scanner;

public class ConversorKilos {
    public static void main (String [] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print ("introduce los Mb: ");
        double megabytes = teclado.nextDouble();
        
        double kilobytes = megabytes * 1024;

        
        System.out.println("el kilobyte es: " + kilobytes);

        teclado.close();
    }
}