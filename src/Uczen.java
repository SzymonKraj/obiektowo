public class Uczen extends Osoba{

    private int nrEwidencyjny;
    static int liczbaObiektow;

    public Uczen(String imie, String nazwisko, int wiek, int nrEwidencyjny) {
        super(imie, nazwisko, wiek);
        this.nrEwidencyjny = nrEwidencyjny;
    }

    public Uczen(String imie, String nazwisko) {
        super(imie, nazwisko);
        liczbaObiektow++;
        nrEwidencyjny = liczbaObiektow;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "nrEwidencyjny=" + nrEwidencyjny +
                ", imie='" + getImie() +
                ", nazwisko='" + getNazwisko() +
                '}';
    }
}
