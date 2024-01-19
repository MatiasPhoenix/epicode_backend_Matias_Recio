package it.epicode.week2.day5;

import java.util.*;
import java.util.stream.Collectors;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CatalogoLibreria nostroCatalogo = new CatalogoLibreria();

        //Creazione libri
        Libro libro1 = new Libro(001L, "Il Libro",                  1900, 325, "Sole Gere",         "Mistero");
        Libro libro2 = new Libro(002L, "Che mi leggo?",             1968, 155, "UnoK Escrive",      "Mistero");
        Libro libro3 = new Libro(003L, "Cucina in bagno",           1800, 325, "Nonsò Dostò",       "Cucina");
        Libro libro4 = new Libro(004L, "Navigare con le mosche",    2011, 325, "Il Pi-Greco-rata",  "Avventura");
        Libro libro5 = new Libro(005L, "Come si fa?",               2020, 99,  "Chene So",          "Educativo");
        Libro libro6 = new Libro(006L, "L'ultimo prima del 2000",   1999, 15,  "Maca Copeloso",       "Cucina");
        Libro libro7 = new Libro(007L, "En che anno siamo?",             1968, 456, "UnoK Escrive",      "Mistero");

        //Creazione riviste
        Catalogo rivista1 = new Catalogo(-001L, "Notizie delle zie",    1911, 21);
            rivista1.setPeriodicRivista(Periodic.SETTIMANALE);
        Catalogo rivista2 = new Catalogo(-002L, "Odissea dell'Orazio",  2001, 30);
            rivista2.setPeriodicRivista(Periodic.SEMESTRALE);
        Catalogo rivista3 = new Catalogo(-003L, "Ruote e cavernicoli",  1234, 12);
            rivista3.setPeriodicRivista(Periodic.MENSILE);
        Catalogo rivista4 = new Catalogo(-004L, "Te leggo le nius",     2005, 45);
            rivista4.setPeriodicRivista(Periodic.SEMESTRALE);
        Catalogo rivista5 = new Catalogo(-005L, "Scienza e Coscienza",  2018, 60);
            rivista5.setPeriodicRivista(Periodic.MENSILE);
        Catalogo rivista6 = new Catalogo(-006L, "PocoScritto",          2021, 3);
            rivista6.setPeriodicRivista(Periodic.SETTIMANALE);

        //Per aggiungege prodotti: aggiungiNostroCatalogo(prodotto)
        //Per mostrare Categoria: getNostroCatalogo()


        nostroCatalogo.aggiungiNostroCatalogo(libro2);
        nostroCatalogo.aggiungiNostroCatalogo(libro4);
        nostroCatalogo.aggiungiNostroCatalogo(libro7);
        //System.out.println(nostroCatalogo.getNostroCatalogo());
        System.out.println(nostroCatalogo.cercaPerAnno(1968));


        nostroCatalogo.aggiungiNostroCatalogo(libro6);
        nostroCatalogo.aggiungiNostroCatalogo(libro3);
        nostroCatalogo.aggiungiNostroCatalogo(rivista6);
        nostroCatalogo.aggiungiNostroCatalogo(rivista4);
        nostroCatalogo.aggiungiNostroCatalogo(rivista1);
        nostroCatalogo.aggiungiNostroCatalogo(rivista3);

        System.out.println(nostroCatalogo.cercaPerISBN(-003L));














    }
}
