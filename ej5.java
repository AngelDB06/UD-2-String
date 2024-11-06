package Relacion6;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        String cad, letra, m1;
        Scanner scanner = new Scanner(System.in);
        String espacio=" ";
        

        System.out.println("Introduce tu nombre y apellidos: ");
        cad = scanner.nextLine();

        m1= cad.substring(0, 1).toUpperCase();
        
        StringBuilder lc = new StringBuilder();
        for (int i=0; i<cad.length(); i++) {
            if (cad.substring(i, i+1).equals(espacio)) {
                letra=cad.substring(i+1, i+2).toUpperCase();
                lc.append(letra);
            }
        }
        System.out.println("Las iniciales son "+ m1 + lc);
        scanner.close();
    }    
}
