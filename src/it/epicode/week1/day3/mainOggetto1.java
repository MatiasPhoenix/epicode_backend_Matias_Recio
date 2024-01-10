package it.epicode.week1.day3;

public class mainOggetto1 {

    public static void main(String[] args) {
        //Configurazione rettangolo singolo e calcolo del perimetro
        esercizioOggetto1 rettangoloA = new esercizioOggetto1 (6, 4);
        System.out.println("Il nostro rettangolo ha la base di " + rettangoloA.latoCorto + " e l'altezza di " + rettangoloA.latoLungo);
        System.out.println("Il nostro rettangolo ha un perimetro di " + rettangoloA.perimetroRettangolo(rettangoloA.latoLungo, rettangoloA.latoCorto));
        System.out.println("Il nostro rettangolo ha un area di " + rettangoloA.areaRettangolo(rettangoloA.latoLungo, rettangoloA.latoCorto));

        //Configurazione coppia di rettangoli, calcolo della loro area e del loro perimetro
        esercizioOggetto1 rettangoloX = new esercizioOggetto1 (10, 6);
        esercizioOggetto1 rettangoloY = new esercizioOggetto1 (15, 3);
        System.out.println("Abbiamo due rettangoli, uno di " + rettangoloX.latoCorto + " per " + rettangoloX.latoLungo + ". L'altro di " + rettangoloY.latoCorto + " per " + rettangoloY.latoLungo);
        System.out.println("Il loro perimetro insieme è " + rettangoloX.perimRettangoli(rettangoloX.latoLungo, rettangoloX.latoCorto, rettangoloY.latoCorto, rettangoloY.latoCorto));
        System.out.println("La loro area insieme è di " + rettangoloX.areaRettangoli(rettangoloX.latoLungo, rettangoloX.latoCorto, rettangoloY.latoCorto, rettangoloY.latoCorto));
    }
}
