import java.util.Scanner;

public class SumaNumero {

    public static void main (String []args){
        Scanner teclado = new Scanner(System.in);
        int numAleatorio = (int) (Math.random()*10);
        int numAleatorio1 = (int) (Math.random()*10);
        System.out.println("Suma:" + numAleatorio + "+"  + numAleatorio1);
        System.out.println("escribe el resultado:");
        int resultado = teclado.nextInt();
                if (resultado == numAleatorio + numAleatorio1) {
            System.out.println("¡Correcto!");
        } else {
            System.out.println("Incorrecto.");
        }

        teclado.close();

    }
}
