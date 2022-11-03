package br.receitas.program;

import java.awt.EventQueue;

import br.receitas.gui.ReceitasFrame;

public class Application {

	public static void main(String[] args) {
		EventQueue.invokeLater(() ->{ 
			
			var janelaPrincipal = new ReceitasFrame();
			janelaPrincipal.setVisible(true);
			
		});

	}

}
