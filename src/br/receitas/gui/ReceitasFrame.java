package br.receitas.gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class ReceitasFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3441373748724529725L;

	public ReceitasFrame() {
		setSize(400,175);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Receitas");
		setLayout(null);
		addWindowListener( new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				
				var opcao = JOptionPane.showConfirmDialog(ReceitasFrame.this, "Tem certeza que deseja sair da aplicação?", "Confirmação",
						JOptionPane.YES_NO_OPTION);
				
				if (opcao == JOptionPane.YES_OPTION) {
					dispose();
				}
				
			}
			
			
		});
		
		
		
		
		//Rotulo
		
		var url = getClass().getResource("/imagens/receita.png");
		var icone = new ImageIcon(url);
		var lblNome = new JLabel("Digite seu nome: ", icone, JLabel.CENTER);
		lblNome.setBounds(50, 10, 300, 20);
		add(lblNome);
		 
		
		
		//Caixa de texto
		
		var txtNome = new JTextField();
		txtNome.setBounds(50, 50, 300, 30);
		add(txtNome);
		txtNome.setDocument(new TamanhoFixo(25));
		
		
		
		//Botão
		
		//setLayout(null);
		var btnCliqueAqui = new JButton("Clique Aqui!");
		btnCliqueAqui.setBounds(125, 100, 150, 30);
		add(btnCliqueAqui);
		btnCliqueAqui.addActionListener((e) -> {
			JOptionPane.showMessageDialog(
					
					this, "Olá " + txtNome.getText() + "!"
					
					);
			
			
		});
		
		
		
		
	}

}
