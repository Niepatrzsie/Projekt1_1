import java.util.ArrayList;
import java.util.Scanner;

public class Baza {

    private ArrayList<Samochod> arr;

    public Baza(){
            System.out.println("Wybierz opcje logowania");
            System.out.println("1 - Administrator");
            System.out.println("2 - Uzytkownik");
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            switch (s){
                case "1":
                    System.out.println("Zalogowano jako adminnistrator");
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("1 - Sprawdz wszystkie auta");
                    String s1 = sc1.next();
                    switch (s1){
                        case "1":
                            System.out.println("Wszystkie nasze auta: ");
                            this.sprawdzWszystkieAuta();
                    }
                    break;
                case "2":
                System.out.println("Zalogowano jako uzytkownik");
                break;
        }
    }
    public ArrayList<Samochod> dodajSamochod(String nazwa, String model, String grupa, String wersja, String iloscKoni){


    }
    public ArrayList<Samochod> sprawdzWszystkieAuta(ArrayList<Samochod> arr){
        return arr;
    }

}
