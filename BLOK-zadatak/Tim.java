import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Tim {

	private Osoba[] niz;

	public Tim(String fajl) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(fajl));
		int brOsoba = Integer.parseInt(br.readLine().trim());
		niz = new Osoba[brOsoba];
		for (int i = 0; i < brOsoba; i++) {
			String linija = br.readLine();
			String[] tokeni = linija.split(",");

			String ime = tokeni[0].trim();
			boolean Menadzer = tokeni[1].trim().equals("M");

				int plata = Integer.parseInt(tokeni[2].trim());
				niz[i] = new Programer(ime, Menadzer, plata);
		}
		br.close();
	}

	public Osoba[] getNiz() {
		return niz;
	}

	public Osoba[] izdvojMenadzere() {
		int brMenadzera = 0;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i].getJeMenadzer()) {
				brMenadzera++;
			}
		}
		Osoba[] menadzeri = new Osoba[brMenadzera];
		int j = 0;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i].getJeMenadzer()) {
				menadzeri[j] = niz[i];
				j++;
			}
		}

		return menadzeri;
	}

}