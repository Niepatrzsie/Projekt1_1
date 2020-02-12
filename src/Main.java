import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        //dodanie samochodow do bazy
        Samochod bmwM2 = new Samochod("Bmw", "M2","Bawaria-Motors", "brak",370);
        Samochod nissanGtr = new Samochod("Nissan", "GTR","Nissan-Motors","Coupe III", 600);
        Samochod toyotaGt86 = new Samochod("Toyota","GT86", "Toyota-Motors","brak", 200);
        Samochod toyotaSupra = new Samochod("Toyota","Supra", "Toyota-Motors","MK5", 340);
        Samochod hondaCivic = new Samochod("Honda", "Civic", "Honda-Motors","X", 320);
        Samochod fordFocusRs = new Samochod("Ford", "FOCUS-RS","Ford Motor Company", "MK3",350);
        Samochod fordFocusST = new Samochod("Ford", "FOCUS-ST","Ford Motor Company", "MK3",250);
        Samochod abarth500 = new Samochod("Abarth", "500","Fiat-Motors", "brak",160);
        Baza baza = new Baza();
        baza.dodajSamochod(bmwM2);
        baza.dodajSamochod(nissanGtr);
        baza.dodajSamochod(toyotaGt86);
        baza.dodajSamochod(toyotaSupra);
        baza.dodajSamochod(hondaCivic);
        baza.dodajSamochod(fordFocusRs);
        baza.dodajSamochod(fordFocusST);
        baza.dodajSamochod(abarth500);
        baza.menuPoczatkowe();








    }

}
