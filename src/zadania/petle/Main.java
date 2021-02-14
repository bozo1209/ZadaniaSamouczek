package zadania.petle;


public class Main {

    public static void main(String[] args) {
        Petle petle = new Petle();
        ArrayFactory arrayFactory = new ArrayFactory(5);
        int[] tablicaInt = new int[]{9,8,7,6,5};

        petle.odZeraDoX(5);
        petle.odZeraDoX2(5);

        petle.wypisujeLiczbeOdOstatniejCyfry(12345678987654321L);

        arrayFactory.showMacierzJednostkowa();

        System.out.println(petle.wyswietlenie(tablicaInt));

    }
}
