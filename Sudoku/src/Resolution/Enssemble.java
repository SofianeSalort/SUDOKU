package Resolution;

import java.util.ArrayList;

public abstract class Enssemble {
	private ArrayList<Case> cases;

	

	public Enssemble(ArrayList<Case> cases) {
		this.cases=new ArrayList<Case>(9);
	}

	public Enssemble(){
		this.cases=new ArrayList<Case>(9);
	}
	
	public ArrayList<Case> getCases() {
		return cases;
	}

	

	public void setCases(ArrayList<Case> cases) {
		this.cases = cases;
	}



	public boolean possible(int x){
		boolean bonneQuestion = true;
		for (int i = 0;i<9;i++){
			if (this.estPresent(x)){
				bonneQuestion = false;
			}
		}
		
		return bonneQuestion;
	}
	
	
	public boolean estPresent(int x) {
		boolean estIl = false;
		for (int i = 0;i<9;i++){
			if( this.getCases().get(i).getValeur() == x){
				estIl = true;
			}
		}
		return estIl;
	}
	
}
