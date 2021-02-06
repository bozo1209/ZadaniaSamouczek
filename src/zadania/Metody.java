package zadania;

/**
 * 1. Napisz metodę, która zwróci Twój aktualny wiek.
 * 2. Napisz metodę, która zwróci Twoje imię,
 * 3. Napisz metodę, która jako argument przyjmuje 2 liczby i wypisuje ich sumę, różnicę i iloczyn,
 * 4. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta,
 * 5. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest podzielna przez 3 i przez 5,
 * 6. Napisz metodę, która jako argument przyjmuje liczbę i zwraca go podniesionego do 3 potęgi,
 * 7. Napisz metodę, która jako argument przyjmuje liczbę i zwraca jej pierwiastek kwadratowy (poczytaj javadoc do klasy Math, znajdziesz tam metodę, która na pewno Ci pomoże),
 * 8. Napisz metodę, która jako argument przyjmie trzy liczby. Metoda powinna zwrócić true jeśli z odcinków o długości przekazanych w argumentach można zbudować trójkąt prostokątny.
 */

public class Metody {
    public static void main(String[] args) {

        System.out.println(zwracaWiek());
        System.out.println(zwracaImie());
        wypiszSumeRozniceIloczyn(5,5);
        System.out.println(czyParzysta(3));
        System.out.println(czyPodzielna(15));
        System.out.println(doTrzeciej(3));
        System.out.println(pierwiastekKwadratowy(4));
        System.out.println(sprCzyTrojkatProstokatny(5,4,3));
    }
//    1
    public static int zwracaWiek(){
        return 30;
    }
//    2
    public static String zwracaImie(){
        return "bozo";
    }
//    3
    public static void wypiszSumeRozniceIloczyn(int a, int b){
        System.out.println("suma " + (a+b));
        System.out.println("roznica " + (a-b));
        System.out.println("iloczyn " + (a*b));
    }
//    4
    public static boolean czyParzysta(int a){
        return a % 2 == 0;
    }
//    5
    public static boolean czyPodzielna(int a){
        return a % 3 == 0 && a % 5 == 0;
    }
//    6
    public static int doTrzeciej(int a){
        return (int) Math.pow(a, 3.0);
    }
//    7
    public static double pierwiastekKwadratowy(int a){
        return Math.sqrt(a);
    }
//    8
    private static boolean sprCzyTrojkatProstokatny(int a, int b, int c){
        if (c > a && c > b){
            return a * a + b * b == c * c;
        }else if (b > c && b > a){
            return a * a + c * c == b * b;
        }else if (a > c && a > b){
            return b * b + c * c == a * a;
        }
        return false;
    }
}
