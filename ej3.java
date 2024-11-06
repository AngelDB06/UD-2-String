package Relacion6;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Introduzca una frase");
        String frase= scanner.nextLine();

        String letra;
        int contador = 0;
        System.out.println("Introduzca un carácter");
         String caracter= scanner.nextLine();
         if (caracter.length() == 1) {
            for (int i = 0; i < frase.length(); i++) {
                 letra=frase.substring(i, i+1);
                 if (letra.equals(caracter)) {
                    contador++;
                }
             }
          } else {
            System.out.print("Solo se puede introducir un carácter");
          }
        System.out.print("El caracter aparece un total de "+ contador +" veces.");
        scanner.close();
    }
}
