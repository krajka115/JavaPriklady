
public class Premenne {
    public static void main(String[] args) {
        boolean jeJavaLahka = true;

        String menoZamestnanca = "Ján";
        String priezvisko = "Žitniak";
        String celeMeno = menoZamestnanca + " " + priezvisko + " je zamestnancom TM Consulting."; // Spajame obsah premennych a vlastneho textu

        System.out.println(celeMeno);
        // System.out.println(menoZamestnanca + " " + priezvisko + " je zamestnancom TM Consulting.");

        int mojeCislo = 15;
        int mojeCisloVynasobene2mi = mojeCislo * 2;

        System.out.println("Pôvodne číslo je: " + mojeCislo);
        System.out.println("Pôvodne číslo vynásobené 2-mi: " + mojeCisloVynasobene2mi);

        int mojeCislo2;
        mojeCislo2 = 15;
        System.out.println(mojeCislo2);

        int mojeCislo3 = 15;
        mojeCislo3 = 20;  // mojeCislo3 teraz obsahuje hodnotu 20
        System.out.println(mojeCislo3);

        final int konstanta = 15; // deklaracia konstanty cez klucove slovo final
        // konstanta = 20;  // will generate an error: cannot assign a value to a final variable

        int myNum = 5;
        float myFloatNum = 5.99f; // Deklarujeme desatinne cislo, na konci musi byt uvedene f
        double myDoubleNum = 5.99; // Deklarujeme desatinne cislo, ktore je 2x vacsie ako float, nemusi sa uvadzat pismeno f
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        byte cisloTypuByte = 127;
        byte cisloTypuBytePoScitani = cisloTypuByte;

        System.out.println(cisloTypuByte);
        System.out.println(cisloTypuBytePoScitani);

        short cisloTypuShort = 32000;

        int x = 5;
        int y = 6;
        int sum = x + y;
        System.out.println(sum); // Print the value of x + y

        int x2 = 5, y2 = 6, z2 = 50;
        System.out.println(x2 + y2 + z2);

        int x3, y3, z3;
        x3 = y3 = z3 = 50;
        System.out.println(x3 + y3 + z3);

        int premenna;

        System.out.println("Je Java ľahký programovací jazyk? Odpoveď je: " + jeJavaLahka);

        char myGrade = 'B';
        String mojePismeno = "B";
        System.out.println(myGrade);

        char myVar1 = 65, myVar2 = 66, myVar3 = 67, myVar4 = 126, myVar5 = 128;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);
        System.out.println(myVar4);
        System.out.println(myVar5);
        
        short kratkeCislo = 20;
        int celeCislo = kratkeCislo + 1;


        double desatinneCislo = 0.9;
        int celeCislo2 = (int)desatinneCislo;
        System.out.println("Sčítanie desatinného čísla a celého: " + celeCislo2);

        String cisloAkoString = "2.5";
        //int sumar = Integer.parseInt(cisloAkoString) + 1;
        //System.out.println("Sčítanie čísla typu String a celého: " + sumar);

        double sumar2 = Double.parseDouble(cisloAkoString) + 1;
        System.out.println("Sčítanie čísla typu String a desatinného: " + sumar2);

        // TODO Prestavka do 19.30. Budeme pokracovat 19.31

    }
}
