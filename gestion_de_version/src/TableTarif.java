
public class TableTarif {

	private int code;
	private String libelle;
	int tarif;
	
	private int calculTarif(int code,Demandeur d,Reservation r){
		
		return 0;
	}
	
	public int getCode() {
		return code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public TableTarif(TableCode c,String l,Demandeur d,Reservation r){
		code = c.nextCode();
		libelle = l;
		tarif = calculTarif(code,d,r);
	}
	
	
}
