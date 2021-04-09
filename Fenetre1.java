import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Fenetre1 extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JMenuItem Rouge , Vert , Bleu ,hauteur , largeur;
	private JPanel pan = new JPanel();
	private JMenuBar Menu = new JMenuBar();
	
	public Fenetre1() {
		setTitle("Menu");
		setSize(400,200);
		setDefaultCloseOperation(3);
		setLocationRelativeTo(null);
		setJMenuBar(Menu);
		setVisible(true);
		setContentPane(pan);
		
		
	
		 
		 JMenu couleurs = new JMenu("couleurs");
		 Rouge = new JMenuItem("Rouge");
		 Vert = new JMenuItem("Vert");
		 Bleu = new JMenuItem("Bleu");
		 
		 couleurs.addActionListener(this);
		 
		 couleurs.add(Rouge);
		 couleurs.add(Vert);
		 couleurs.add(Bleu);
		 
		 Rouge.addActionListener(this);
		 Vert.addActionListener(this);
		 Bleu.addActionListener(this);
		 
		 JMenu dimensions = new JMenu("Dimensions");
		hauteur = new JMenuItem("hauteur");
		largeur = new JMenuItem("largeur");
		
		hauteur.addActionListener(this);
		largeur.addActionListener(this);
		
		 
		 dimensions.add(hauteur);
		 dimensions.add(largeur);
		 
		 
		 Menu.add(couleurs);
		 Menu.add(dimensions);
	 

	}
	public static void main(String[] args) {
		new Fenetre1();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Rouge) {
			pan.setBackground(Color.red);
		}
		if(e.getSource() == Vert) {
			pan.setBackground(Color.green);
		}
		if(e.getSource() == Bleu) {
			pan.setBackground(Color.blue);
		}
		if(e.getSource() == hauteur) {
			setSize(400,300);
		}
		if(e.getSource() == largeur) {
			setSize(500,200);
		}
	}

}
