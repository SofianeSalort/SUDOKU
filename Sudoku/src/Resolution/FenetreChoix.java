package Resolution;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FenetreChoix extends JFrame{
	

	private static final long serialVersionUID = 1L;
	private Case caseChoix;
	
	
	public FenetreChoix(Case c) {
		this.caseChoix=c;
		this.setTitle("ligne " +c.getLigne()+ ", colonne " + c.getColonne());
		this.setSize(300, 370);
		this.setVisible(true);
		this.setBackground(Color.pink);
		this.setLocationRelativeTo(null);
		JPanel content = new JPanel();

		JPanel cell1 = new JPanel();
		cell1.setBackground(Color.pink);
		cell1.setPreferredSize(new Dimension(300, 300));
		cell1.setLayout(new GridLayout(3,3));
		JLabel label = new JLabel("Entrez une valeur pour la case");

		label.setBackground(Color.pink);

		List<CaseChoix> liste = new ArrayList<CaseChoix>();

		for (int k=0;k<9;k++){
			liste.add(new CaseChoix(this.getCaseChoix(),k+1,this));
			cell1.add(liste.get(k));
		}

		content.setLayout(new BorderLayout());

		content.add(cell1, BorderLayout.SOUTH);
		content.add(label,BorderLayout.NORTH);
		this.setContentPane(content);
	}
	
	public Case getCaseChoix() {
		return this.caseChoix;
	}
	

}
