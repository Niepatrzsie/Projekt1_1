import java.util.ArrayList;
import java.util.Scanner;

public class Baza {

    private ArrayList<Samochod> listaSamochodow;

    public Baza(){
        listaSamochodow = new ArrayList<>();
    }
    public void menuPoczatkowe(){
        System.out.println("Wybierz opcje logowania");
        System.out.println("1 - Administrator");
        System.out.println("2 - Uzytkownik");
        System.out.println("3 - Wyjscie");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        switch (s){
            case "1":
                System.out.println("Zalogowano jako adminnistrator");
                Scanner sc1 = new Scanner(System.in);
                System.out.println("1 - Sprawdz wszystkie auta");
                System.out.println("2 - Sprawdz wybrane auto");
                System.out.println("3 - Dodaj date ubezepieczenia");
                System.out.println("4 - Dodaj date przegladu");
                System.out.println("5 - zmien stan auta (dostepny/niedostpeny)");
                String s1 = sc1.next();
                switch (s1){
                    case "1":
                        System.out.println("Wszystkie nasze auta: ");
                        System.out.println(getListaSamochodow());
                        menuPoczatkowe();
                        case "2":

                }
                break;
            case "2":
                System.out.println("Zalogowano jako uzytkownik");
                break;
            case "3":
                System.out.println("Dziekujemy za skorzystanie z naszej aplikacji, do zobaczenia!");
                System.exit(0);
        }
    }
    public void dodajSamochod(Samochod samochod){
        listaSamochodow.add(samochod);
    }
    public ArrayList<Samochod> getListaSamochodow() {
        return listaSamochodow;
    }


}
