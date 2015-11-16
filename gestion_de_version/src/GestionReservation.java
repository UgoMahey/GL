import java.util.Date;
import java.util.Vector;

/**
 * 
 *
 */

public final class GestionReservation {
	
	private static volatile GestionReservation instance = null;

	private static Vector<Reservation> listeReserv;
	private static int idReserv;
	
	
	/**
	 * Méthode qui créer une instance de GestionReservation s'il n'en existe pas et retourne l'instance existante sinon (il ne peut y avoir qu'une seul instance de la classe GestionReservation 
	 * @return instance de la class GestionReservation
	 * 
	 */
	public final static GestionReservation getInstance(){
		
		if (GestionReservation.instance == null){
			synchronized(GestionReservation.class){
				if(GestionReservation.instance==null){
					GestionReservation.instance = new GestionReservation();
				}
				
			}
		}
		return GestionReservation.instance;
	}
	
	private GestionReservation(){
		idReserv = 1;
		listeReserv = new Vector<Reservation>();
		
	}
	/**
	 * 
	 * @param demand 
	 * @param salle
	 * @param manif
	 * @param duree
	 * @param mater
	 * @return un float représentant le prix d'une reservation en fonction des paramètres passés en entré
	 */
	private static float calculPrixReserv(Demandeur demand,Salle salle,Manifestation manif, Duree duree,Materiel mater){
		
		return 42;
	}
	
	
	
	private static boolean dispoSalle(Salle s){
		for(Reservation r:listeReserv){
			if(r.getSalle().compareSalle(s)){
				return true;
			}
		}	
		return false;
	}
	
	
	/**
	 * 
	 * @param demand
	 * @param salle
	 * @param manif
	 * @param duree
	 * @param mater
	 * @return une nouvelle reservation si les différentes contraintes ont été respectées et null avec un message d'erreur sinon
	 */
	public static Reservation reserveSalle(Demandeur demand,Salle salle,Manifestation manif, Duree duree,Materiel mater){
		if(dispoSalle(salle)){
			
			Reservation reservation = new Reservation(salle,duree,mater,new Date(),idReserv,calculPrixReserv(demand,salle,manif,duree,mater));
			idReserv++;
			return reservation;
		
		}
		System.err.println("La salle demandée n'est pas disponible pour ces dates  ");
		return null;	
	}
	
	
	
	public void ConsultationReserv(int idReserv){
		for (Reservation reserv: this.listeReserv){
			if(reserv.getNoReserve()==idReserv){
				reserv.Affiche();
				break;
			}
		}
		System.out.println("Pas de reservation avec ce numéro de reservation");
		
	}
	
	public void ConsultationReserv(Demandeur d){
		for(Reservation reserv :d.getReservations()){
			reserv.Affiche();
		}
		
	}
	
	public void ConsultationReserv(Date d){
		for (Reservation reserv: this.listeReserv){
			if(reserv.getDate() == d){
				
			}
		}
	}
	
	public void ConsultationReserv(Salle s){
		for (Reservation reserv: this.listeReserv){
			if (reserv.getSalle() == s){
				reserv.Affiche();
			}
		}
	}
	
	public void AnnulationReserv(Demandeur d){
		
	}
	
	
	
	
	
}
