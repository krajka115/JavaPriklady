package SamostatnaPraca.Kniznica;

public class BookMain {
    public static void main(String[] args) {

        // Ak chceme vyuzivat nestaticke metody, teda tie, v ktorych nie je napisane slovo static, tak musime najprv vytvorit objekt
        BookService bookServiceObjekt = new BookService();
        bookServiceObjekt.startMenuBook();

        // Start menu, resp. aplikacie, metodu startMenu vytvorím v BookService a bude to hlavná ponuka menu s podmienkou a už funkcie pod číslami budú samostatné metódy
      //  bookServiceObjekt.zobrazMenu();




        // Vypisanie zoznamu knih z ArrayList
         //     bookServiceObjekt.zobrazVsetkyKnihy();

        // Otestovanie funkcionality pridavania knihy
        //        bookServiceObjekt.zadajNovuKnihu();
    }
}
