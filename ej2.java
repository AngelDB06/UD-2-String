package Relacion6;

import java.util.Scanner;



public class ej2 {
    public static void main(String args[]) {

        Scanner scanner= new Scanner(System.in);
        
        System.out.print("Introduzca una frase: ");
        String cadena = scanner.nextLine();

        System.out.print("Introduce un carácter: ");
        String caracter = scanner.nextLine();

        
        if (cadena.startsWith(caracter)) {
                System.out.println("La cadena comienza por la subcadena");
        } else {
                System.out.print("La cadena NO comienza por la subcadena");
        }

        scanner.close();

    }
}
