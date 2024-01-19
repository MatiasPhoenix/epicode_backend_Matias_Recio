package it.epicode.week2.day3.esercizio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) {
        List<Product> prodotti = new ArrayList<>();
        //Stream<Product> prodottiStream = Stream.empty();

        Product prodLibro1 = new Product(1L, "libro1", "libro", 7.0);
        Product prodLibro2 = new Product(2L, "libro2", "libro", 9.0);
        Product prodLibro3 = new Product(3L, "libro3", "libro", 3.0);
        Product prodLibro4 = new Product(3L, "libro3", "libro", 10.0);

        Stream<Product> prodottoLalala = List.of(prodLibro1, prodLibro2, prodLibro3, prodLibro4).stream();


    }
}
