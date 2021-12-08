package aplicacao;

import entidade.ContaB;

import javax.swing.JOptionPane;


public class Teste {
	
	public static void main(String[]args){
		
		ContaB conta = new ContaB();
		
		
		conta.addnovaconta("Evandro", 96325, 4.440);
		conta.addnovaconta("Débora", 74158, 2.110);
		conta.addnovaconta("Matheus", 86425, 3.030);
		conta.addnovaconta("Caio", 91248, 1.300);
		conta.addnovaconta("Vamberto", 94531, 1.990);
		
		JOptionPane.showMessageDialog(null, conta.maiorsaldo());
				
	
	}

}
