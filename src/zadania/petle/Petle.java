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

//    zad 6
    public long przeksztalcanieDoFormyBinarnej(long x){
        long liczba = x;
        StringBuilder stringBuilder = new StringBuilder();
        Petle petle = new Petle();
        while (liczba > 0){
            if (liczba % 2 == 0){
                stringBuilder.append(0);
            }else {
                stringBuilder.append(1);
            }
            liczba = liczba / 2;
        }
        return Long.parseLong(petle.odwoconyString(stringBuilder.toString()));
    }

//    zad 7
    public boolean czyPalindrom(String tekst){
        Petle petle = new Petle();
        return tekst.equals(petle.odwoconyString(tekst));
    }

//    zad 9
    public String wyswietlenie(int[] x){
        return Arrays.toString(x);
    }

//    zad 10
    public int[] sortowanieOdNajmniejszejDoNajwiekszej(int[] x){
        int n = 0;
        int temp;
        while (n < x.length){
            for (int i = 0; i < x.length; i++){
                if (x[i] > x[n]){
                    temp = x[i];
                    x[i] = x[n];
                    x[n] = temp;
                }
            }
            n++;
        }
        return x;
    }
}


