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

    public static int zwracaWiek(){
        return 30;
    }

    public static String zwracaImie(){
        return "bozo";
    }

    public static void wypiszSumeRozniceIloczyn(int a, int b){
        System.out.println("suma " + (a+b));
        System.out.println("roznica " + (a-b));
        System.out.println("iloczyn " + (a*b));
    }

    public static boolean czyParzysta(int a){
        return a % 2 == 0;
    }

    public static boolean czyPodzielna(int a){
        return a % 3 == 0 && a % 5 == 0;
    }

    public static int doTrzeciej(int a){
        return (int) Math.pow(a, 3.0);
    }

    public static double pierwiastekKwadratowy(int a){
        return Math.sqrt(a);
    }

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
