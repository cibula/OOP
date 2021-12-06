import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
		
		Tim tim = new Tim("tim.txt");		

		System.out.println("Menadzeri su: ");
		Osoba[] f = tim.izdvojMenadzere();
		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i]);
		}
    }
}
