package zadania.interfejsy.klasy;

import zadania.interfejsy.interfejs.Figure;

import java.util.Scanner;

public class Triangle implements Figure {
    @Override
    public double getPerimeter(double bok1Promien, double bok2, double bok3) {
        return bok1Promien + bok2 + bok3;
    }

    @Override
    public double getArea(double wysokoscPromien, double podstawa) {
        return wysokoscPromien * podstawa / 2;
    }

    @Override
    public double[] getDateFromUser() {
        double[] wynik = new double[4];
        String[] parametry = {"bok 1", "bok 2", "bok 3", "wysokość"};
        for (int i = 0; i < parametry.length; i++){
            System.out.println("podaj " + parametry[i] + ": ");
            wynik[i] = new Scanner(System.in).nextDouble();
        }
        return wynik;
    }
}
