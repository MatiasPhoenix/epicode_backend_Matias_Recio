package it.epicode.week2.day2.esercizio;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContaParole {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanto vuoi che sia lunga la tua lista, scrivi un numero: ");
        int n = scanner.nextInt();

        Set<String> parole = new HashSet<>();

        System.out.println("Inserisci le parole:");

        for (int i = 0; i < n; i++) {
            String parola = scanner.next();
            parole.add(parola);
        }

        System.out.println("Numero di parole scelte: " + parole.size());

        System.out.println("Elenco delle parole: " + parole);
    }

}
