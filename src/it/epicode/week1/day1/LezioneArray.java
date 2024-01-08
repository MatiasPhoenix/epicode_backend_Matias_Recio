package it.epicode.week1.day1;

import java.util.Scanner;

public class LezioneArray {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] numeri = new int[6];


        for (int i = 0; i < numeri.length; i++){
            System.out.println("Scrivi un numero!");
            numeri[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeri.length; i++){
            System.out.println(numeri[i]);
        }

    }
}
