package Relacion6;

import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        String frase, letra, frase2= "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        frase = scanner.nextLine();
        
       
        for (int i=0; i<frase.length(); i++) {
            letra= frase.substring(i, i+1);
            if (letra.equals(letra.toUpperCase())) {
                frase2=frase2+letra.toLowerCase();
            }
            if (letra.equals(letra.toLowerCase())) {
                frase2= frase2+letra.toUpperCase();
            }
            
        }
        System.out.println(frase2);
        scanner.close();
    }
}
