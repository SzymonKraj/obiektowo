public sealed class Nauczyciel extends Osoba implements Dyzurny permits Wychowawca{
    private  String przedmiot;

    public Nauczyciel(String imie, String nazwisko, int wiek, String przedmiot) {
        super(imie, nazwisko, wiek);
        this.przedmiot = przedmiot;

    }

    @Override
    public String toString() {
        return "Nauczyciel{" +
                " imie "+getImie()+
                " przedmiot= '" + przedmiot + '\'' +
                '}';
    }

    @Override
    public void wykonajDyzur() {
        System.out.println("spacer po korytarzu");
    }
}
