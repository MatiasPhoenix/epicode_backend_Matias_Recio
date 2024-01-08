package it.epicode.week1.day1;

import java.util.Scanner;

public class PrimaClasse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi un numero!");
        int comandoNumero = scanner.nextInt();
        System.out.println("Hai scritto -->" + comandoNumero);

        scanner.nextLine();
        System.out.println("Scrivi una parola!");
        String parolaFrase = scanner.nextLine();
        System.out.println("Hai scritto -->" + parolaFrase);

        //int tipizzato per numeri interi
        int x = 3;
        int y = 2;
        final int z = 10;

        //float tipizzato numeri non interi
        float num1 = 3.5f; //f alla fine del numero per renderlo float

        double num2 = 3.6;

        //char tipizzato per UN SOLO carattere (con apici singoli)
        char letter = 'h';

        //String per le frasi
        String text1 = "tua madre ";
        String text2 = "è leggenda";

        String allText = text1 + text2;
        int risultato = z + y;

        System.out.println(risultato);
        System.out.println(allText);

        double somma = somma(4,4);
        System.out.println("risultato: " + somma);

    }

    public static double somma (double x, double y){
        double somma = (x + y);
        return somma;
    }
}
