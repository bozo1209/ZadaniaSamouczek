package testy.petle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import zadania.petle.Petle;

import java.util.Arrays;

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

    @Test
    void przeksztalcanieDoFormyBinarnejTest(){
        long binarna1 = 100L;
        long normalna1 = 4L;
        long binarna2 = 1010001110L;
        long normalna2 = 654L;
        long binarna3 = 10101L;
        long normalna3 = 21;
        assertAll(
                () -> assertEquals(binarna1, petle.przeksztalcanieDoFormyBinarnej(normalna1)),
                () -> assertEquals(binarna2, petle.przeksztalcanieDoFormyBinarnej(normalna2)),
                () -> assertEquals(binarna3, petle.przeksztalcanieDoFormyBinarnej(normalna3))
        );
    }

    @Test
    void czyPalindromTest(){
        String tekst1 = "kajak";
        String tekst2 = "kajak kajak";
        String tekst3 = "kajak ka jak kajak";
        boolean test1 = tekst1.equals(petle.odwoconyString(tekst1));
        boolean test2 = tekst2.equals(petle.odwoconyString(tekst2));
        boolean test3 = tekst3.equals(petle.odwoconyString(tekst3));
        assertAll(
                () -> assertEquals(test1, petle.czyPalindrom(tekst1)),
                () -> assertEquals(test2, petle.czyPalindrom(tekst2)),
                () -> assertEquals(test3, petle.czyPalindrom(tekst3))
        );
    }
}