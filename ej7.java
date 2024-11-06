package Relacion6;

import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        String frase, c1, c2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca una frase: ");
        frase = scanner.nextLine();

        System.out.println("Introduzca un caracter de la frase que quiera sustituir: ");
        c1 = scanner.nextLine();
        
        System.out.println("Introduce el caracter por el que quiere sustituir el primer caracter: ");
        c2 = scanner.nextLine();

        frase=frase.replace(c1, c2);
        System.out.println(frase);
        scanner.close();
    }
}
