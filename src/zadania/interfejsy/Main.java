package zadania.interfejsy;

import zadania.interfejsy.klasy.Circle;
import zadania.interfejsy.klasy.Rectangle;
import zadania.interfejsy.klasy.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        double[] dane;

        String coDalej;

        loop: while (true){
            System.out.println("jeśli jesteś zainteresowany kołem naciśnij " +
                    "[K], jeśli trójkątem [T], a jeśli prostokątem naciśnij [P]" +
                    "\nJeśli chcesz wyjść naciśnij [Q]");
            coDalej = scanner.nextLine();
            switch (coDalej.toUpperCase()){
                case "K":
                    dane = circle.getDateFromUser();
                    System.out.println("obwód koła: " + circle.getPerimeter(dane[0],0,0));
                    System.out.println("pole koła: " + circle.getArea(dane[0], 0));
                    break;
                case "T":
                    dane = triangle.getDateFromUser();
                    System.out.println("obwód trójkąta: " + triangle.getPerimeter(dane[0],dane[1],dane[2]));
                    System.out.println("pole trójkąta: " + triangle.getArea(dane[3], dane[0]));
                    break;
                case "P":
                    dane = rectangle.getDateFromUser();
                    System.out.println("obwód prostakąta: " + rectangle.getPerimeter(dane[0], dane[1],0));
                    System.out.println("pole prostakąta: " + rectangle.getArea(dane[0], dane[1]));
                    break;
                case "Q":
                    break loop;
                default:
                    System.out.println("podałeś nieprawidłową wartość");
                    break;
            }
        }
    }
}
