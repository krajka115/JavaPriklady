package ulohy;

/*
Fizz buzz je skupinová slovná hra pre deti, ktorej účelom je naučiť ich delenie čísel. Hráči postupne vymenúvajú čísla, pričom nahrádzajú každé číslo deliteľné tromi slovom "fizz" a každé číslo deliteľné piatimi slovom "buzz".
        Hra
        Hráči zvyčajne sedia v kruhu. Prvý hráč povie číslo "1" a každý ďalší hráč povie číslo o jedno vyššie od predošlého. Akékoľvek číslo deliteľné tromi musí hráč nahradiť slovom fizz a akékoľvek číslo deliteľné piatimi slovom buzz. Čísla deliteľné oboma sa nahrádzajú slovami fizz buzz. Hráč, ktorý zaváha alebo urobí chybu je vylúčený z hry.
        Typická hra fizz buzz môže začínať takto:
        1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, Fizz Buzz, 31, 32, Fizz, 34, Buzz, Fizz, …
        Programovanie
        Fizz buzz (v tomto kontexte často nazývaný FizzBuzz) býva používaný pri vstupnom interview počítačových programátorov. Vytvorenie programu, ktorý vypíše výstup prvých 100 čísel hry FizzBuzz je triviálnym problémom pre každého potenciálneho programátora, takže zamestnávatelia môžu ľahko odhaliť tých, ktorí nie sú dostatočne schopní programátori.
        Zdroj: https://sk.wikipedia.org/wiki/Fizz_buzz
        */


public class FizzBuzz {
    public static void main(String[] args) {

        int cisla = 50;


        for (int i = 1; i <= cisla; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(" FizzBuzz ");
            }else if (i % 3 == 0) {
                System.out.print(" Fizz ");
            } else if (i % 5 == 0) {
                System.out.print(" Buzz ");
            } else {
                System.out.print(" " + i);

            }
        }
        System.out.println();
        {
            for (int i = 1; i <= 30; i++) {
                if (i % 3 == 0) System.out.print("Fizz, ");
                if (i % 5 == 0) System.out.print("Buzz, ");
                if (i % 3 != 0 && i % 5 !=0)
                    System.out.print(i + ", ");
            }
        }
    }



        }


