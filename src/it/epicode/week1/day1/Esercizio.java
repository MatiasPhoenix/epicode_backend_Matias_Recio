package it.epicode.week1.day1;

import java.util.Scanner;

public class Esercizio {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        /*
        int altezzaRet = 0;
        int lunghezzaRet = 0;
        */


        //Esercizio 1 "Perimetro rettangolo"
        System.out.println("Dobbiamo disegnare un rettangolo, devi fornire due numeri, altezza e lunghezza:");

        int altezzaRet = scanner.nextInt();
        System.out.println("L'altezza è uguale a: " + altezzaRet);

        int lunghezzaRet = scanner.nextInt();
        System.out.println("La lunghezza è uguale a: " + lunghezzaRet);

        int risultatoPerimetro = perimetroRettangolo(altezzaRet, lunghezzaRet);
        System.out.println("La base del nostro rettangolo è " + risultatoPerimetro);

        //Esercizio 2 "Pari o dispari?"
        System.out.println("Scrivi un numero e ti dirò se è Pari o Dispari!");
        int numeroMisterioso = scanner.nextInt();
        System.out.println("Adesso ti forniremo un numero, se è 0, il tuo numero è pari, se invece è 1, il nuo numero è dispari.");
        int rispostaNumber = pariODispari(numeroMisterioso);
        System.out.println("Ecco il risultato: " + rispostaNumber);


        //Esercizio 3 "Perimetro triangolo"
        System.out.println("Adesso costruiamo un triangolo e sveliano il suo perimetro!");
        System.out.println("Devi fornire la lunghezza dei 3 lati.");

        int latoA = scanner.nextInt();
        System.out.println("Il lato A è lungo " + latoA);
        int latoB = scanner.nextInt();
        System.out.println("Il lato B è lungo " + latoB);
        int latoC = scanner.nextInt();
        System.out.println("Il lato C è lungo " + latoC);

        int perimTrig = perimetroTriangolo(latoA, latoB, latoC);
        System.out.println("Il nostro triangolo ha un perimetro di " + perimTrig);
    }

    //Calcolo perimetro rettangolo
    public static int perimetroRettangolo (int base, int altezza){

        int perimetroRettangolo = (base + altezza) * 2;

        return perimetroRettangolo;
    }

    //Pari o dispari?
    public static int pariODispari (int number){
        int pariODispari = number%2;
        return pariODispari;
    }

    //Calcolo perimetro triangolo
    public static int perimetroTriangolo (int a, int b, int c){
        int perTriang = a + b + c;
        return  perTriang;
    }

}
