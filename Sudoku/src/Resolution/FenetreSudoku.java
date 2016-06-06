package Resolution;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class FenetreSudoku extends JFrame{

	private static final long serialVersionUID = 1L;
	private ArrayList<Case> cases;

	public FenetreSudoku() {
		this.setVisible(true);
		//Définit un titre pour notre fenêtre
		this.setTitle("Sudoku v1.0");
		//Définit sa taille :
		this.setSize(1000, 800);
		//Nous demandons maintenant à notre objet de se positionner au centre
		this.setLocationRelativeTo(null);
		//Termine le processus lorsqu'on clique sur la croix rouge
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel label = new JLabel("<html>Veuillez remplir le SUDOKU <br> Pour cela : cliquez sur les cases que vous connaissez déjà et cliquez sur START</html>",SwingConstants.CENTER);
		label.setPreferredSize(new Dimension(100,50));
		label.setFont(new Font("serif", Font.BOLD, 20));
		JPanel cell1 = new JPanel();
		cell1.setBackground(Color.ORANGE);
		cell1.setPreferredSize(new Dimension(200, 200));
		cell1.setLayout(new GridLayout(3,3));
		JPanel cell2 = new JPanel();
		cell2.setBackground(Color.orange);
		cell2.setPreferredSize(new Dimension(200, 200));
		cell2.setLayout(new GridLayout(3,3));

		JPanel cell3 = new JPanel();
		cell3.setBackground(Color.orange);
		cell3.setPreferredSize(new Dimension(200, 200));
		cell3.setLayout(new GridLayout(3,3));

		JPanel cell4 = new JPanel();
		cell4.setBackground(Color.orange);
		cell4.setPreferredSize(new Dimension(200, 200));
		cell4.setLayout(new GridLayout(3,3));

		JPanel cell5 = new JPanel();
		cell5.setBackground(Color.orange);
		cell5.setPreferredSize(new Dimension(200, 200));
		cell5.setLayout(new GridLayout(3,3));

		JPanel cell6 = new JPanel();
		cell6.setBackground(Color.orange);
		cell6.setPreferredSize(new Dimension(200, 200));
		cell6.setLayout(new GridLayout(3,3));

		JPanel cell7 = new JPanel();
		cell7.setBackground(Color.orange);
		cell7.setPreferredSize(new Dimension(200, 200));
		cell7.setLayout(new GridLayout(3,3));

		JPanel cell8 = new JPanel();
		cell8.setBackground(Color.orange);
		cell8.setPreferredSize(new Dimension(200, 200));
		cell8.setLayout(new GridLayout(3,3));

		JPanel cell9 = new JPanel();
		cell9.setBackground(Color.orange);
		cell9.setPreferredSize(new Dimension(200, 200));
		cell9.setLayout(new GridLayout(3,3));		

		JPanel cell10 = new JPanel();
		cell10.setBackground(Color.white);
		cell10.setPreferredSize(new Dimension(100,50));
		cell10.setLayout(new BorderLayout());


		//Le conteneur du sudoku
		JPanel content = new JPanel();
		content.setPreferredSize(new Dimension(800, 800));
		content.setBackground(Color.WHITE);
		//On définit le layout manager
		content.setLayout(new GridBagLayout());

		//L'objet servant à positionner les composants
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.gridx = 0;
		gbc.gridy=0;

		gbc.gridheight=1;
		gbc.gridwidth=1;
		content.add(cell1, gbc);

		gbc.gridx = 0;
		gbc.gridy=1;

		gbc.gridheight=1;
		gbc.gridwidth=1;
		content.add(cell2, gbc);

		gbc.gridx = 0;
		gbc.gridy=2;

		gbc.gridheight=1;
		gbc.gridwidth=1;
		content.add(cell3, gbc);

		gbc.gridx = 1;
		gbc.gridy=0;

		gbc.gridheight=1;
		gbc.gridwidth=1;
		content.add(cell4, gbc);

		gbc.gridx = 1;
		gbc.gridy=1;

		gbc.gridheight=1;
		gbc.gridwidth=1;
		content.add(cell5, gbc);

		gbc.gridx = 1;
		gbc.gridy=2;

		gbc.gridheight=1;
		gbc.gridwidth=1;
		content.add(cell6, gbc);


		gbc.gridx = 2;
		gbc.gridy=0;

		gbc.gridheight=1;
		gbc.gridwidth=1;
		content.add(cell7, gbc);

		gbc.gridx = 2;
		gbc.gridy=1;

		gbc.gridheight=1;
		gbc.gridwidth=1;
		content.add(cell8, gbc);

		gbc.gridx = 2;
		gbc.gridy=2;

		gbc.gridheight=1;
		gbc.gridwidth=1;
		content.add(cell9, gbc);


		ArrayList<Case> liste = new ArrayList<Case>();

		for (int k=1;k<10;k++){
			liste.add(new Case((k-1)/3+1,(k-1)%3+1));
			cell1.add(liste.get(k-1));
		}

		for (int k=1;k<10;k++){
			liste.add(new Case((k-1)/3+1,(k-1)%3+4));

			cell4.add(liste.get(8+k));

		}


		for (int k=1;k<10;k++){
			liste.add(new Case((k-1)/3+1,(k-1)%3+7));

			cell7.add(liste.get(17+k));

		}

		for (int k=1;k<10;k++){
			liste.add(new Case((k-1)/3+4,(k-1)%3+1));

			cell2.add(liste.get(26+k));

		}

		for (int k=1;k<10;k++){
			liste.add(new Case((k-1)/3+4,(k-1)%3+4));

			cell5.add(liste.get(35+k));

		}

		for (int k=1;k<10;k++){
			liste.add(new Case((k-1)/3+4,(k-1)%3+7));

			cell8.add(liste.get(44+k));

		}

		for (int k=1;k<10;k++){
			liste.add(new Case((k-1)/3+7,(k-1)%3+1));

			cell3.add(liste.get(53+k));

		}

		for (int k=1;k<10;k++){
			liste.add(new Case((k-1)/3+7,(k-1)%3+4));

			cell6.add(liste.get(62+k));

		}

		for (int k=1;k<10;k++){
			liste.add(new Case((k-1)/3+7,(k-1)%3+7));

			cell9.add(liste.get(71+k));

		}
		
		this.cases=liste;

		JButton go = new JButton("Start");
		go.setPreferredSize(new Dimension(200,150));
		cell10.add(go,BorderLayout.EAST);
		
		//Le conteneur principal
		JPanel global = new JPanel();
		global.setPreferredSize(new Dimension(800, 800));
		global.setBackground(Color.WHITE);
		//On définit le layout manager
		global.setLayout(new BorderLayout());
		global.add(content, BorderLayout.CENTER);
		global.add(label,BorderLayout.NORTH );
		global.add(label,BorderLayout.NORTH );
		global.add(cell10,BorderLayout.SOUTH );

		this.setContentPane(global);




		//Et enfin, la rendre visible 
		this.setVisible(true);
	}
	
	public ArrayList<Case> getCases() {
		return this.cases;
	}

	public static void main(String[] args) {
		FenetreSudoku fen= new FenetreSudoku();
		Sudoku grille= new Sudoku(fen.getCases());
		
	}

}
