public class PolovniAuto extends PolovnoVozilo{


    private int broj_vrata;

    public PolovniAuto(int broj_vrata, int starost) {
        this.broj_vrata = broj_vrata;
        this.starost_vozila = starost;
    }

    @Override
    int cena() {

        if(broj_vrata > 3) {
            return baznaCena();
        }

        else
        {
            int nova_cena;
            nova_cena = (int) (0.05 * (double)baznaCena());
            return (baznaCena() - nova_cena);
        }
    }

    @Override
    String opisVozila() {

        String opis = "Vozilo je u odlicnom stanju, nikad lupana, osteceno ili bilo sta slicno. Sve je ispravno i sve radi. Moze test voznja na licu mesta. Cena je fiksna";
        return opis;
    }



}
public class PolovniKombi extends PolovnoVozilo{

    private int broj_vrata;

    public PolovniKombi(int broj_vrata, int starost) {
        this.broj_vrata = broj_vrata;
        this.starost_vozila = starost;
    }

    @Override
    int cena() {

        return (baznaCena() + broj_vrata * 50);
    }

    @Override
    String opisVozila() {
        return "Vozilo je u odlicnom stanju, nikad lupana, osteceno ili bilo sta slicno.";
    }


}
public abstract class PolovnoVozilo {

    protected int starost_vozila;

    abstract int cena();
    abstract String opisVozila();
    public String toString() {
        return null;
    }

    protected int baznaCena() {

        if(starost_vozila > 20) {
            return 400;
        }

        return (2000 - (starost_vozila) * 70);
    }

    public int getStarost_vozila() {
        return starost_vozila;
    }
    public void setStarost_vozila(int starost_vozila) {
        this.starost_vozila = starost_vozila;
    }


}
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;



public class Stovariste {

    private PolovnoVozilo[] polovna_vozila;

    public Stovariste(String file)throws IOException{

        BufferedReader br = new BufferedReader(new FileReader(file));
        int br_polovnih_vozila = Integer.parseInt(br.readLine().trim());

        polovna_vozila = new PolovnoVozilo[br_polovnih_vozila];

        for(int i = 0; i < br_polovnih_vozila; i++) {
            String linija = br.readLine();
            String[] tokeni = linija.split(",");

            String tip_vozila = tokeni[0].trim();
            int starost = Integer.parseInt(tokeni[1].trim());
            int broj_vrata = Integer.parseInt(tokeni[2].trim());
            if(tip_vozila == "auto") {

                polovna_vozila[i] = new PolovniAuto(broj_vrata, starost);
            }
            else {
                polovna_vozila[i] = new PolovniKombi(broj_vrata, starost);
            }

        }
    }

    public void najjeftinijiKombi() {

        int i;
        int broj_kombija = 0;
        PolovniKombi[] kombiji = new PolovniKombi[polovna_vozila.length];
        for(i=0;i< polovna_vozila.length;i++) {
            if(i % 2 == 1) {
                kombiji[i] = (PolovniKombi) polovna_vozila[i];
                broj_kombija++;
            }
        }

        Arrays.sort(kombiji);

        for(i=0;i<broj_kombija;i++) {
            System.out.println(i + ".Kombi je :");
            String a = kombiji[i].toString();
            System.out.println(a);
        }

        return;
    }


}
