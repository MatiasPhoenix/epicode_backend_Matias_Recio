package it.epicode.week2.day4;

import ch.qos.logback.core.encoder.JsonEscapeUtil;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ProvaStream {

    public static void main(String[] args) {


        List<String> so = List.of("windows", "ios", "android", "linux", "linux");

        //creiamo una lista a partire da uno stream, filtrando per lunghezza di charaters
        List<String> so2 = so.stream().filter(s -> s.length() > 4).collect(Collectors.toList());

        //creiamo una lista a partire da uno stream, filtrando per lunghezza di charaters ed impossibile da modificare
        List<String> so3 = so.stream().filter(s -> s.length() > 4).collect(Collectors.toUnmodifiableList());

        ////creiamo una lista a partire da uno stream, filtrando per lunghezza di charaters ed inserendola in una collection(del tipo)
        LinkedList<String> so4 = so.stream().filter(s -> s.length() > 4).collect(Collectors.toCollection(LinkedList::new));


        //creiamo un set a partire da uno stream, filtrando per lunghezza di charaters e toglie le stringhe doppioni
        Set<String> soSet = so.stream().filter(s -> s.length() > 4).collect(Collectors.toSet());

    /*creiamo un set a partire da uno stream, filtrando per lunghezza di charaters
     e toglie le stringhe doppioni ed immodificabile */
        Set<String> soSet2 = so.stream().filter(s -> s.length() > 4).collect(Collectors.toUnmodifiableSet());


        //concatenare stringhe grazie a joining
        String parole = so.stream().collect(Collectors.joining(", "));
        System.out.println(parole);
        //concatenare stringhe grazie a joining

        //simil funzione lambda, qui fa una somma dei caratteri (string) con la loro lunghezza (length).
        System.out.println(so.stream().collect(Collectors.summarizingInt(String::length)));

        //calcola la media
        System.out.println(so.stream().collect(Collectors.averagingInt(String::length)));

        //quante parole nelle string, lunghezza media, massima e minima
        System.out.println(so.stream().collect(Collectors.summarizingInt(String::length)));

        //confronta le stringhe prendendo quella più lunga (maxBy)
        System.out.println(so.stream().collect(Collectors.maxBy(String::compareTo)));

        //Limita il numero degli stream
        System.out.println(so.stream().limit(3).collect(Collectors.toList()));



    }
}
