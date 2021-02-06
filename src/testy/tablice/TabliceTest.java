package testy.tablice;

import org.junit.jupiter.api.Test;
import zadania.tablice.Tablice;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class TabliceTest {

    @Test
    void czyTablicaString(){
        String[] strings = {"a","b","c","d","e"};
        Tablice tablice = new Tablice();
        assertTrue(Arrays.equals(strings,tablice.tablicaString()));
    }
}