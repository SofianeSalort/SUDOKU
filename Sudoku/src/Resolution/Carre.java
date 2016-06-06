package Resolution;

import java.util.ArrayList;

public class Carre extends Enssemble {

	
	private int numeroDeCarre;
	private ArrayList<Case> cases;
	
	
	public Carre(int numeroDeCarre) {
		super();
		this.numeroDeCarre=numeroDeCarre;
	}

	
	public ArrayList<Case> getCases() {
		return this.cases;
	}
	
	public int getNumeroDeCarre() {
		return this.numeroDeCarre;
	}

	
	public void setNumeroDeCarre(int numeroDeCarre) {
		this.numeroDeCarre = numeroDeCarre;
	}
	

}
