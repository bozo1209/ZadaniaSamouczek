package zadania.interfejsy.klasy;

import zadania.interfejsy.interfejs.Figure;

import java.util.Scanner;

public class Circle implements Figure {

    @Override
    public double getPerimeter(double bok1Promien, double bok2, double bok3) {
        return 2 * bok1Promien * Figure.PI;
    }

    @Override
    public double getArea(double wysokoscPromien, double podstawa) {
        return wysokoscPromien * wysokoscPromien * Figure.PI;
    }

    @Override
    public double[] getDateFromUser() {
        double[] wynik = new double[1];
        System.out.println("podaj promień ");
        wynik[0] = new Scanner(System.in).nextDouble();
        return wynik;
    }
}
