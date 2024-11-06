package Relacion6;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        String frase, letra;
        Scanner scanner= new Scanner(System.in);
        int contador= 1;
        String espacio= " ";

        System.out.println("Introduzca una frase: ");
        frase= scanner.nextLine();

        for (int i=0; i < frase.length(); i++) {
            letra=frase.substring(i, i+1);
            if (letra.equals(espacio)) {
                contador= contador+1;     
            }
        }
        System.out.println("La frase tiene "+ contador +" palabras.");
        scanner.close();
    }
}
