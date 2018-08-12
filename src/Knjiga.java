import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
public class Knjiga {

	private int brojKnjige;
	private String imeKnjige;
	private boolean statusKnjige;
	private Date datumIzdavanja;
	
	public Knjiga(){}
	
	public Knjiga(int brojKnjige, String imeKnjige, boolean statusKnjige) {
		super();
		this.brojKnjige = brojKnjige;
		this.imeKnjige = imeKnjige;
		this.statusKnjige = statusKnjige;
	}

	public int getBrojKnjige() {
		return brojKnjige;
	}

	public Date getDatumIzdavanja() {
		return datumIzdavanja;
	}

	public void setDatumIzdavanja(Date datumIzdavanja) {
		this.datumIzdavanja = datumIzdavanja;
	}

	public void setBrojKnjige(int brojKnjige) {
		this.brojKnjige = brojKnjige;
	}

	public String getImeKnjige() {
		return imeKnjige;
	}

	public void setImeKnjige(String imeKnjige) {
		this.imeKnjige = imeKnjige;
	}

	public boolean isStatusKnjige() {
		return statusKnjige;
	}

	public void setStatusKnjige(boolean statusKnjige) {
		this.statusKnjige = statusKnjige;
	}
	
	public static Knjiga kreirajKnjigu(ArrayList<Knjiga>knjige, Scanner unos){
	Knjiga knjiga = new Knjiga();	
	System.out.print("===================================\nUnesite broj knjige: ");
	knjiga.setBrojKnjige(unos.nextInt());
	System.out.print("Unesite naziv knjige: ");
	knjiga.setImeKnjige(unos.next());
	
	boolean validacija = true;
	
	for(Knjiga k : knjige){
		if(k.getBrojKnjige()==knjiga.getBrojKnjige())
		{
			System.out.println("Knjiga sa brojem "+knjiga.getBrojKnjige()+" ve� postoji");
		}
		
		if(knjiga.getBrojKnjige()<0)
		{
			System.out.println("Nemogu�e kreirati knjigu sa negativnim brojem!");
		}
		
		if(validacija){
			knjige.add(knjiga);
			System.out.println("Knjiga je uspje�no kreirana");
		}
	}
	
	return knjiga;
	}
	
	public static Knjiga podigniKnjigu(ArrayList<Racun>racuni,ArrayList<Knjiga>knjige, Scanner unos, Date datumIzdavanja){
		Knjiga knjiga = new Knjiga();
		Racun racun = new Racun();
		System.out.print("Unesite va� broj ra�una: ");
		racun.setBrojRacuna(unos.nextInt());
		System.out.print("Unesite naziv knjige koju �elite podi�i: ");
		knjiga.setImeKnjige(unos.next());
		
		boolean validacija = true;
		int brojacIzdatihKnjiga = 0;
		
		for(Racun r : racuni){
			if(r.getBrojRacuna()!=racun.getBrojRacuna())
			{
				System.out.println("Unijeli ste neva�e�i broj ra�una!");
			}
			
			if(racun.getBrojPosu�enihKnjiga()>=brojacIzdatihKnjiga){
				System.out.println("Prvo vrati posu�ene jarane!");
			}
			
		}
		
		
		
		
		return knjiga;
	}
	
}
