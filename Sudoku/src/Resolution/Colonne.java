package Resolution;

import java.util.ArrayList;

public class Colonne extends Ensemble {

	
	private int numeroDeColonne;	
	
	public Colonne(int numeroDeColonne) {
		super();
		this.numeroDeColonne=numeroDeColonne;
	}
	

	public int getNumeroDeColonne() {
		return this.numeroDeColonne;
	}

	
	public void setNumeroDeColonne(int numeroDeColonne) {
		this.numeroDeColonne = numeroDeColonne;
	}
	
	
	
}
