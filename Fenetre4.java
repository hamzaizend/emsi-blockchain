import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



public class Fenetre4 extends JFrame implements ActionListener, MouseListener{

	private JMenuItem rouge, vert , bleu;
	private JMenuItem hauteur, largeur;
	private JMenuBar menu = new JMenuBar();
	private JPanel pan = new JPanel();
	private JLabel t1 = new JLabel();
	
	public Fenetre4() {
		setTitle("Menu particulier");
		setSize(400,190);
		setDefaultCloseOperation(3);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
		setJMenuBar(menu);
		
		JMenu couleurs = new JMenu("Couleurs");
		couleurs.setMnemonic('C');
		menu.add(couleurs);
		
		rouge = new JMenuItem("Rouge");
		rouge.setMnemonic('R');
		rouge.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,InputEvent.CTRL_MASK));
		rouge.addActionListener(this);
		couleurs.add(rouge);
		
		vert = new JMenuItem("Vert");
		vert.setMnemonic('V');
		vert.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,InputEvent.CTRL_MASK));
		vert.addActionListener(this);
		couleurs.add(vert);
		
		bleu = new JMenuItem("Bleu");
		bleu.setMnemonic('B');
		bleu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,InputEvent.CTRL_MASK));
		bleu.addActionListener(this);
		couleurs.add(bleu);
		
		menu.add(couleurs);
		
		JMenu dimensions = new JMenu("Dimensions");
		dimensions.setMnemonic('D');
		
		hauteur = new JMenuItem("Hauteur");
		hauteur.setMnemonic('H');
		hauteur.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,InputEvent.CTRL_MASK));
		hauteur.addActionListener(this);
		hauteur.addMouseListener(this);
		
		largeur = new JMenuItem("Largeur");
		largeur.setMnemonic('L');
		largeur.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,InputEvent.CTRL_MASK));
		largeur.addActionListener(this);
		largeur.addMouseListener(this);
		
		dimensions.add(hauteur);
		dimensions.add(largeur);
		
		menu.add(dimensions);
		
		setContentPane(pan);
		
		
		
		
		
	}
	public static void main(String[] args) {
		new Fenetre4();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == rouge) {
			pan.setBackground(Color.red);
		}
		if(e.getSource() == vert) {
			pan.setBackground(Color.green);
		}
		if(e.getSource() == bleu) {
			pan.setBackground(Color.blue);
		}
		if(e.getSource() == hauteur) {
			
			this.setSize(400, 300);
		}
		if(e.getSource() == largeur) {
			this.setSize(600, 190);
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
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
	@Override
	public void mouseEntered(MouseEvent e) {
		if(e.getSource() == hauteur) {
			hauteur.setToolTipText(" Ceci permet d'augmenter l'hauteur ");
		}
		if(e.getSource() == largeur) {
			largeur.setToolTipText(" Ceci permet d'élargir le fenetre ");
		}
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	

}