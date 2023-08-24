package ulohy;

/*Úloha č.2: Priradenie číselného hodnotenia k textovému
        Hint: Porovnanie textov sa cez IF robí ináč ako porovnanie s číslom. Nemôžeme použiť ==, je potrebné použiť .equals
        Hint č. 2: Namiesto IF môžeme použiť SWITCH, CASE.
        Bonusová úloha: Program pôjde do “nekonečna”, kým nezadáme príkaz: koniec
        Bonusová úloha č. 2: Skúsme “ošetriť” používateľský vstup tak, aby reagoval na vstupný text bez ohľadu na diakritiku.
        Popis programu.
        Ako bude program fungovať z pohľadu používateľa: Program ho vyzve otázkou: “Zadaj známku slovne (výborný, chválitebný, dobrý, dostatočný, nedostatočný). Program bude od používateľa čakať textovú odpoveď v “konzole”. Odpoveď bude alikvótna číselná známka, ktorú program vypíše.
        Program bude ďalej pokračovať vypísaním otázky na zadanie slovnej známky, kým používateľ nepreruší program zadaním slova: koniec
        Program po zadaní koniec ukončí svoju činnosť a nevypíše nič.*/

import java.text.Normalizer;
import java.util.Scanner;

public class PriradenieZnamkyTextovemuHodnoteniu {

    public static String removeDiacritics(String text) {
        return Normalizer.normalize(text, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "")
                .replaceAll("[^\\p{ASCII}]", "");
    }


    public static void main(String[] args) {
        while (true) {
            Scanner skener = new Scanner(System.in);
            System.out.println("Zadaj známku slovne:");
            String znamka = skener.nextLine();
            znamka = removeDiacritics(znamka);
            System.out.println("Známka po odstránení diakritiky: " + znamka);
            if (znamka.equals("q") || znamka.equals("Q")) break;
            try {

                if (znamka.equals("vyborny")) System.out.println("Tvoja známka je 1");
                else if (znamka.equals("chvalitebny")) System.out.println("Tvoja známka je 2");
                else if (znamka.equals("dobry")) System.out.println("Tvoja známka je 3");
                else if (znamka.equals("dostatocny")) System.out.println("Tvoja známka je 4");
                else if (znamka.equals("nedostatocny")) System.out.println("Tvoja známka je 5");
                else
                    System.out.println("Chybné zadanie. Skús napísať text znova s použitím interpunkčných znamienok.");
            } catch (Exception e) {
                skener.close();
                System.out.println("Akceptovateľné písmeno, resp. znak je q alebo Q na ukončenie programu.");


            }
        }

    }
}




