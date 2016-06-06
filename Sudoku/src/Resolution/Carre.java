package Resolution;

import java.util.ArrayList;

public class Carre {

	
	private int numeroDeCarre;
	private ArrayList<Case> cases;
	
	public Carre(int numerodeCarre) {
		this.numeroDeCarre=numerodeCarre;
		this.cases=new ArrayList<Case>(9);
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
