package www.rodrigoledesmagarcia.com.mx;

import java.util.Scanner;

public class NumerosEntre0y99999 {
    public static void main(String[] args) {

        int numero;

        Scanner input = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Ingrese en un número entre el 0 y el 99999 para saber su número de cifras: ");
        numero = input.nextInt();
        if ( numero < 0 || numero > 99999){
            System.out.println("El número "+numero+ " esta fuera de rango");
        } else if (numero < 10) {
            System.out.println("El número "+numero+" tiene 1 cifra");
        } else if (numero < 100) {
            System.out.println("El número "+numero+" tiene 2 cifras");
        }  else if (numero < 1000) {
        System.out.println("El número "+numero+" tiene 3 cifras");
        } else if (numero < 10000) {
        System.out.println("El número "+numero+"  tiene 4 cifras");
        } else if (numero < 100000) {
            System.out.println("El número "+numero+" tiene 5 cifras");
        } else {
            System.out.println("Ese número "+numero+"  esta fuera de rango");
        }

    }
}
