import java.util.Scanner;

public class Nezaposleni {

    private
        String ime;
        String struka;
        int broj_meseci;
        boolean posao;

    public

        //Konstruktor bez parametara - prazan
    Nezaposleni(){
        ime = "Pera Peric";
        struka = "Drvoseca";
        broj_meseci = 2;
        posao = false;
    }

    //Konstruktor sa parametrima
    Nezaposleni(String ime, String struka, int broj_meseci, boolean posao){
        this.ime = ime;
        this.struka = struka;
        this.broj_meseci = broj_meseci;
        this.posao = posao;
    }

    void setIme(String ime){
        this.ime = ime;
    }

    void setStruka(String struka) {
        this.struka = struka;
    }

    void setBrojMeseci(int br) {
        broj_meseci = br;
    }

    void setPosao(boolean posao) {
        this.posao = posao;
    }

    void NadjiPosao(){
        if(posao) {
            System.out.println("Vec imate posao !!!");
            return;
        }

        if(struka.compareTo("Programer") == 1) {
            posao = true;
            System.out.println("Cestitamo, pronasli ste posao !!!");
            return;
        }

        if(broj_meseci > 23) {
            System.out.println("Izvinite na cekanju, pronasli smo Vam posao !!!");
            posao = true;
            return;
        }

        System.out.println("Postovani, " + ime + "uspesno ste se zaposlili !!!");
    }


}
