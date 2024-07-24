package family75.java;

import java.util.Scanner;

public class LacoDoWhile01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int num,somaPositivos = 0;

	Scanner leia = new Scanner(System.in);

	do {
		System.out.println("\nDigite um número: ");
		num = leia.nextInt();
		if (num > 0) {
		somaPositivos += num;
	}
		
	} while(num != 0);
	System.out.println("\nA soma dos números positivos é: "+ somaPositivos);
	       
	}
}
