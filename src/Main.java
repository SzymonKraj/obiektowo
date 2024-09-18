public class Main {
    public static void main(String[] args) {

        Osoba osobaJas = new Osoba("Jas","Sliweczka",10);
        System.out.println(osobaJas.getImie());
        System.out.println(osobaJas.getNazwisko());
        osobaJas.setImie("Jan");

        Osoba osobaAla = new Osoba("Ala","Fala");
        System.out.println(osobaJas.getWiek());
        System.out.println(osobaAla.getWiek());
        Osoba osobaX = new Osoba();

        System.out.println(osobaJas);
        System.out.println("Liczba uczniow"+Uczen.liczbaObiektow);
        Uczen uczen = new Uczen("Daniel","Ustianowski");
        System.out.println("Liczba uczniow"+Uczen.liczbaObiektow);
        Uczen uczen2 = new Uczen("Daniel","Ustianowski");
        System.out.println("Liczba uczniow"+Uczen.liczbaObiektow);
        Uczen uczen3 = new Uczen("Daniel","Ustianowskiii");
        System.out.println("Liczba uczniow"+Uczen.liczbaObiektow);

        Nauczyciel nauczylSlowik = new Nauczyciel("Marlena","Slowik",25,"matematyka");
        System.out.println(nauczylSlowik);
    }
}