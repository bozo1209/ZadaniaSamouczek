package testy.petle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import zadania.petle.Petle;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class PetleTest {

    Petle petle;

    @BeforeEach
    void setUp(){
        petle = new Petle();
    }

    @Test
    void odwoconyStringTest() {
        String tekst = "pies";
        String odwroconyTekts = new StringBuilder(tekst).reverse().toString();
        assertTrue(Arrays.equals(odwroconyTekts.toCharArray(), petle.odwoconyString(tekst).toCharArray()));
    }
}