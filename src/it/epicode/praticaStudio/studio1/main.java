package it.epicode.praticaStudio.studio1;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        System.out.println("\n");
        System.out.println("Ciao utente, tra poco dovrai fornirci i tuoi dati.");

        System.out.println("Come ti chiami?");
        String nome = scanner.nextLine();
        System.out.println("Qual'è il tuo cognome?");
        String cognome = scanner.nextLine();
        System.out.println("Ciao " + nome + " " + cognome);

        System.out.println("Quanti anni hai?");
        int eta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Hai " + eta + " anni, sei del " + (2024-eta) + ", giusto?");


        System.out.println("Ottimo, adesso parlaci di te. Sei fidanzato, scegli si o no?");
        String fidanzato = scanner.nextLine();
        if (fidanzato == "no"){
            fidanzato = " non sei fidanzato";
        }else{
            fidanzato = " sei fidanzato";
        }

        System.out.println("Hai un'hobby? Scrivi il tuo hobby o semplicemente scrivi 'no' se non ne hai uno.");
        String hobby = scanner.nextLine();
        if (hobby == "no"){
            hobby = "Ci dispiace che tu non hai un hobby, dovresti trovarne uno!";
        }else {
            hobby = hobby + " è un hobby bellissimo! Continua a coltivarlo.";
        }
        System.out.println("\n");
        System.out.println("Ti diamo ufficialmente il benvenuto in QUESTO TEST INUTILE!");
        System.out.println("Tuo nome e cognome sono " + nome + " " + cognome);
        System.out.println("Ci hai detto che" + fidanzato);
        System.out.println("Hai " + eta + " anni, e sei del " + (2023-eta));
        System.out.println(hobby);
        */

        Persona persona1 = new Persona("Pippo", "Coso");
        Persona persona2 = new Persona("Ciccio", "Tutu");



        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona1.getNome() + " " + persona1.getCognome());
        System.out.println(persona2.getNome() + " " + persona2.getCognome());

        persona1.copy(persona2);
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona1.getNome() + " " + persona1.getCognome());
        System.out.println(persona2.getNome() + " " + persona2.getCognome());



    }
}
