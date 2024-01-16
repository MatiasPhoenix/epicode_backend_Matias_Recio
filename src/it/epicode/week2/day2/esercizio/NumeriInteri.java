package it.epicode.week2.day2.esercizio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class NumeriInteri {
    public static List<Integer> generaListaCasuale(int N) {
        List<Integer> listaCasuale = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < N; i++) {
            listaCasuale.add(rand.nextInt(101));
        }

        Collections.sort(listaCasuale);
        return listaCasuale;
    }

    public static List<Integer> creaListaInversa(List<Integer> lista) {
        List<Integer> listaInversa = new ArrayList<>(lista);
        Collections.reverse(listaInversa); // Inverte la lista
        return listaInversa;
    }

    public static void stampaElementi(List<Integer> lista, boolean pari) {
        for (int i = pari ? 0 : 1; i < lista.size(); i += 2) {
            System.out.print(lista.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int N = 5; // Modifica questo valore a tuo piacimento
        List<Integer> listaCasuale = generaListaCasuale(N);

        System.out.println("Lista Casuale: " + listaCasuale);

        List<Integer> listaInversa = creaListaInversa(listaCasuale);
        System.out.println("Lista Inversa: " + listaInversa);

        System.out.print("Stampa valori in posizioni pari: ");
        stampaElementi(listaCasuale, true);

        System.out.print("Stampa valori in posizioni dispari: ");
        stampaElementi(listaCasuale, false);
    }
}
