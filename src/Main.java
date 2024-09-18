public class Main {
    public static void main(String[] args) {

        Osoba osobaJas = new Osoba(imie"Jas",nazwisko"Sliweczka");
        System.out.println(osobaJas.imie);
        System.out.println(osobaJas.nazwisko);
        osobaJas.imie = "Janek";
        System.out.println(osobaJas.imie);
    }
}