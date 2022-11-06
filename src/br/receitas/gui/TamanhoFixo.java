package br.receitas.gui;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class TamanhoFixo extends PlainDocument {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -198859915960549131L;
	private int limite;
	
	TamanhoFixo(int limite){
		super();
		this.limite = limite;
		
	}
	
	
	@Override
	public void insertString(int offset, String str, AttributeSet attr)
	throws BadLocationException{
		if (str == null) return;
		
		if (getLength() + str.length() <= limite) {
			super.insertString(offset, str, attr);
		}
	}
}
