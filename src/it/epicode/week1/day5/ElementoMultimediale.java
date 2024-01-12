package it.epicode.week1.day5;

public class ElementoMultimediale {

    public String name;
    public int durata;
    public String tipoElemento;

    public ElementoMultimediale(String name, int durata, String tipoElemento) {
        this.name = name;
        this.durata = durata;
        this.tipoElemento = tipoElemento;
    }

    public String play(int infoVolume) {
        int infoDurata = this.durata;

        for (int dur = 0; dur < infoVolume; dur++) {
            for (int i = 0; i < infoDurata; i++) {
                System.out.println(this.name + "!");
            }
        }
        return null;
    }




}
