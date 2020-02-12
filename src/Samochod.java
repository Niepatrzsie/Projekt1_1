public class Samochod {
    private String marka;
    private String model;
    private String grupa;
    private String wersja;
    private int przebieg;
    private int iloscKoni;
    private String napend;
    private int iloscMiejsc;
    private String dataUbezpieczenia;
    private String dataPrzegladu;

    public Samochod(String marka, String model, String grupa, String wersja, int iloscKoni) {
        this.marka = marka;
        this.model = model;
        this.grupa = grupa;
        this.wersja = wersja;
        this.iloscKoni = iloscKoni;

    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public void setDataUbezpieczenia(String dataUbezpieczenia) {
        this.dataUbezpieczenia = dataUbezpieczenia;
    }

    public void setDataPrzegladu(String dataPrzegladu) {
        this.dataPrzegladu = dataPrzegladu;
    }

    public String getMarka(){
        return marka;
    }
    public String gerModel(){
        return model;
    }
    public int getPrzebieg() {
        return przebieg;
    }

    public String getDataUbezpieczenia() {
        return dataUbezpieczenia;
    }

    public String getDataPrzegladu(){
        return dataPrzegladu;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", grupa='" + grupa + '\'' +
                ", wersja='" + wersja + '\'' +
                ", przebieg=" + przebieg +
                ", iloscKoni=" + iloscKoni +
                ", napend='" + napend + '\'' +
                ", iloscMiejsc=" + iloscMiejsc +
                ", dataUbezpieczenia='" + dataUbezpieczenia + '\'' +
                ", dataPrzegladu='" + dataPrzegladu + '\'' +
                '}';
    }
}
