package family75.java;

import java.util.Scanner;

public class LacoRepeticaoFOR01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("\nDigite o primeiro número: ");
		num1 = leia.nextInt();
		System.out.printf("\nDigite o segundo número: ");
		num2 = leia.nextInt();
		
		if(num1 > num2) {
			System.out.println("\nOpção inválida!");
		}else {
			System.out.println("\nNo intervalo entre "+num1+" e "+num2);
			for (int x = num1; x <= num2; x++) {
				if (x % 3 == 0 && x % 5 == 0) {
					System.out.println(x+ "\nO número é múltiplo de 3 e 5");
				}
			}
			
		}
		
		
	}

}
