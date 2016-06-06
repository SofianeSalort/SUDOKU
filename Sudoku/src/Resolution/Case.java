package Resolution;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class Case extends JButton implements ActionListener,MouseListener {


	private static final long serialVersionUID = 1L;
	private int valeur;
	private int colonne;
	private int ligne;

	public Case(int ligne,int colonne) {
		this.ligne=ligne;
		this.colonne=colonne;
		this.addMouseListener(this);
	}



	public int getColonne() {
		return this.colonne;
	}

	public int getLigne() {
		return this.ligne;
	}

	public int getValeur() {
		return this.valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	



	public void mouseClicked(MouseEvent arg0) {
		FenetreChoix fenetre = new FenetreChoix(this);
	}




	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}




	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}




	@Override
	public void mousePressed(MouseEvent arg0) {


	}




	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}



	public void actionPerformed(ActionEvent arg0) {
		}




}
