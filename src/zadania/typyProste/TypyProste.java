package zadania.typyProste;

import zadania.petle.Petle;

import java.util.Arrays;
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

//    zad 3
    private int pobieranieRozmiaruTablicy(){
        System.out.println("podaj rozmiar tablicy: ");
        return new Scanner(System.in).nextInt();
    }

    private int[] pobieranieElementowTablicy(){
        int rozmiarTablicy = pobieranieRozmiaruTablicy();
        int[] tablica = new int[rozmiarTablicy];
        for (int i = 0; i < rozmiarTablicy; i++){
            System.out.println("podaj element " + (i + 1) + " z " + rozmiarTablicy + ": ");
            tablica[i] = new Scanner(System.in).nextInt();
        }
        return tablica;
    }

    public void wyswietlanieTablicyOdNajmniejszejDoNajwiekszej(){
        Petle petle = new Petle();
        int[] tablicaDoWyswietlenia = petle.sortowanieOdNajmniejszejDoNajwiekszej(pobieranieElementowTablicy());
        System.out.println(Arrays.toString(tablicaDoWyswietlenia));
    }
}

