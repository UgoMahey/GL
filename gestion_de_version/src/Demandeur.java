import java.util.Vector;


public class Demandeur {

	private Vector<Reservation> reservations;
	private Adresse addr;
	private Origine origine;
	private Titre titre;
	private int noDemandeur;
	
	public Demandeur(Adresse addr,Origine origine,Titre titre, int noDemandeur){
		this.addr = addr;
		this.origine = origine;
		this.titre = titre;
		this.noDemandeur = noDemandeur;
		reservations = new Vector<Reservation>();
		
	}

	public Adresse getAddr() {
		return addr;
	}

	public void setAddr(Adresse addr) {
		this.addr = addr;
	}

	public Origine getOrigine() {
		return origine;
	}

	public void setOrigine(Origine origine) {
		this.origine = origine;
	}

	public Titre getTitre() {
		return titre;
	}

	public void setTitre(Titre titre) {
		this.titre = titre;
	}

	public Vector<Reservation> getReservations() {
		return reservations;
	}

	public int getNoDemandeur() {
		return noDemandeur;
	}
	
}
