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
    }
}