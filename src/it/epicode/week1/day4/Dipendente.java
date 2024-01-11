package it.epicode.week1.day4;

public class Dipendente {

    public double stipendioBase = 1000;
    private String matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private String livello[] = {"OPERAIO", "IMPIEGATO", "QUADRO", "DIRIGENTE"};
    private String dipartimento[] = {"PRODUZIONE", "AMMINISTRAZIONE", "VENDITE"};


    //Metodi GET
    public double getStipendio() {
        return stipendio;
    }
    public String getMatricola() {
        return matricola;
    }
    public String[] getLivello() {
        return livello;
    }


    //Metodi SET
    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }
    public void setDipartimento(String[] dipartimento) {
        this.dipartimento = dipartimento;
    }




}
