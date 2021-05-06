package TrabanhoFaculdade;

import java.util.Scanner;

public class Ted_01 {
public static void main(String[] args) {
		
		System.out.println("Quanto voçê ganha por hora de Trabalho? ");
		Scanner GanhaHora = new Scanner(System.in);
		
		System.out.println("Quantas horas coçê Trabalha por mês? ");
		Scanner HorasTrabalhadas = new Scanner(System.in);
		
		int SalBruto = GanhaHora.nextInt() * HorasTrabalhadas.nextInt();
		
		float IPRF = SalBruto * 0.11f;
		float INSS = SalBruto * 0.08f;
		float SIND = SalBruto * 0.05f;
		
		float SalLiquido = SalBruto - IPRF - INSS - SIND;
		float ValDescontado = IPRF + INSS + SIND;
		
		System.out.println("Salario Bruto: "+SalBruto);
		System.out.println("IPRF: "+ IPRF);
		System.out.println("INSS: "+ INSS);
		System.out.println("SIND: "+ SIND);
		System.out.println("Salario Liquido: "+ SalLiquido);
		System.out.println("Valor Descontado: "+ ValDescontado);
		}

}
