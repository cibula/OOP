public class Rotacija {
    int brojMesta;
    int smer; // smer == 1 za desno, smer == -1 za levo

    void setBrojMesta(int brojMesta){
        this.brojMesta = brojMesta;
    }

    void setSmer(int smer){
        this.smer = smer;
    }

    int getBrojMesta(){
        return this.brojMesta;
    }

    int getSmer(){
        return this.smer;
    }

    static String levaRotacija(String str, int d) {
        String ans = str.substring(d) + str.substring(0, d);
        return ans;
    }

    Tekst sifruj(Tekst ulaz){
        String text = ulaz.getText();

        if(this.smer == 1){
            String ans = text.substring(this.brojMesta) + text.substring(0, this.brojMesta);
            ulaz.setText(ans);
        }
        else if(this.smer == 0)
            ulaz.setText(levaRotacija(text, text.length() - this.brojMesta));

        return ulaz;
    }

    Tekst desifruj(Tekst ulaz){
        String text = ulaz.getText();

        if(this.smer == 0){
            String ans = text.substring(this.brojMesta) + text.substring(0, this.brojMesta);
            ulaz.setText(ans);
        }
        else if(this.smer == 1)
            ulaz.setText(levaRotacija(text, text.length() - this.brojMesta));

        return ulaz;
    }
}
