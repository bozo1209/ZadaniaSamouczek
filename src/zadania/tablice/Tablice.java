package zadania.tablice;

/**
 * zad 1. Napisz metodę, która zwróci tablicę String[] zawierającą pierwsze 5 liter alfabetu,
 * zad 2. Napisz metodę pobierającą trójelementową tablicę liczb, która zwróci tablicę zawierającą te same elementy w odwróconej kolejności
 */

public class Tablice {

//    zad 1
    public String[] tablicaString(){
        return new String[]{"a", "b", "c", "d", "e"};
    }

//    zad 2
    public int[] odwrocenieKolejnosci(int[] a){
        int[] wynik = new int[a.length];
        for (int i = 0; i < a.length; i++){
            wynik[i] = a[a.length - 1 - i];
        }
        return wynik;
    }
}
