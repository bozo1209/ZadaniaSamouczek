package testy.interfejsy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import zadania.interfejsy.interfejs.Figure;
import zadania.interfejsy.klasy.Circle;
import zadania.interfejsy.klasy.Rectangle;
import zadania.interfejsy.klasy.Triangle;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InterfejsyTesty {

    Circle circle;
    Triangle triangle;
    Rectangle rectangle;

    @BeforeEach
    void setUp(){
        circle = new Circle();
        triangle = new Triangle();
        rectangle = new Rectangle();
    }

    @Test
    void getPerimeterTests(){
        double promien = 5.0;
        double bok1 = 5.0;
        double bok2 = 3.0;
        double bok3 = 4.0;
        double wysokosc = 6.0;

        assertAll(
                () -> assertEquals((2 * promien * Figure.PI),circle.getPerimeter(promien,0,0)),
                () -> assertEquals((bok1 + bok2 + bok3),triangle.getPerimeter(bok1,bok2,bok3)),
                () -> assertEquals((2 * bok1 + 2 * bok2),rectangle.getPerimeter(bok1,bok2,0))
        );
    }

    @Test
    void getAreaTests(){
        double promien = 5.0;
        double bok1 = 5.0;
        double bok2 = 3.0;
        double bok3 = 4.0;
        double wysokosc = 6.0;

        assertAll(
                () -> assertEquals((promien * promien * Figure.PI),circle.getArea(promien,0)),
                () -> assertEquals((wysokosc * bok1 / 2),triangle.getArea(wysokosc, bok1)),
                () -> assertEquals((bok1 * bok2),rectangle.getArea(bok1, bok2))
        );
    }
}
