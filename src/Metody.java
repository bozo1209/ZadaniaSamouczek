public class Metody {
    public static void main(String[] args) {

        System.out.println(zwracaWiek());
        System.out.println(zwracaImie());
        wypiszSumeRozniceIloczyn(5,5);
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
}
