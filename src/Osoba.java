import java.util.Scanner;

public abstract class Osoba {
    String imie;
    String nazwisko;
    int wiek;

    //konstruktor to metoda wyowływana w momencie tworzenia obiektu

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        wiek =7;
    }

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public Osoba() {
        imie = "";
        nazwisko = "";
        wiek = 0;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setImie(String imie) {

        Scanner scanner = new Scanner(System.in);
        String haslo = scanner.next();
        if (haslo.equals("qwe123")) {
            this.imie = imie;
        } else {
            System.out.println("nie mozesz wejsc");
        }
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
