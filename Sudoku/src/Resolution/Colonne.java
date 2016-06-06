package Resolution;

import java.util.ArrayList;

public class Colonne {

	
	private int numeroDeColonne;
	private ArrayList<Case> cases;
	
	public Colonne(int numerodeColonne) {
		this.numeroDeColonne=numerodeColonne;
		this.cases=new ArrayList<Case>(9);
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
