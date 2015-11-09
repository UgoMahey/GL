/**
	 * Définie une class singleton TableCode pour définir un code unique à chaque Table
	 *   
	 *   
	 *   
	 *   
	 *   */
public final class TableCode {
	//Attr qui représente le nombre de table présente
	private int cpt;
	
	
	private static volatile TableCode instance = null;
	private TableCode(){
		cpt=0;
	}
	
	public final static TableCode getInstance(){
		
		if (TableCode.instance == null){
			synchronized(TableCode.class){
				if(TableCode.instance==null){
					TableCode.instance = new TableCode();
				}
			}
		}
		return TableCode.instance;
	}
	public int nextCode(){
		
		cpt++;
		return cpt;
		
	}
	
}
