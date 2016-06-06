package Resolution;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class CaseChoix extends JButton implements MouseListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Case caseChoix;
	private int valeurChoix;
	private FenetreChoix fenetreChoix;
	
	public CaseChoix(Case c,int val, FenetreChoix fen) {
		this.caseChoix=c;
		this.valeurChoix=val;
		this.fenetreChoix=fen;
		this.setText(""+val);
		this.addMouseListener(this);
	}

	public Case getCaseChoix() {
		return this.caseChoix;
	}
	
	public int getValeurChoix() {
		return this.valeurChoix;
	}
	
	public FenetreChoix getFenetreChoix() {
		return this.fenetreChoix;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		this.getCaseChoix().setValeur(this.getValeurChoix());
		this.getCaseChoix().setText(""+this.caseChoix.getValeur());
		this.getFenetreChoix().dispose();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
