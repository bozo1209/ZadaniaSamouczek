package zadania.petle;

import java.util.Arrays;

public class Petle {

//    zad 1
    protected void odZeraDoX(int x){
        for(int i = 0; i <= x; i++){
            System.out.println(i);
        }
    }

//    zad 2
    protected void odZeraDoX2(int x){
        int i = 0;
        while (i <= x){
            System.out.println(i);
            i++;
        }
    }

//    zad 4
    protected void wypisujeLiczbeOdOstatniejCyfry(long x){
        char[] wynik = String.valueOf(x).toCharArray();
        for (int i = wynik.length - 1; i >= 0 ; i--){
            System.out.println(wynik[i]);
        }
    }

//    zad 5
    public String odwoconyString(String tekst){
        int liczbaZnakow = tekst.length();
        char[] wynik = new char[liczbaZnakow];
        char[] tekstDoOdwrocenia = tekst.toCharArray();
        for (int i = 0; i < liczbaZnakow; i++){
            wynik[i] = tekstDoOdwrocenia[liczbaZnakow - 1 - i];
        }
        return new String(wynik);
    }
}
