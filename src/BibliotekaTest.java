
import java.util.ArrayList;
import java.util.Scanner;

public class BibliotekaTest extends Racun {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		ArrayList<Racun> racuni = new ArrayList<>();
		Racun racun = new Racun();
		ArrayList<Knjiga> knjige = new ArrayList<>();
		int izbor = 0;
		while (izbor != 4) {
			System.out.println("===================================\nIzbaerite opciju:");
			System.out.println(" 1) Kreiraj Raèun\n 2) Informacije\n 3) Kreiraj knjigu\n 4) Izlaz\n===================================");
			izbor = unos.nextInt();

			switch (izbor)

			{
			case 1:
				racun.kreirajRacun(racuni, unos);
				break;
			case 2:
				racun.infoRacun(racuni, unos);
				break;
			case 3: Knjiga.kreirajKnjigu(knjige, unos);
			break;
			case 4: System.out.println("KRAJ PROGRAMA");
			break;
			default:
				System.out.println("Pogrešan unos!");
				
			}

		}
	}
}
