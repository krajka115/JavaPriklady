package ulohy.oop.enkapsulacia;

public class Auto {
    private String znacka;
    private String farba;
    private int rokVyroby;

    public String vypisZnackuMetoda() {
        return ("\nZnačka auta: " + znacka + "\nFarba auta: " + farba + "\nRok výroby: " + rokVyroby);
    }

    @Override
    public String toString() {
        return "\nZnačka auta: " + znacka + "\nFarba auta: " + farba + "\nRok výroby: " + rokVyroby;
    }


    public Auto() {
    }

    public Auto(String znacka, String farba, int rokVyroby) {
        this.znacka = znacka;
        this.farba = farba;
        this.rokVyroby = rokVyroby;
    }

    public String getZnacka() {
        return znacka;
    }

    public void setZnacka(String znacka) {
        this.znacka = znacka;
    }

    public String getFarba() {
        return farba;
    }

    public void setFarba(String farba) {
        this.farba = farba;

    }

    public int getRokVyroby() {
        return rokVyroby;
    }

    public void setRokVyroby(int rokVyroby) {
        this.rokVyroby = rokVyroby;
    }
}

