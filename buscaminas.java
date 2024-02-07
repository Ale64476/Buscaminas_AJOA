package tarea3;

import java.awt.*;
import javax.swing.*;

public class buscaminas {
	public buscaminas() {
		JFrame frame = new JFrame("BUSCAMINAS");
		frame.setSize(500,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);		
		frame.setVisible(true);	
		
		
		JPanel panel = new JPanel();



		panel.setLayout(new BorderLayout());
		frame.add(panel);
		
		JPanel panel2 = new JPanel();
//		panel2.setBackground(Color.blue);
		panel2.setLayout(new GridBagLayout());
		
		
		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(5,5,5,5);
		//c.weightx = 0.5;
		
		
		JLabel nombre = new JLabel("Nombre del jugador: ");
		//c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		panel2.add(nombre, c);
		JLabel minas = new JLabel("Numero de minas: ");
		//c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		panel2.add(minas, c);

		JTextField cuadrito = new JTextField(5);
		//c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 0;
		panel2.add(cuadrito, c);
		
		JTextField cuadrito2  = new JTextField(5);
	//	c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 1;
		panel2.add(cuadrito2, c);
		
		JButton empezar = new JButton("Empezar");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 1;
		panel2.add(empezar,c);
		panel.add(panel2, BorderLayout.NORTH);
		
		
		JLabel score = new JLabel("Score: 64476");
		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout(FlowLayout.RIGHT));
		panel3.add(score);
		panel.add(panel3, BorderLayout.SOUTH);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new GridLayout(4,4));
		panel.add(panel4, BorderLayout.CENTER);
		
		for(int i=0;i<12;i++) {
			JButton boton = new JButton("Mina" + i);
			panel4.add(boton);
			
		}
		
		JPanel panel5 = new JPanel();
		JPanel panel6 = new JPanel();
		panel.add(panel5, BorderLayout.EAST);
		panel.add(panel6, BorderLayout.WEST);
	}
}
