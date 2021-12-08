package TrabanhoFaculdade;

import java.util.Scanner;

public class Moldura {
	public static void main(String[] args) {
		double tamanho, altura, AreaDoQuadro, Calcular, total;
		tamanho =  2 + 30 + 2;
		altura = 2 + 10 + 2;
		AreaDoQuadro = tamanho * altura;
		Calcular = 30 * 10;
		total = AreaDoQuadro - Calcular;
		
		System.out.println("A área modular mede "+ total);
	}

}
