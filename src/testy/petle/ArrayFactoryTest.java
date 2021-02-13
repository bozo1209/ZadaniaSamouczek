package testy.petle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import zadania.petle.ArrayFactory;

import static org.junit.jupiter.api.Assertions.*;

class ArrayFactoryTest {

    ArrayFactory arrayFactory;

    @BeforeEach
    void setUp(){
        arrayFactory = new ArrayFactory(5);
    }

    @Test
    void oneDimensionTest(){
        assertEquals(arrayFactory.x, arrayFactory.oneDimension().length);
    }

    @Test
    void twoDimensionTest(){
        assertEquals(arrayFactory.x, arrayFactory.twoDimension().length);
    }
}