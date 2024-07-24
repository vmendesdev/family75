package family75.java;

import java.util.Scanner;

public class Exercicio1Basico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Float salario, abono, novosalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o salário: ");
		salario = leia.nextFloat();
		System.out.println("\nDigite o Abono: ");
		abono = leia.nextFloat();
		
		novosalario = salario + abono;
		
		System.out.println("\nO novo salário é: "+novosalario);
		
		leia.close ();
		
	}

}
