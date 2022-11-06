package br.receitas.program;

import java.awt.EventQueue;

import javax.swing.UIManager;

import br.receitas.gui.ReceitasFrame;

public class Application {

	public static void main(String[] args) {
		EventQueue.invokeLater(() ->{ 
			
			
			
			try {
				UIManager.setLookAndFeel(
						UIManager.getCrossPlatformLookAndFeelClassName()	
								
					);
				var janelaPrincipal = new ReceitasFrame();
				janelaPrincipal.setVisible(true);
				
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}	
				
			
		});

	}

}
