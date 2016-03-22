import java.awt.*;
import javax.swing.*;

/* Vous pouvez changer le nom de la classe par  InterGraph  
 *  pour correspondre au nom demandé dans l'exo
 */

public class exo1Examen_6_4_15 extends JFrame {
	JMenuBar menu;
	JMenu Edition,Fichier;
	JMenuItem e,o,c,a;
	JButton b ;
	JTextField t;
	JCheckBox r;
	JPanel p1,p2,p3;
	
	public exo1Examen_6_4_15(){
		menu = new JMenuBar();
		Edition = new JMenu("Edition");
		Fichier = new JMenu("Fichier");
		e = new JMenuItem("Enregistrer");
		o = new JMenuItem("Ouvrir");
		Fichier.add(e);Fichier.add(o);
		c = new JMenuItem("Copier");
		a = new JMenuItem("Annuler");
		Edition.add(c);Edition.add(a);
		
		menu.add(Edition);menu.add(Fichier);
		setJMenuBar(menu);
		
		b = new JButton("Mon bouton");
		t = new JTextField("Bonjour",12);
		r = new JCheckBox("Case cocher");
		
		p1 = new JPanel();p2 = new JPanel();p3 = new JPanel();
		
		Container c = getContentPane();
		p1.add(b);
		p2.add(t);
		p3.add(r);
		
		c.add(p1, BorderLayout.NORTH);
		c.add(p2, BorderLayout.CENTER);
		c.add(p3, BorderLayout.SOUTH);
		
		
		setVisible(true);
		setSize(200,170);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
	}
	
	public static void main(String[] args) {
		exo1Examen_6_4_15 fen = new exo1Examen_6_4_15();
	}

}