package ulohy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*Úloha č.1: Príklad na prácu s premennými
Vypíšte do konzoly nasledujúci text:
 Študent Jozef Mrkvička sa narodil 03.04.2000, z maturitnej skúšky má známku 1.5 a od septembra 2022 nastúpi do nového zamestnania ako Java programátor.
V Bratislave dňa 18.06.2022
Poznámka: Dátum narodenia, známku a rok + aktuálny dátum nastavte tak, aby sa dali meniť v zdrojovom kóde (t.j. cez premenné).
*/
public class PremenneUloha {
    public static void main(String[] args) {

        LocalDate datumNar1 = LocalDate.of(2000, 04, 03);
        DateTimeFormatter datumFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String sformatovanyDatum = datumNar1.format(datumFormat);

float znamka = 1.5f;
int rokNastupuDoPrace = 2022;

LocalDate datumNenaformatovany = LocalDate.now();
DateTimeFormatter formatujemDatum = DateTimeFormatter.ofPattern("dd.MM.yyyy");
String datumAktualny = datumNenaformatovany.format(formatujemDatum);


char vlnka = 126;


        System.out.println("Študent Jozef Mrkvička sa narodil " +sformatovanyDatum+ ", z maturitnej skúšky má známku " + znamka + " a od septembra " + rokNastupuDoPrace + " nastúpi do nového zamestnania ako Java programátor.\n" +
                "V Bratislave dňa " + datumAktualny + vlnka );




    }
}
