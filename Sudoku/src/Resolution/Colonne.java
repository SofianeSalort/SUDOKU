package Resolution;

import java.util.ArrayList;

public class Colonne extends Enssemble {

	
	private int numeroDeColonne;
	private ArrayList<Case> cases;
	
	
	public Colonne(int numeroDeColonne) {
		super();
		this.numeroDeColonne=numeroDeColonne;
	}
	
	
	public ArrayList<Case> getCases() {
		return this.cases;
	}
	
	public int getNumeroDeColonne() {
		return this.numeroDeColonne;
	}

	
	public void setNumeroDeColonne(int numeroDeColonne) {
		this.numeroDeColonne = numeroDeColonne;
	}
	
	
	
}
