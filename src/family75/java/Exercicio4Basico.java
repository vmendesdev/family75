package family75.java;

import java.util.Scanner;

public class Exercicio4Basico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		float n1,n2,n3,n4,diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a primeira nota: ");
		n1 = leia.nextFloat ();
		System.out.println("\nEntre com a segunda nota: ");
		n2 = leia.nextFloat ();
		System.out.println("\nEntre com a terceira nota: ");
		n3 = leia.nextFloat ();
		System.out.println("\nEntre com a quarta nota: ");
		n4 = leia.nextFloat ();
		
		diferenca = (n1 * n2) - (n3 * n4);
		System.out.printf("\nA média final é: %.1f",diferenca);
				
		
		leia.close ();
		
		
		
	}

}
