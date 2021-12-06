public final class Programer extends Osoba {

    private int plata;

    public Programer(String ime, boolean jeMenadzer, int plata) {
		super(ime, jeMenadzer);
		this.plata = plata;
	}

    public int getPlata(){
        return plata;
    }

    @Override
	public String toString() {
		return super.toString() + ", programer [plata=" + plata + "]";
	}

}
