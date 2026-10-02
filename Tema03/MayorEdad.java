import java.util.Scanner;

public class MayorEdad {
    public static void main (String [] args) {
    Scanner teclado = new Scanner (System.in);
    System.out.print ("introduce tu edad:");
    int edad = teclado.nextInt();
    if (edad >=18) {
        System.out.print("es mayor de edad:");
    }
    else {
            System.err.println("es menor de edad");
        }
    } 
}
