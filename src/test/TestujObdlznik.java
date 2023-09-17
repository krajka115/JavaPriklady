package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static test.Obdlznik.vypocitajObvod;

public class TestujObdlznik {
    @BeforeEach
    void setUp (){
        System.out.println(" Metóda setUp sa vykoná ako prvá, ešte pred Junit testom ");
    }
    @DisplayName("Testy na vypocet obvodu")
    @Test
    public void testVypocitajObvod() {
        assertEquals(10, vypocitajObvod(2,3), " Test neprešiel! ");// alebo bez importu sem dopísať pred Obdlznik.vypocitajObvod // očakavané číslo, metoda, a text ak test neprešiel
        assertEquals(10, vypocitajObvod(1.5, 3.5));
        assertEquals(2, vypocitajObvod(0.9,0.1));
    }
    @DisplayName("Testy na vypocet obsahu")
    @Test
    public void testVypocitajObsah() {
        assertEquals(20, Obdlznik.vypocitajObsah(5,4));
    }
}
