package projetoJava;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Meuframe extends JFrame {
	
	public Meuframe() {
		super("Meu frame");
		

		JButton botao = new JButton("clique");
		
		getContentPane().add(botao);
		
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setSize(300, 300);
//		setVisible(true);
//		
//		
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(300, 300);
//		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Meuframe();
	}
}
