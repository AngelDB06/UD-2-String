package Relacion6;

import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        String frase, cinvertida= " ";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca una frase: ");
        frase = scanner.nextLine();

        for (int i=frase.length()-1; i>=0; i--) {
            
            cinvertida += frase.charAt(i);
        }
        
        System.out.println("La frase invertida es"+ cinvertida);
        scanner.close();
    }
}
