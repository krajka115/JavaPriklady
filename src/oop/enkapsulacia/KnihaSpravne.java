package oop.enkapsulacia;

public class KnihaSpravne {
    private String nazov; // modifikátory private nie public
    private String autor;
    private int rokVydania;
    private double cena;

    //prázdny konstruktor - bezparametrický = vytvorený z triedy
    public KnihaSpravne() {
    }

    // parametricky konstruktor
    // prvotný zmysel je naplnenie objektu (inštancie triedy)
    public KnihaSpravne(String nazov, String autor, int rokVydania, double cena) {
        this.nazov = nazov;
        this.autor = autor;
        this.rokVydania = rokVydania;
        this.cena = cena;
    }

    // generate/ getter and setter/ na všetky privátne/OK
    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        //Ďalšia aplikačná logika, príp. nejaká kontrola, overenie premennej (parametra) nazov predtým ako ju uložívme do atribut triedy
        this.nazov = nazov;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getRokVydania() {
        return rokVydania;
    }

    public void setRokVydania(int rokVydania) {
        this.rokVydania = rokVydania;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Názov knihy: " + nazov + "\nAutor knihy: " + autor + "\nCena knihy: " + cena + "\nRok vydania: " + rokVydania;
    }
}
