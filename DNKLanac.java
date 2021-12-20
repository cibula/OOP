public class DNKLanac {

    private String karikaDNK;
    private int trenutni_broj_karika;
    private int maximalni_broj_karika;

    public DNKLanac(int maximalni_broj_karika) {

        if(maximalni_broj_karika <= 0) {
            this.maximalni_broj_karika = 256;
        }
        this.maximalni_broj_karika = maximalni_broj_karika;

    }

    public DNKLanac(String DeoDNKLanca, int maximalni_broj_karika){

        karikaDNK = DeoDNKLanca;
        DNKLanac a = new DNKLanac(maximalni_broj_karika);

    }

    void Dodaj(char nova_karika) {

        if(trenutni_broj_karika + 1 > maximalni_broj_karika) {

            System.out.println("Nema mesta u DNK lancu !!!");
            return;
        }

        else {
            if(nova_karika != 'A'  nova_karika != 'C'  nova_karika != 'G' || nova_karika != 'T') {
                System.out.println("Uneta vrednost nije dobra !!! Molimo Vas unesite nesto od ponudjenog : A, C, G, T !!!");

            }

            // dodajemo zadati element na kraj lanca 
            karikaDNK = karikaDNK.substring(0, trenutni_broj_karika-1);
        }
    }

    int getA() {
        int brojA = 0;
        int i;
        // Prolazimo kroz ceo String i proveravamo da li su njegovi karakteri jednaki sa A ako jesu uvecamo brojac
        for(i=0;i < karikaDNK.length();i++) {
            if(karikaDNK.charAt(i) == 'A') {
                brojA++;
            }
        }

        return brojA;
    }

    int getTrenutnuDuzinuLanca() {
        return trenutni_broj_karika;
    }

    int getMaxKapacitetLanca() {
        return maximalni_broj_karika;
    }

    int BrojNepopunjenihMesta() {

        return maximalni_broj_karika - trenutni_broj_karika;
    }
}
