package Resolution;

import java.util.ArrayList;

public class Ligne {

	private int numeroDeLigne;
	private ArrayList<Case> cases;

	public Ligne(int numerodeligne) {
		this.numeroDeLigne=numerodeligne;
		this.cases=new ArrayList<Case>(9);
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


