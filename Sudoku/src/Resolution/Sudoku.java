package Resolution;

import java.util.ArrayList;

public class Sudoku {

	private ArrayList<Case> cases;
	private ArrayList<Ligne> lignes;
	private ArrayList<Colonne> colonnes;
	private ArrayList<Carre> carres;

	public Sudoku(ArrayList<Case> c) {
		this.cases=c;
		this.lignes= new ArrayList<Ligne>();
		this.colonnes= new ArrayList<Colonne>();
		this.carres=new ArrayList<Carre>();
		for(int k=1;k<10;k++){
			this.lignes.add(new Ligne(k));
			this.colonnes.add(new Colonne(k));
			this.carres.add(new Carre(k));
		}
		for (int k = 1; k<82;k++){
			switch(this.cases.get(k-1).getLigne()){
			case 1: System.out.println(this.lignes.get(0).getCases());
			this.lignes.get(0).getCases().add(this.cases.get(k-1));
			break;
			case 2: this.lignes.get(1).getCases().add(this.cases.get(k-1));
			break;
			case 3: this.lignes.get(2).getCases().add(this.cases.get(k-1));
			break;
			case 4: this.lignes.get(3).getCases().add(this.cases.get(k-1));
			break;
			case 5: this.lignes.get(4).getCases().add(this.cases.get(k-1));
			break;
			case 6: this.lignes.get(5).getCases().add(this.cases.get(k-1));
			break;
			case 7: this.lignes.get(6).getCases().add(this.cases.get(k-1));
			break;
			case 8: this.lignes.get(7).getCases().add(this.cases.get(k-1));
			break;
			case 9: this.lignes.get(8).getCases().add(this.cases.get(k-1));
			break;
			default : System.out.println("erreur de ligne");
			break;
			}
			
			switch(this.cases.get(k-1).getColonne()){
			case 1: this.colonnes.get(0).getCases().add(this.cases.get(k-1));
			break;
			case 2: this.colonnes.get(1).getCases().add(this.cases.get(k-1));
			break;
			case 3: this.colonnes.get(2).getCases().add(this.cases.get(k-1));
			break;
			case 4: this.colonnes.get(3).getCases().add(this.cases.get(k-1));
			break;
			case 5: this.colonnes.get(4).getCases().add(this.cases.get(k-1));
			break;
			case 6: this.colonnes.get(5).getCases().add(this.cases.get(k-1));
			break;
			case 7: this.colonnes.get(6).getCases().add(this.cases.get(k-1));
			break;
			case 8: this.colonnes.get(7).getCases().add(this.cases.get(k-1));
			break;
			case 9: this.colonnes.get(8).getCases().add(this.cases.get(k-1));
			break;
			default : System.out.println(""+this.cases.get(k-1).getColonne());
			break;

			}
			
			this.carres.get((k-1)/9).getCases().add(this.cases.get(k-1));
			
			
			}

		}





	public ArrayList<Carre> getCarres() {
		return this.carres;
	}

	public ArrayList<Colonne> getColonnes() {
		return this.colonnes;
	}

	public ArrayList<Ligne> getLignes() {
		return this.lignes;
	}

	public ArrayList<Case> getCases() {
		return this.cases;
	}
	
	
	// resolution
	public void resolution(){
		for (int i=0;i<9;i++){
			for (int j=0;j<9;j++){
				if(this.g)
			}
					
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

