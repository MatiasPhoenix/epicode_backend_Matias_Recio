package it.epicode.week1.day2;

import java.util.Objects;
import java.util.Scanner;
public class esercizi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Esercizio 1


        //Esercizio 2 switch
        System.out.println("Seleziona un numero tra 0 e 3");
        int numeroScelto = scanner.nextInt();

        switch (numeroScelto){
            case 0:
                System.out.println("Hai selezionato il numero zero!");
                break;
            case 1:
                System.out.println("Hai selezionato il numero uno!");
                break;
            case 2:
                System.out.println("Hai selezionato il numero due!");
                break;
            case 3:
                System.out.println("Hai selezionato il numero tre!");
                break;
            default:
                System.out.println("Mi dispiace, il numero " + numeroScelto + " non va bene, devi selezionare un numero tra 0 e 3.");
        }

        //Esercizio 3 while
        String parola;
        do{
            System.out.println("Scrivi una parola o 'q' per uscire:");
            parola = scanner.next();
            if (!Objects.equals(parola, "q")) {
                System.out.println("La tua parola è " + parola);
                System.out.println("Ecco lo pelling della tua parola:");

            }
            for (int i = 0; i < parola.length(); i++) {
                System.out.print(parola.charAt(i));

                if (i != parola.length() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("");
        }while(!Objects.equals(parola, "q"));

        System.out.println("Hai scritto q. Programma finalizzato");

        //Esercizio 4 for
    }




}
