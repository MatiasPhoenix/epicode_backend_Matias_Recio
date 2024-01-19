package it.epicode.week2.day5;

public class Libro extends Catalogo{

    public String autore;
    public String genere;

    public Libro(Long ISBN, String titolo, Integer annoUscita, Integer numPagine, String autore, String genere) {
        super(ISBN, titolo, annoUscita, numPagine);
        this.autore = autore;
        this.genere = genere;
    }
}
