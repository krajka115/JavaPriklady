package SamostatnaPraca;

/* Úloha č.1: Príklad na prácu s premennými
Vypíšte do konzoly nasledujúci text:
 Študent Jozef Mrkvička sa narodil 03.04.2000, z maturitnej skúšky má známku 1.5 a od septembra 2022 nastúpi do nového zamestnania ako Java programátor.
V Bratislave dňa 18.06.2022
Poznámka: Dátum narodenia, známku a rok + aktuálny dátum nastavte tak, aby sa dali meniť v zdrojovom kóde (t.j. cez premenné). */



import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.time.format.TextStyle;
import java.util.Date;

public class NacvikPremenneU1 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {

      LocalDate dateOfBirth = LocalDate.of(2000, 4, 3);
        DateTimeFormatter novyFormat1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String datumNarodenia = dateOfBirth.format(novyFormat1);

        Float  znamkaSbodkou = 1.5f;
DecimalFormat znamkaSciarkou = new DecimalFormat("#.#");



      String mesiac = "september";

        int     rok = 2022;

       LocalDate aktualDate = LocalDate.now();
       DateTimeFormatter formatAktDatum = DateTimeFormatter.ofPattern("dd.MM.yyyy");
       String aktualnyDatum = aktualDate.format(formatAktDatum);


        System.out.println(ANSI_RED + " Študent Jozef Mrkvička sa narodil " + datumNarodenia + ANSI_YELLOW + " , z maturitnej skúšky má známku " + ANSI_RED + znamkaSciarkou.format(znamkaSbodkou) + ANSI_GREEN +" a od " + mesiac + " " + rok + ANSI_BLUE + " nastúpi do nového zamestnania ako Java programátor.\n" +
                "V Bratislave dňa " + aktualnyDatum + ANSI_RESET) ;

    }
}
