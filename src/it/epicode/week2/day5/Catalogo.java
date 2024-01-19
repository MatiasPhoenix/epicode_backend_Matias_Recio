package it.epicode.week2.day5;

public class Catalogo {

    public Long ISBN;
    public String titolo;
    public Integer annoUscita;
    public Integer numPagine;


    public Periodic periodicRivista;


    public Long getISBN() {
        return ISBN;
    }

    public void setISBN(Long ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoUscita() {
        return annoUscita;
    }

    public void setAnnoUscita(Integer annoUscita) {
        this.annoUscita = annoUscita;
    }

    public int getNumPagine() {
        return numPagine;
    }

    public void setNumPagine(Integer numPagine) {
        this.numPagine = numPagine;
    }

    public Periodic getPeriodicRivista() {
        return periodicRivista;
    }

    public void setPeriodicRivista(Periodic periodicRivista) {
        this.periodicRivista = periodicRivista;
    }

    public Catalogo(Long ISBN, String titolo, Integer annoUscita, Integer numPagine) {
        this.ISBN = ISBN;
        this.titolo = titolo;
        this.annoUscita = annoUscita;
        this.numPagine = numPagine;
    }


}
