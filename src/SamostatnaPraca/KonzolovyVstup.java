package SamostatnaPraca;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KonzolovyVstup {
    public static void main(String[] args) {
        double cislo1 = 21, cislo2 = 3.1;
        Scanner skener = new Scanner(System.in);

        try {
        System.out.println("Zadaj prvé číslo: ");
        cislo1 = skener.nextDouble();}
        catch (InputMismatchException e){
            System.out.println("Zadala si zle číslo alebo text.");
        }
        System.exit(1);


        System.out.println("Zadaj druhé číslo: ");
        cislo2 = skener.nextDouble();

        System.out.println("Ďakujem, pekný deň. Katka");
    }




}
