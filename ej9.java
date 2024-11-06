package Relacion6;

import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        String cad, subcad;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        cad = scanner.nextLine();
        
        System.out.println("Introduce una subcadena: ");
        subcad = scanner.nextLine();

        if (cad.contains(subcad)) {
            System.out.println("La subcadena está en la cadena");
        } else {
            System.out.println("La subcadena NO está en la cadena");
        }
        scanner.close();
    }
}
