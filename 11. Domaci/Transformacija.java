public class Transformacija {
    int pomeraj;

    void setPomeraj(int pomeraj){
        this.pomeraj = pomeraj;
    }

    int getPomeraj(){
        return this.pomeraj;
    }

    Tekst sifrujTekst(Tekst ulaz){
        StringBuilder newText = new StringBuilder();
        String text = ulaz.getText();

        for(int i = 0; i < text.length(); i++){
            char value = text.charAt(i);
            int nextValue = (int)value + 1;
            char c = (char)nextValue;
            newText.append(c);
        }

        ulaz.setText(newText.toString());

        return ulaz;
    }

    Tekst desifrujTekst(Tekst ulaz){
        StringBuilder newText = new StringBuilder();
        String text = ulaz.getText();

        for(int i = 0; i < text.length(); i++){
            char value = text.charAt(i);
            int nextValue = (int)value - 1;
            char c = (char)nextValue;
            newText.append(c);
        }

        ulaz.setText(newText.toString());

        return ulaz;
    }
}
