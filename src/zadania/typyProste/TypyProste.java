package zadania.typyProste;

import zadania.petle.Petle;

import java.util.Scanner;

public class TypyProste {

//    zad 2
    public void calkowitaDoBinarnejWyswietlenie(){
//        wyświetla błąd przy wyższych wartościach bo się nie mieści w longu
        Petle petle = new Petle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę całkowitą do zmiany na binarną");
        long x = scanner.nextLong();
        System.out.println("Twoja liczba: " + x + " w postaci binarnej: ");
        System.out.println(petle.przeksztalcanieDoFormyBinarnej(x));
    }
}

