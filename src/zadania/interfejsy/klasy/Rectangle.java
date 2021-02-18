package zadania.interfejsy.klasy;

import zadania.interfejsy.interfejs.Figure;

import java.util.Scanner;

public class Rectangle implements Figure {
    @Override
    public double getPerimeter(double bok1Promien, double bok2, double bok3) {
        return 2 * bok1Promien + 2 * bok2;
    }

    @Override
    public double getArea(double wysokoscPromien, double podstawa) {
        return wysokoscPromien * podstawa;
    }

    @Override
    public double[] getDateFromUser() {
        double[] wynik = new double[2];
        String[] parametry = {"bok 1", "bok 2"};
        for (int i = 0; i < parametry.length; i++){
            System.out.println("podaj " + parametry[i] + ": ");
            wynik[i] = new Scanner(System.in).nextDouble();
        }
        return wynik;
    }
}
