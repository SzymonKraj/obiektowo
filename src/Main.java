public class Main {
    public static void main(String[] args) {




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