package zadania.typyProste;

import zadania.petle.Petle;

import java.util.Arrays;
import java.util.Scanner;

public class TypyProste {

    private final Petle petle = new Petle();
    private final Scanner scanner = new Scanner(System.in);

//    zad 2
    public void calkowitaDoBinarnejWyswietlenie(){
//        wyświetla błąd przy wyższych wartościach bo się nie mieści w longu
        System.out.println("podaj liczbę całkowitą do zmiany na binarną");
        long x = scanner.nextLong();
        System.out.println("Twoja liczba: " + x + " w postaci binarnej: ");
        System.out.println(petle.przeksztalcanieDoFormyBinarnej(x));
    }

//    zad 3
    private int pobieranieRozmiaruTablicy(){
        System.out.println("podaj rozmiar tablicy: ");
        return scanner.nextInt();
    }

    private int[] pobieranieElementowTablicy(){
        int rozmiarTablicy = pobieranieRozmiaruTablicy();
        int[] tablica = new int[rozmiarTablicy];
        for (int i = 0; i < rozmiarTablicy; i++){
            System.out.println("podaj element " + (i + 1) + " z " + rozmiarTablicy + ": ");
            tablica[i] = scanner.nextInt();
        }
        return tablica;
    }

    public void wyswietlanieTablicyOdNajmniejszejDoNajwiekszej(){
        int[] tablicaDoWyswietlenia = petle.sortowanieOdNajmniejszejDoNajwiekszej(pobieranieElementowTablicy());
        System.out.println(Arrays.toString(tablicaDoWyswietlenia));
    }

//    zad 4
    public void wyswietlaDlugoscCzyPalidromOdwroconaWartosc(){
        System.out.println("podaj tekst: ");
        String tekst = scanner.nextLine();
        System.out.println("długość znaków: " + tekst.length());
        System.out.println("palindron: " + petle.czyPalindrom(tekst));
        System.out.println("odwrócona wartość: " + petle.odwoconyString(tekst));
    }
}

