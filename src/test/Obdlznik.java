package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Obdlznik {
    public static double vypocitajObvod(double stranaA, double stranaB) {
        return 2 * (stranaA + stranaB);
    }
    public static double vypocitajObsah(double stranaA, double stranaB) {
        return stranaA * stranaB;
    }

    public static void main(String[] args) {
        double a = 2.5; // Strana a
        double b = 3.5; // Strana b

        // TODO vytvoriť menu polozky s(tart) pre vstupne zadavanie stran a, b a prikaz q pre ukoncenie pogramu. Inac program bude fungovat do nekonecna.
        System.out.println("Obvod obdĺžnika je: " + Obdlznik.vypocitajObvod(a, b));
        System.out.println("Obsah obdĺžnika je: " + Obdlznik.vypocitajObsah(a, b));

    }


}


