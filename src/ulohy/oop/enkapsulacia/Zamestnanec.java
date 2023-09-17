package ulohy.oop.enkapsulacia;

public class Zamestnanec {
    private String meno;
    private String priezvisko;
    private String pohlavie;
    private int rokNarodenia;



    public Zamestnanec() {
    }

    public Zamestnanec(String meno, String priezvisko, String pohlavie, int rokNarodenia) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.pohlavie = pohlavie;
        this.rokNarodenia = rokNarodenia;
    }



    @Override
    public String toString() {
        return "Meno: " + meno + "\nPriezvisko: " + priezvisko + "\nPohlavie: " + pohlavie + "\nRok narodenia: " + rokNarodenia;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public String getPohlavie() {
        return pohlavie;
    }

    public void setPohlavie(String pohlavie) {
        this.pohlavie = pohlavie;
    }

    public int getRokNarodenia() {
        return rokNarodenia;
    }

    public void setRokNarodenia(int rokNarodenia) {
        this.rokNarodenia = rokNarodenia;
    }
}
