package sk.tmconsulting.pozdravy;

import java.util.Scanner;
import sk.tmconsulting.pozdravy.slovensky.Ahoj;
import sk.tmconsulting.pozdravy.nemecky.Hallo;
import sk.tmconsulting.pozdravy.madarsky.Szia;
import sk.tmconsulting.pozdravy.anglicky.Hello;

public class VsetkyPozdravy {
    public static void main(String[] args) { //vytvoriť objekty inštancií tried
        Hello anglicky = new Hello(); //trieda,názov balicka,trieda
        Szia madarsky = new Szia();
        Hallo nemecky = new Hallo();
        Ahoj slovensky = new Ahoj();

        // Volám metódy týchto objektov
        anglicky.pozdravujemAnglicky(); // názov balicka a názov metody v triede
        madarsky.pozdravujemMadarsky();
        nemecky.pozdravujemNemecky();
        slovensky.pozdravujemSlovensky();
        }
    }

