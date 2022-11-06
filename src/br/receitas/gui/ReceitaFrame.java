package br.receitas.gui;

import javax.swing.*;
import java.awt.*;
import static java.awt.Color.*;

public class ReceitaFrame extends JFrame {


	/**
	 * 
	 */
	private static final long serialVersionUID = -4613083030974126046L;
	private int num = 0;
	private Color cores[] = {
			LIGHT_GRAY, GREEN, YELLOW, MAGENTA, RED, WHITE, ORANGE, CYAN, PINK
	};
		
	private JLabel criarLabel(String texto) {
		var label = new JLabel(texto, JLabel.CENTER);
		label.setOpaque(true);
		label.setBackground(cores[num]);
		num = (num+1) % cores.length;
		return label;
	}
	
	public ReceitaFrame() {
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel topo = new JPanel();
		topo.add(criarLabel("Texto da"));
		topo.add(criarLabel("primeira"));
		topo.add(criarLabel("linha"));
		JPanel base = new JPanel();
		base.setLayout(new FlowLayout(FlowLayout.TRAILING));
		base.add(new JButton("Ok"));
		base.add(new JButton("Cancel"));
		add(topo, BorderLayout.PAGE_START);
		add(base, BorderLayout.PAGE_END);
	}

	
	public static void main(String[] args) {
		new ReceitaFrame().setVisible(true);
		
	}

}
