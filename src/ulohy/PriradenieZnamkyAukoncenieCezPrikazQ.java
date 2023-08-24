package ulohy;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Character.isLetter;

public class PriradenieZnamkyAukoncenieCezPrikazQ {
    public static void main(String[] args) {
        while (true) { // nekonečný cyklus
            Scanner skener = new Scanner(System.in);
            System.out.println("Zadaj počet bodov:");
            String pocetBodov = skener.nextLine(); // nextLine je pre akýkolvek String, cize text, ale aj cislo sa v tomto pripade berie ako text

            // akym sposobom ukoncit while. Hint: vpisanym pismenom q
            if (pocetBodov.equals("q") || pocetBodov.equals("Q") ) break;


            // konverzia string na int takto vid nižšie
            try {

            int pocetBodovAkoInt = Integer.parseInt(pocetBodov);
            if (pocetBodovAkoInt > 90) System.out.println("Tvoja známka je A"); // do prvej podmienky nedávať else iba if
            else if (pocetBodovAkoInt > 75) System.out.println("Tvoja známka je B");
            else if (pocetBodovAkoInt > 65) System.out.println("Tvoja známka je C");
            else System.out.println("Neviem priradiť známku k danému počtu bodov");
        } catch (NumberFormatException e) { // môžeme písať akekoľvek písmená , program ide dalej okrem q
                System.out.println("Akceptovateľné písmeno, resp. znak je q alebo Q na ukončenie programu.");
            }
            }

    }
}
