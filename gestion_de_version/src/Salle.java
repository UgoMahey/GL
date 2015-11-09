import java.util.Vector;




public class Salle {
	
	private int no_etage;
	private int no_salle;
	private int no_bat;
	private int superficie;
	
	private TypeSalle typeSalle;
	private Vector<Materiel> listeMateriel;
	
	
	public Salle(int etage, int salle,int superficie,int bat,Vector<Materiel> vm){
		no_etage = etage;
		no_salle = salle;
		no_bat = bat;
		this.superficie = superficie;
		listeMateriel = vm;
	}
	
	/*
	public void setEltListeMateriel(Materiel m){
		listeMateriel.add(m);
	}
	*/
	
	public TypeSalle getTypeSalle() {
		return typeSalle;
	}

	public void setTypeSalle(TypeSalle typeSalle) {
		this.typeSalle = typeSalle;
	}
	
	public Vector<Materiel> getListeMateriel() {
		return listeMateriel;
	}
	public int getNo_etage() {
		return no_etage;
	}
	public void setNo_etage(int no_etage) {
		this.no_etage = no_etage;
	}
	public int getNo_salle() {
		return no_salle;
	}
	public void setNo_salle(int no_salle) {
		this.no_salle = no_salle;
	}
	public int getNo_bat() {
		return no_bat;
	}
	public void setNo_bat(int no_bat) {
		this.no_bat = no_bat;
	}
	public int getSuperficie() {
		return superficie;
	}
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	
	
	
	
}
