package Resolution;

public class ResoudreInformatiquement {
	private Sudoku susu;
	
	
	// resolution
	public void resolution(){
		for (int i=0;i<9;i++){
			for (int j=0;j<9;j++){
				int t = this.getSusu().getLignes().get(i).getCases().get(j).getValeur();
				if(t != 0 ){
					if(this.getSusu().getLignes().get(i). )
					this.getSusu().getLignes().get(i).getCases().get(j).setValeur(t+1);

				}
			}
					
		}
	while (this.getSusu().getLignes().get(i).possible(t) || this.getSusu().getColonnes().get(j).g )
}
	
	public void augmenter(int i,int j){
		int t =this.getSusu().getLignes().get(i).getCases().get(j).getValeur();
		if (t<9){
			this.getSusu().getLignes().get(i).getCases().get(j).setValeur(t+1);
		}
		else {
			this.getSusu().getLignes().get(i).getCases().get(j).setValeur(0);
		}
	}


	public Sudoku getSusu() {
		return susu;
	}


	public void setSusu(Sudoku susu) {
		this.susu = susu;
	}

	
}