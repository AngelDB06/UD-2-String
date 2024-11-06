package Relacion6;

import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        String frase, cinvertida= "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca una frase: ");
        frase = scanner.nextLine();

        for (int i=frase.length()-1; i>=0; i--) {
            
            cinvertida += frase.charAt(i);
        }
        if (cinvertida.equals(frase)) {
            System.out.println("Es una palabra palíndroma");
        } else {
            System.out.println("No es una palabra palíndroma");
        }
        scanner.close();
    }
}
