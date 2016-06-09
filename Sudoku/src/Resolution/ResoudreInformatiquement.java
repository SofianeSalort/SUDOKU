package Resolution;

public class ResoudreInformatiquement {
	private Sudoku susu;
	
	
	// resolution
	public void resolution(){
		int t=0;
		int i=0;
		int j=0;
		for (i=0;i<9;i++){
			for (j=0;j<9;j++){
				t = this.getSusu().getLignes().get(i).getCases().get(j).getValeur();
				if(t != 0 ){
		//			if(this.getSusu().getLignes().get(i). )
					this.getSusu().getLignes().get(i).getCases().get(j).setValeur(t+1);
					
				}
			}
					
		}
		
	// test si on peut mettre la valeur t à la case (i,j)	
	while ( t==10 ||this.getSusu().getLignes().get(i).possible(t) || this.getSusu().getColonnes().get(j).possible(t) || this.getSusu().getCarre(i, j).possible(t) ){
		t=t+1;
	}
	//si t==10 alors il faut changer la valeur d'avant #bubleUp
	if (t==10){
		this.modifier(diminuer(i,j));
	}
}
	
	
	
	private void modifier(Object diminuer) {
		
	}



	// va a la case d'avant et saute une ligne si il faut
	private Case diminuer(int i, int j) {
		int k=i;
		int l=j;

		return this.getSusu().getLignes().get(k).getCases().get(l);
	}


	// va a la case d'après et saute une ligne si il faut
	public Case augmenter(int i,int j){
		int k=i;
		int l=j;
		return this.getSusu().getLignes().get(k).getCases().get(l);
	}


	public Sudoku getSusu() {
		return susu;
	}


	public void setSusu(Sudoku susu) {
		this.susu = susu;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
