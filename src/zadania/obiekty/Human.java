package zadania.obiekty;




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

//zad 3
class MyNumber{
    public int liczba;

    MyNumber(int liczba){
        this.liczba = liczba;
    }

//    zad 4
    boolean isOdd(){
        return liczba % 2 != 0;
    }

//    zad 5
    boolean isEven(){
        return liczba % 2 == 0;
    }

//    zad 6
    double sqrt(){
        return Math.sqrt(liczba);
    }

//    zad 7
    double pow(MyNumber x){
        return Math.pow(liczba, x.liczba);
    }

//    zad 8
    MyNumber add(MyNumber x){
        return new MyNumber(liczba + x.liczba);
    }

//    zad 9
    MyNumber subtract(MyNumber x){
        return new MyNumber(liczba - x.liczba);
    }

    @Override
    public String toString() {
        return String.valueOf(liczba);
    }

}