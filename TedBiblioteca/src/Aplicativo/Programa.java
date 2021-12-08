package Aplicativo;

import javax.swing.JOptionPane;

import entidade.biblioteca;

public class Programa {

	public static void main(String[] args) {
		
		biblioteca x = new biblioteca();
		
		JOptionPane.showMessageDialog(null, x.showPending(), "Students with pending books",JOptionPane.INFORMATION_MESSAGE);
		
	}

}
