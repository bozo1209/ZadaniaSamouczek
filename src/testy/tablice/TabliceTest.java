package testy.tablice;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import zadania.tablice.Tablice;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TabliceTest {

    Tablice tablice;

    @BeforeAll
    void setUp(){
        tablice = new Tablice();
    }

    @Test
    void tablicaStringTest(){
        String[] strings = {"a","b","c","d","e"};
        assertTrue(Arrays.equals(strings, tablice.tablicaString()));
    }

    @Test
    void odwrocenieKolejnosciTest(){
        int[] ints = {1,2,3};
        int[] ints2 = {3,2,1};
        assertTrue(Arrays.equals(ints2, tablice.odwrocenieKolejnosci(ints)));
    }
}