package zadania.tablice;

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
