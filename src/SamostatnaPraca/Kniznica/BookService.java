package SamostatnaPraca.Kniznica;
/*
Vytvorte knižnicu (Kniznica), kde bude môcť používateľ zadať knihy (názov, autor, rok vydania) cez konzolu kým nezadá slovo koniec. Tie na konci vypíšeme. Opakovanie na ArrayList.
        Menu s možnosťami
        Zadaj novú knihu
        Zobraz všetky knihy
        Zobraz konkrétnu knihu (podľa indexu)
        Vymaž konkrétnu knihu (podľa indexu)
        Zobraz počet všetkých kníh
        Vyhľadaj knihu podľa názvu
        Načítaj zoznam kníh zo súboru (zadaj názov súboru)
        Ulož zoznam kníh do súboru (zadaj názov súboru)
        Uprav knihu
        Vymaž všetky knihy
        Export do PDF
        Koniec = koniec aplikácie

        Pomôcky
        Na zistenie počtu záznamov (kníh) použijeme metódu ArrayList.size();
        Na získanie konkrétneho záznamu z ArrayList použijeme metódu ArrayList.get(index);
        Na odstránenie konkrétneho záznamu z ArrayList použijeme metódu ArrayList.remove(index);
        Vyhľadaj knihu podľa názvu knihy, resp. zisti či daná kniha v zozname existuje alebo nie (pozor je to len kontrola jedného údaju!):
public static List<String> findUsingLoop(String search, List<String> list) {
        List<String> matches = new ArrayList<String>();
        for(String str: list) {
        if (str.contains(search)) {
        matches.add(str);
        }
        }
        return matches;
        }
        Zdroj: https://www.baeldung.com/java-search-string-arraylist
        Bonusová úloha: Doplňte fulltextové vyhľadávanie podľa názvu knihy, príp. autora. Jedná sa o metódu contains, viď príklad vyššie, takže riešenie je už uvedené 🙂.
        Bonusová úloha č. 2: Vytvorte možnosť exportu zoznamu kníh do PDF
        Bonusová úloha č. 3: Možnosť uložiť zoznam kníh do súboru a znovu ich načítať. Využite serializáciu a deserializáciu objektov.

*/

import oop.enkapsulacia.Kniha;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class BookService {
    ArrayList <Book> bookList; // vytvorený objekt, prázdny arraylist
    public BookService() {
        bookList = new ArrayList<>(); // vytvorenie prázdneho zoznamu kníh
        bookList = naplnimKniznicuKnihami();
    }

    public void zobrazMenu (){ //teraz môžem vytvoriť čo bude menu ponúkať
        System.out.println("""
                        \n
                        Vyber jednu z možností:
                        -----------------------
                        (1) zadaj novú knihu
                        (2) zobraz všetky knihy
                        (3) zobraz konkrétnu knihu (podľa indexu)
                        (4) vymaž konkrétnu knihu (podľa indexu)
                        (5) zobraz počet všetkých kníh
                        (6) vyhľadaj knihu podľa názvu
                        (7) načítaj zoznam kníh zo súboru (zadaj názov súboru)
                        (8) ulož zoznam kníh do súboru (zadaj názov súboru)
                        (9) uprav knihu
                        (10) vymaž všetky knihy
                        (11) export do PDF
                        (12) ulož zoznam kníh do súboru
                        Koniec = koniec aplikácie
                        """);
    }
    //0
    // Naplním si zoznam knihami, aby som zakaždým nemusela vpisovať všetky údaje
    public ArrayList<Book> naplnimKniznicuKnihami(){
        Book kniha1 = new Book("Já, robot", "Isaac Asimov", 1919);
        Book kniha2 = new Book("1984", "George Orwell", 1915);
        Book kniha3 = new Book("To kill a Mockingbird", "Harper Lee", 1982);
        Book kniha4 = new Book("Malý princ", "Antoine de Saint-Exupéry", 2000);
        Book kniha5 = new Book("Vládca prsteňov", "J.R.R. Tokien", 1925);

        ArrayList <Book> booklist = new ArrayList<>();
        booklist.add(kniha1); // takto pridám knihu ručne zadanú do ArrayListu
        booklist.add(kniha2);
        booklist.add(kniha3);
        booklist.add(kniha4);
        booklist.add(kniha5);

        return booklist;

    }

    // 1
    // Metody tohoto typu se často používají pro provádění určitých akcí nebo operací, ale nemají návratovou hodnotu. Vytvorím kostru pre prvú ponuku zo zoznamu
    public void zadajNovuKnihu () {
        Scanner skener = new Scanner(System.in); // inicializácia skeneru v danej metode 1krát
        System.out.println("Zadaj názov knihy: ");
        String nameOfbook = skener.nextLine(); // použiteľ zadá konkrétne textové pole

        System.out.println("Zadaj autora knihy: ");
        String authorOfbook = skener.nextLine();

        System.out.println("Zadaj rok vydania knihy: ");
        int yearOfPublication = skener.nextInt(); // používateľ zadá kontrétne číselné pole

        Book vpisanaKniha = new Book(nameOfbook, authorOfbook, yearOfPublication); // vytvorená kniha za náklade dát a tú nižšie pridám do ArrayListu

        bookList.add(vpisanaKniha);
    }
    //2
    public void zobrazVsetkyKnihy(){
        if (!bookList.isEmpty()){
            for (int i = 0; i < bookList.size(); i++) {
                System.out.println("Index knihy: " + i); //poradie knihy, môžem nemusím riešiť //TODO nepíse index na poslednej knihe < ak dam <= tak napíše aj na poslednej knihe ale vyhodí chybu
                System.out.println("\t");
                System.out.println(bookList.get(i)); // detail knihy, ktory riesi metoda toString v Book

            }
        } else {
            System.out.println("Zoznam kníh je prázdny!");
        }
    }
    //3
    public void zobrazKnihuPodlaIndexu () { //  zaistiť aby keď zadavateľ vpíše číslo a nie písmeno aby ho vrátilo späť do ponuky menu a už neopakovalo zobrazovanie knihy podla indexu HOTOVO!!!

        boolean chybaVstupu = true;

        do {
            Scanner skener = new Scanner(System.in);
            System.out.println("Vpíš index knihy, ktorú chceš zobraziť: ");
            try {
                int indexBook = skener.nextInt();
                if (indexBook >= 0 && indexBook < bookList.size()) {
                    System.out.println(bookList.get(indexBook));
                    chybaVstupu = false;
                } else {
                    System.out.println("Neplatný index knihy!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Neplatný vstup! Zadaj číslo: ");

            }
        } while (chybaVstupu);
        startMenuBook();
    }


        //4
        public void deleteBook () {
            Scanner skener = new Scanner(System.in);
            System.out.println("Zadaj index knihy, ktorú chceš odstrániť: ");

            try {
                int indexBook = skener.nextInt();
                String knihaPodlaIndexu = String.valueOf(bookList.remove(indexBook));
                System.out.println("Vybral si si knihu číslo: " + indexBook +".");
                System.out.println("KNIHA:\n" + knihaPodlaIndexu + "\nJE ODSTRÁNENÁ!");// aby miesto čísla vypísalo aj názov, autora a rok HOTOVO
            } catch (InputMismatchException e) { // prejde na menu odznova ak vpíše vyššie číslo ako je dlžka zoznamu. // podobné ako pri 3 riesenie len neviem ako ukončiť cyklus po správnom zadaní!!!!
                System.out.println("Neplatný vstup! Zadaj číslo: ");
                deleteBook();
            }catch (IndexOutOfBoundsException e) {
                System.out.println("Zadal si neexistujúci index knihy!\n");
                deleteBook();
            }
        }
        //5
        public int zobrazPocetVsetkychKnih () {
            return bookList.size(); //vráti pocet všetkých kník z ArrayListu
        }

       //koniec
        public void koniec () {
            System.out.println("Naozaj si praješ program ukončiť? Zvoľ (y) yes/yes alebo (n) no/nie.");
            Scanner skener = new Scanner(System.in);
            String vstup = skener.nextLine();

                if (vstup.equals("y") || vstup.equals("Y")) {
                    System.out.println("Zvolil si \"y/Y\". Program bol ukončený!");
                } else if (vstup.equals("n") || vstup.equals("N")) {
                    System.out.println("Zvolil si \"n/N\". Pokračuj vo výbere z menu.");
                    startMenuBook();
                } else {
                    System.out.println("Zadal si nesprávne písmeno! Opakuj voľbu prosím: \n");
                    koniec();
                }

        }

        public void startMenuBook () {
            String zadanaVolbaPouzivatela = " ";
            while (!zadanaVolbaPouzivatela.equals("koniec")) {
                zobrazMenu(); // zobrazí menu a čaká na vstup užívatela
                Scanner skener = new Scanner(System.in);
                zadanaVolbaPouzivatela = skener.nextLine().toLowerCase(); // zoberie text aj číslo ako text a zároveň prekonvertuje na malé písmená ak by užívatel zadal velké napríklad pri písaní slova koniec
                //logický blok - chceme vpisovať čo vybral. funkcia switch/case/default a lambda výrazy (môžem použiť aj if)
                switch (zadanaVolbaPouzivatela) {
                    case "1" -> {
                        System.out.println("Vybral si si číslo 1.");
                        zadajNovuKnihu();
                    }
                    case "2" -> {
                        System.out.println("Vybral si si číslo 2.");
                        zobrazVsetkyKnihy();
                    }
                    case "3" -> {
                        System.out.println("Vybral si si číslo 3.");
                        zobrazKnihuPodlaIndexu();
                    }
                    case "4" -> {
                        System.out.println("Vybral si si číslo 4 pre zmazanie knihy.");
                        deleteBook();
                    }
                    case "5" -> {
                        System.out.println("Vybral si si číslo 5.");
                        System.out.println("Počet všetkých kníh v zozname je: " + zobrazPocetVsetkychKnih());
                    }
                    case  "koniec" -> {
                        koniec();
                    }
                   /* case "koniec" -> {
                       System.out.println("Vybral si si koniec."); // skúsiť urobiť koniec ako menu ,kde: Potvrď voľbu: (y) ukončiť (n) vráti späť do menu; HOTOVO

                        //if (zadanaVolbaPouzivatela.equals("")) System.exit(1); // ked zadam aj if, tak tento kod program ukonci a znova vypíše menu a pokračuje dalej
                        //else zadanaVolbaPouzivatela = " ";
                    }*/
                    default -> {
                        System.out.println("Nevybral si si nič z menu!");
                        System.out.println("Vpísal si: " + zadanaVolbaPouzivatela);
                    }
                }

            }
        }


    }
