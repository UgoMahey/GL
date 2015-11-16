import java.util.Date;


public class Reservation {

	private Salle salle;
	private Duree duree;
	private Materiel mater;
	private Date date;
	private int noReserve;
	private float prixReserv;
	
	public Reservation(Salle s, Duree du,Materiel mat,Date date, int idReserv, float prixReserv){
		salle = s;
		duree = du;
		mater = mat;
		this.date = date;
		this.noReserve = idReserv;
		this.prixReserv = prixReserv;
		
	}

	
	
	
	public float getPrixReserv() {
		return prixReserv;
	}

	public void setPrixReserv(float prixReserv) {
		this.prixReserv = prixReserv;
	}

	public int getNoReserve() {
		return noReserve;
	}

	
	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Duree getDuree() {
		return duree;
	}

	public void setDuree(Duree duree) {
		this.duree = duree;
	}

	public Materiel getMater() {
		return mater;
	}

	public void setMater(Materiel mater) {
		this.mater = mater;
	}




	public void Affiche() {
		
	}
	
	
	
}
