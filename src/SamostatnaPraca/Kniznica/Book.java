package SamostatnaPraca.Kniznica;
// vytvorím si základ údajov pre knihu, settery a gettery, konštruktor(na jednoduchšie vypisovanie dát v metode) a toString pre jednoduchsíe vypísanie parametrov ktoré chcem.
public class Book {
    private String nameOfBook;
    private String author;
    private int yearOfPublication;

    public Book() {
    }
    public Book(String nameOfBook, String author, int yearOfPublication) {
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Názov knihy: " + nameOfBook + "\n" + "Autor: " + author + "\n" + "Rok vydania: " + yearOfPublication;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
