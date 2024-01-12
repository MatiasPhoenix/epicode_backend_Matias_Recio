package it.epicode.week1.day5;
import java.util.Scanner;

import static it.epicode.week1.day5.ElementoAudio.volume;

public class RiproduzioneElementi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ElementoMultimediale film = new ElementoMultimediale("film1", 3, "video"){

        };

        film.play(volume);





    }


}
