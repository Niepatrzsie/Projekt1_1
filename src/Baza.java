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
                System.out.println("3 - Dodaj wybrane auto");
                System.out.println("4 - Dodaj przebieg auta");
                System.out.println("5 - Dodaj date ubezepieczenia do danego auta");
                System.out.println("6 - Dodaj date przegladu do danego auta");
                System.out.println("7 - zmien stan auta (dostepny/niedostpeny)");
                String s1 = sc1.next();
                switch (s1){
                    case "1":
                        System.out.println("Wszystkie nasze auta: ");
                        System.out.println(getListaSamochodow());
                        menuPoczatkowe();
                        case "2":
                            System.out.println("Wpisz szukana Marke");
                            Scanner sc2 = new Scanner(System.in);
                            String s2 = sc2.next();
                            System.out.println("Wpisz szukany Model");
                            String s3 = sc2.next();
                            if(getSamochod(s2,s3) == null){
                                System.out.println("Nie mamy danego auta");
                            }else{
                                System.out.println(getSamochod(s2,s3));
                            }
                            menuPoczatkowe();
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
    public Samochod getSamochod(String marka, String model){
        for(int i =0; i<listaSamochodow.size(); i++){
            if (listaSamochodow.get(i).getMarka().equals(marka) && listaSamochodow.get(i).gerModel().equals(model)){
                return listaSamochodow.get(i);
            }
        }
        return null;
    }

}
