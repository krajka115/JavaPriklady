package sk.tmconsulting.pozdravy;

import sk.tmconsulting.pozdravy.slovensky.Ahoj;
import sk.tmconsulting.pozdravy.nemecky.Hallo;
import sk.tmconsulting.pozdravy.madarsky.Szia;
import sk.tmconsulting.pozdravy.anglicky.Hello;

public class VsetkyPozdravy {
    public static void main(String[] args) {

        // Volám metódy týchto objektov
        System.out.println("Pozdravy v Anglickom, Maďarskom, Nemeckom a Slovenskom jazyku: ");
        Hello.pozdravujem();
        Szia.pozdravujem();
        Hallo.pozdravujem();
        Ahoj.pozdravujem();

        System.out.println(); // Prázdny riadok





        // Dynamicke volanie metod
        // ak chceme volat nestaticke metody, musime najprv vytvorit objekt alebo instanciu triedy
    Hello helloObjekt = new Hello(); // vytvorenie objektu, resp. instancii triedy Hello
    helloObjekt.pozdravujemDynamicky();

    Szia sziaObjekt = new Szia();
    sziaObjekt.pozdravujemDynamicky();

    Hallo halloObjekt = new Hallo();
    halloObjekt.pozdravujemDynamicky();

    Ahoj ahojObjekt = new Ahoj();
    ahojObjekt.pozdravujemDynamicky();
    }
}


