import java.util.*;

abstract class Hrana {
    Double tezina, domet;
  public Hrana(){
        this.tezina = 0.0;
        this.domet = 0.0;
    }
    public Hrana(Double tezina, Double domet){
        this.tezina = tezina<0 ? 0: tezina;
        this.domet = domet<0 ? 0: domet;
    }
    public Double getTezina(){return this.tezina;}
    public Double getDomet(){return this.domet;}
    public void Baci(){}
    @Override
    public String toString() {
        return "tezina: "+ this.tezina +"g, domet: " + this.domet + "m";
    }
}

class Jabuka extends Hrana {
    String boja;
    public Jabuka(Double tezina,Double domet, String boja){
        super(tezina, domet);
        this.boja = boja;
    }
    public String getBoja(){return this.boja;}
    public void setBoja(String boja){this.boja = boja;}
    @Override
    public void Baci() {
        System.out.println(this.tezina>220?"Ogromna":"" + " " + this.getBoja() +" jabuka leti kroz vazduh!");

    }
    @Override
    public String toString() {
        return "[Jabuka] boja: " + this.boja + " tezina: "+ this.tezina +"g, domet: " + this.domet + "m";

    }
}


class Supa extends Hrana {
    Double temp;
    public Supa(Double tezina, Double domet, Double temp){
        super(tezina, domet);
        this.temp = temp;
    }
    public Double getTemp(){return this.temp;}
    public void setTemp(Double temp){this.temp = temp;}
    @Override
    public void Baci() {
        System.out.println(temp<30?"ledena":temp<45?"mlaka":"vrela" + " supa krstari vazduhom ka svojoj meti");
    }
    @Override
    public String toString() {
        return "[Supa] temperatura: " + this.temp + " tezina: "+ this.tezina +"g, domet: " + this.domet + "m";
    }
}

class TestHrana{
    Jabuka j1 = new Jabuka(220.0, 60.0, "crvena");
    Jabuka j2 = new Jabuka(115.0, 0.0, "zelena");
    Supa s1 = new Supa(200.0, 5.0, 20.0);
    Supa s2 = new Supa(200.0, 5.0, 60.0);
    
   public TestHrana(){
j1.toString();
j2.toString();
j1.Baci();
j2.Baci();
s1.toString();
s2.toString();
s1.Baci();
s2.Baci();
    }

}

