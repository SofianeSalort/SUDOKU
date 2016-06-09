package Resolution;

import java.util.ArrayList;

public class Ligne extends Enssemble {

	private int numeroDeLigne;
	private ArrayList<Case> cases;

	public Ligne(int numerodeligne) {
		super();
		this.numeroDeLigne=numerodeligne;
	}


	public ArrayList<Case> getCases() {
		return this.cases;
	}

	public int getNumeroDeLigne() {
		return this.numeroDeLigne;
	}


	public void setNumeroDeLigne(int numeroDeLigne) {
		this.numeroDeLigne = numeroDeLigne;
	}
	
	
	
	
	
}


