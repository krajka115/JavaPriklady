package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ulohy.ZakladneMatOperacieCezMetody;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestujZakladneMatOperacieCezMetody {
@DisplayName("Testovanie sčítania triedy ZakladneMatOperacieCezMetody")
@Test
    public void testScitanie (){
        assertEquals (15, ZakladneMatOperacieCezMetody.scitanie(10, 5));
    }
  @DisplayName("Testovanie odčítania triedy ZakladneMatOperacieCezMetody")
  @Test
    public void testOdcitanie (){
        assertEquals(15, ZakladneMatOperacieCezMetody.odcitanie(20,5));
    }

    @DisplayName("Testovanie násobenia triedy ZakladneMatOperacieCezMetody")
    @Test
    public void testNasobenie (){
        assertEquals (50, ZakladneMatOperacieCezMetody.nasobenie(10, 5));
    }


    @DisplayName("Testovanie delenia triedy ZakladneMatOperacieCezMetody")
    @Test
    public void testDelenie (){
        assertEquals (2, ZakladneMatOperacieCezMetody.delenie(10, 5));
        assertEquals(Double.isInfinite(3/0.0), Double.isInfinite(ZakladneMatOperacieCezMetody.delenie(3,0))); // ked je nekonečno pri delení
        assertTrue (Double.isInfinite(ZakladneMatOperacieCezMetody.delenie(3.0,0)));
    }

    @DisplayName("Testovanie modulo(zvyšku po delení) triedy ZakladneMatOperacieCezMetody")
    @Test
    public void testModulo (){
        assertEquals (0, ZakladneMatOperacieCezMetody.modulo(10, 5));
    }
}
