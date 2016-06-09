package Resolution;

import java.util.ArrayList;

public abstract class Ensemble {
	private ArrayList<Case> cases;

	

	public Ensemble(ArrayList<Case> cases) {
		this.cases=new ArrayList<Case>(9);
	}

	public Ensemble(){
		this.cases=new ArrayList<Case>(9);
	}
	
	public ArrayList<Case> getCases() {
		return this.cases;
	}

	

	public void setCases(ArrayList<Case> cases) {
		this.cases = cases;
	}


	// check si c'est possible de mettre le numéro x à l'endroit en question
	public boolean possible(int x){
		boolean bonneQuestion = true;
		if (this.estPresent(x)){
			bonneQuestion = false;
		}
		return bonneQuestion;
	}
	
	
	// check si il y a déjà la valeur de x dans le carré/colonne/ligne
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
