package it.epicode.week2.day5;



import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class CatalogoLibreria {

    public List<Catalogo> nostroCatalogo;

    //Costruttore
    public CatalogoLibreria() {
        this.nostroCatalogo = new ArrayList<>();
    }


    public List<Catalogo> getNostroCatalogo() {
        return nostroCatalogo;
    }

    public void aggiungiNostroCatalogo(Catalogo prodotto) {
        this.nostroCatalogo.add(prodotto);
    }

    @Override
    public String toString() {
        return "CatalogoLibreria{" +
                "nostroCatalogo=" + nostroCatalogo +
                '}';
    }


    //metodi
    public void rimuoviPerISBN(Long ISBN) {
        Iterator<Catalogo> iterator = nostroCatalogo.iterator();
        while (iterator.hasNext()) {
            Catalogo prodotto = iterator.next();
            if (prodotto.getISBN().equals(ISBN)) {
                iterator.remove();
            }
        }
    }

    public Catalogo cercaPerISBN(Long ISBN) {
        for (Catalogo prodotto : nostroCatalogo) {
            if (prodotto.getISBN().equals(ISBN)) {
                return prodotto;
            }
        }
        return null;
    }

    public List<Catalogo> cercaPerAnno(int anno) {
        return nostroCatalogo.stream()
                .filter(prodotto -> prodotto.getAnnoUscita() == anno)
                .toList();
    }

    public List<Catalogo> cercaPerAutore(String autore) {
        return nostroCatalogo.stream()
                .filter(prodotto -> prodotto instanceof Libro && ((Libro) prodotto).getAutore().equals(autore))
                .toList();
    }
}
