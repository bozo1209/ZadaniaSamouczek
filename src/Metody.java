public class Metody {
    public static void main(String[] args) {

        System.out.println(zwracaWiek());
        System.out.println(zwracaImie());
        wypiszSumeRozniceIloczyn(5,5);
        System.out.println(czyParzysta(3));
        System.out.println(czyPodzielna(15));
        System.out.println(doTrzeciej(3));
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
        double b = a;
        return (int) Math.pow(b, 3.0);
    }
}
