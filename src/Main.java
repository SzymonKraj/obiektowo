public class Main {
    public static void main(String[] args) {

        Osoba osobaJas = new Osoba("Jas","Sliweczka",13);
        System.out.println(osobaJas.getImie());
        System.out.println(osobaJas.getNazwisko());
        osobaJas.setImie("Jan");
    }
}