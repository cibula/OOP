public class Osoba {
	
	private String ime;
	private boolean jeMenadzer;
	
	public Osoba(String ime, boolean jeMenadzer) {
		this.ime = ime;
		this.jeMenadzer = jeMenadzer;
	}

	public String getIme() {
		return ime;
	}

	public boolean getJeMenadzer() {
		return jeMenadzer;
	}

	@Override
	public String toString() {
		return ime + ", menadzer: " + jeMenadzer;
	}
}