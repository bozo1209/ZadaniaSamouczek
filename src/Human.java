/**
 * 1. Utwórz klasę Human reprezentującą człowieka, musi posiadać atrybuty takie jak wiek, waga, wzrost, imię i płeć. Klasa powinna także zawierać metody getAge, getWeight, getHeight, getName, isMale.
 * 2. Utwórz klasę reprezentującą prostokąt, musi posiadać atrybuty długość i szerokość. Klasa powinna posiadać metody obliczające pole, obwód i długość przekątnej.
 * 3. Utwórz klasę o nazwie MyNumber, której jedyny konstruktor przyjmuje liczbę. Klasa powinna mieć następujące metody
 * 4. MyNumber isOdd() – true jeśli atrybut jest nieparzysty,
 * 5. MyNumber isEven() – true jeśli atrybut jest parzysty,
 * 6. MyNumber sqrt() – pierwiastek z atrybutu,
 * 7. MyNumber pow(MyNumber x) – atrybut podniesiony do potęgi x (przydatnej metody poszukaj w javadoc do klasy Math),
 * 8. MyNumber add(MyNumber x) – zwraca sumę atrybutu i x opakowaną w klasę MyNumber,
 * 9. MyNumber subtract(MyNumber x) – zwraca różnicę atrybutu i x opakowaną w klasę MyNumber.
 */


//zad 1
public class Human {
    private final String imie;
    private final String plec;
    private final int wiek;
    private final double wzrost;
    private final double waga;

    public Human(String imie, String plec, int wiek, double wzrost, double waga) {
        this.imie = imie;
        this.plec = plec;
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.waga = waga;
    }


    public String getImie() {
        return imie;
    }

    public String getPlec() {
        return plec;
    }

    public int getWiek() {
        return wiek;
    }

    public double getWzrost() {
        return wzrost;
    }

    public double getWaga() {
        return waga;
    }
}

//zad 2
class Prostokat{
    private final int dlugosc;
    private final int szerokosc;

    Prostokat(int dlugosc, int szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    public int pole(){
        return dlugosc * szerokosc;
    }

    public int obwod(){
        return 2 * dlugosc + 2 * szerokosc;
    }

    public double przekatna(){
        return Math.sqrt(Math.pow(dlugosc,2) + Math.pow(szerokosc,2));
    }
}