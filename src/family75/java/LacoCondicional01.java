package family75.java;

import java.util.Scanner;

public class LacoCondicional01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Float a, b, c,resultado;
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\nDigite o número A: ");
		a = leia.nextFloat();
		System.out.println("\nDigite o número B: ");
		b = leia.nextFloat();
		System.out.println("\nDigite o número C: ");
		c = leia.nextFloat();
		
		resultado = a + b;
		
		if (resultado>c){
			System.out.println("\nA soma de A + B é maior do que C");
		} else if (resultado < c){
		   System.out.println("\nA soma de A + B é menor do que C");
		} else if (a + b == c ) {
		System.out.println("\nA soma de A + B é igual a C");
	
		}
	}
}
