import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Baza {

    private ArrayList<Samochod> listaSamochodow;
    private Samochod samochod;
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
                        System.out.println("Wszystkie nasze auta:");
                        System.out.println(getListaSamochodow());
                        menuPoczatkowe();
                        case "2":
                            System.out.println("Wpisz szukana Marke:");
                            String marka = sc1.next();
                            System.out.println("Wpisz szukany Model:");
                            String model = sc1.next();
                            if(getSamochod(marka,model) == null){
                                System.out.println("Nie mamy danego auta ! :(");
                            }else{
                                System.out.println(getSamochod(marka,model));
                            }
                            menuPoczatkowe();
                        case "3":
                            System.out.println("Wpisz dodawana marke");
                            String dodawanamarka = sc1.next();
                           if(sprawdzCzySlowo(dodawanamarka) == true){
                               System.out.println("Podana marke zakceptowno");
                               System.out.println("Wpisz dany model:");
                                String dodawanyModel = sc1.next();
                                    if(sprawdzModel(dodawanyModel) == true){
                                        System.out.println("Podany model zaakcetpowano!");
                                        System.out.println("Wpisz dana grupe:");
                                            String dodawanaGrupa = sc1.next();
                                            if(sprawdzCzySlowo(dodawanaGrupa) == true){
                                                System.out.println("Podana grupa zaakceptowano!");
                                                System.out.println("Wpisz dana wersje:");
                                                String dodawanaWersja = sc1.next();
                                                if (dodawanaWersja != null){
                                                    System.out.println("Zaakceptowano podawana wersje");
                                                    System.out.println("Podaj ilosc koni");
                                                    String dodawnaIloscKoni = sc1.next();
                                                    if(dodawnaIloscKoni != null){
                                                        int konie = Integer.parseInt(dodawnaIloscKoni);
                                                        System.out.println("Zakceptowano ilosc koni");
                                                        samochod = new Samochod(dodawanamarka,dodawanyModel,dodawanaGrupa,dodawanaWersja,konie);
                                                        System.out.println("Dodano samochod do bazy");
                                                        dodajSamochod(samochod);
                                                        System.out.println(getListaSamochodow());
                                                        menuPoczatkowe();
                                                    }else{
                                                        System.out.println("Dodawana ilosc koni ma błędny format");
                                                        menuPoczatkowe();
                                                    }
                                                }else{
                                                    System.out.println("Dodawana wersja ma błedny format");
                                                    menuPoczatkowe();
                                                }
                                            }else{
                                                System.out.println("Dodawna grupa ma błedny format");
                                                menuPoczatkowe();
                                            }
                                    }else{
                                        System.out.println("Podany model nie został zaakceptowany, model składa się tylko z liter!");
                                        menuPoczatkowe();
                                    }
                           }else{
                               System.out.println("Podałeś błedną markę, marka składa się tylko z liter!");
                               menuPoczatkowe();
                           }

                           // System.out.println("Dodalismy samochod do naszej listy!");
                            //System.out.println(getListaSamochodow());
                            //menuPoczatkowe();
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
    public boolean sprawdzCzySlowo(String str){
        Pattern p = Pattern.compile("^[A-Z]\\w+$");
        Matcher m = p.matcher(str);
        boolean b = m.matches();
        if(b == true){
            return true;
        }else{
            return false;
        }
    }
    public boolean sprawdzModel(String str){
        Pattern p = Pattern.compile("\\w+");
        Matcher m = p.matcher(str);
        boolean b = m.matches();
        if(b == true){
            return true;
        }else{
            return false;
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
