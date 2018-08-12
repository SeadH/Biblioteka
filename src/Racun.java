import java.util.ArrayList;
import java.util.Scanner;
public class Racun {

	private String ime;
	private int brojRacuna;
	private int brojPosuðenihKnjiga;
	
	public Racun(){}
	
	
	


	public Racun(int brojRacuna, String ime) {
		super();
		this.ime = ime;
		this.brojRacuna = brojRacuna;
	}





	public Racun(String ime, int brojRacuna, int brojPosuðenihKnjiga) {
		super();
		this.ime = ime;
		this.brojRacuna = brojRacuna;
		this.brojPosuðenihKnjiga = brojPosuðenihKnjiga;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public int getBrojRacuna() {
		return brojRacuna;
	}

	public void setBrojRacuna(int brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	public int getBrojPosuðenihKnjiga() {
		return brojPosuðenihKnjiga;
	}

	public void setBrojPosuðenihKnjiga(int brojPosuðenihKnjiga) {
		this.brojPosuðenihKnjiga = brojPosuðenihKnjiga;
	}
	
	
	Scanner unos = new Scanner(System.in);
	
	public static Racun kreirajRacun(ArrayList<Racun>racuni, Scanner unos){
		Racun racun = new Racun();
		System.out.print("===================================\nUnesite broj racuna: ");
		racun.setBrojRacuna(unos.nextInt());
		System.out.print("Unesite ime korisnika: ");
		 racun.setIme(unos.next());
		boolean validacija = true;
		for(Racun r : racuni){
			if(r.getBrojRacuna()==racun.getBrojRacuna()){
				validacija=false;
				System.out.println("Racun sa brojem "+racun.getBrojRacuna()+" veæ postoji");
			}
			
		}
		if(racun.getBrojRacuna() <= 0){
			validacija = false;
			System.out.println("Dozvoljeno je kreiranje samo sa pozitivnim brojem!\n");
		}
		if(validacija){
			racuni.add(racun);
			System.out.println(">>>Raèun je uspješno kreiran<<<");
		}
		return racun;
	}
	
	public static Racun infoRacun(ArrayList<Racun>racuni, Scanner unos){
		Racun racun = new Racun();
		System.out.print("Unesite broj raèuna: ");
		racun.setBrojRacuna(unos.nextInt());	
		
		for(Racun r : racuni){
			if(r.getBrojRacuna()==racun.getBrojRacuna()){
			System.out.println("\n------------------------\nIme vlasnika: "+ r.getIme()+"\nBroj posuðenih knjiga: "+ r.getBrojPosuðenihKnjiga()+"\n------------------------");
		}}
		return racun;
	}
	
}
