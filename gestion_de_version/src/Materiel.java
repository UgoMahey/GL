
public class Materiel {

	private TypeMateriel typeMateriel;
	private int code_inv;
	
	public Materiel(TypeMateriel type,int code){
		
		typeMateriel = type;
		code_inv = code;
		
	}

	public TypeMateriel getTypeMateriel() {
		return typeMateriel;
	}

	public void setTypeMateriel(TypeMateriel typeMateriel) {
		this.typeMateriel = typeMateriel;
	}

	public int getCode_inv() {
		return code_inv;
	}

	public void setCode_inv(int code_inv) {
		this.code_inv = code_inv;
	}
	
	
	
	
}
