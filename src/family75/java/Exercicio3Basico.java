package family75.java;

import java.util.Scanner;

public class Exercicio3Basico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float SalarioBruto,AdcionalNoturno,HorasExtras,Descontos,SalarioLiquido;

		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o valor do salário bruto: ");
		SalarioBruto = leia.nextFloat();
		System.out.println("\nDigite o valor do adcional noturno: ");
		AdcionalNoturno = leia.nextFloat ();
		System.out.println("\nDigite o valor das horas extras: ");
		HorasExtras = leia.nextFloat ();
		System.out.println("\nDigite o valor dos descontos: ");
		Descontos = leia.nextFloat ();
		
		SalarioLiquido = SalarioBruto + AdcionalNoturno + (HorasExtras *5) - Descontos; 
				
		System.out.printf("\nO salário liquido é: %.2f ",SalarioLiquido);		
		
		leia.close ();
		
	}

}
