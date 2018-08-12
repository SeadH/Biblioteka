import java.util.ArrayList;
import java.util.Scanner;
public class Racun {

	private String ime;
	private int brojRacuna;
	private int brojPosu�enihKnjiga;
	
	public Racun(){}
	
	
	


	public Racun(int brojRacuna, String ime) {
		super();
		this.ime = ime;
		this.brojRacuna = brojRacuna;
	}





	public Racun(String ime, int brojRacuna, int brojPosu�enihKnjiga) {
		super();
		this.ime = ime;
		this.brojRacuna = brojRacuna;
		this.brojPosu�enihKnjiga = brojPosu�enihKnjiga;
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

	public int getBrojPosu�enihKnjiga() {
		return brojPosu�enihKnjiga;
	}

	public void setBrojPosu�enihKnjiga(int brojPosu�enihKnjiga) {
		this.brojPosu�enihKnjiga = brojPosu�enihKnjiga;
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
				System.out.println("Racun sa brojem "+racun.getBrojRacuna()+" ve� postoji");
			}
			
		}
		if(racun.getBrojRacuna() <= 0){
			validacija = false;
			System.out.println("Dozvoljeno je kreiranje samo sa pozitivnim brojem!\n");
		}
		if(validacija){
			racuni.add(racun);
			System.out.println(">>>Ra�un je uspje�no kreiran<<<");
		}
		return racun;
	}
	
	public static Racun infoRacun(ArrayList<Racun>racuni, Scanner unos){
		Racun racun = new Racun();
		System.out.print("Unesite broj ra�una: ");
		racun.setBrojRacuna(unos.nextInt());	
		
		for(Racun r : racuni){
			if(r.getBrojRacuna()==racun.getBrojRacuna()){
			System.out.println("\n------------------------\nIme vlasnika: "+ r.getIme()+"\nBroj posu�enih knjiga: "+ r.getBrojPosu�enihKnjiga()+"\n------------------------");
		}}
		return racun;
	}
	
}
