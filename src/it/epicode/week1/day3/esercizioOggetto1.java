package it.epicode.week1.day3;

public class esercizioOggetto1 {
    //Oggetto rettangolo

    public int latoLungo;
    public int latoCorto;


    public esercizioOggetto1(int latoA, int latoB){
        this.latoLungo = latoA;
        this.latoCorto = latoB;
    }

    //Calcolo perimetro un rettangolo

    public static int perimetroRettangolo (int latoA, int latoB){
        int perimetroRettangolo = (latoA + latoB) * 2;
        return perimetroRettangolo;
    }
    public static int areaRettangolo (int latoA, int latoB){
        int areaRettangolo = latoA * latoB;
        return areaRettangolo;
    }

    public static int perimRettangoli (int latoA, int latoB, int latoC, int latoD){
        int perimPrimoRet = (latoA + latoB) * 2;
        int perimSecondoRet = (latoC + latoD) * 2;
        int risultatoFinale = perimSecondoRet + perimSecondoRet;
        return risultatoFinale;
    }

    public static int areaRettangoli (int latoA, int latoB, int latoC, int latoD){
        int arearimoRet = latoA * latoB;
        int areaSecondoRet = latoC * latoD;
        int risultatoFinale = arearimoRet + areaSecondoRet;
        return risultatoFinale;
    }

}
