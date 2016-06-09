package Resolution;


public class Carre extends Ensemble {

	
	private int numeroDeCarre;	
	
	public Carre(int numeroDeCarre) {
		super();
		this.numeroDeCarre=numeroDeCarre;
	}

	

	public int getNumeroDeCarre() {
		return this.numeroDeCarre;
	}

	
	public void setNumeroDeCarre(int numeroDeCarre) {
		this.numeroDeCarre = numeroDeCarre;
	}
	
	public Case getCase(int i, int j){
		int k = i%3;
		int l = j%3;
		return this.getCases().get(3*k + l);
	}
	

}
