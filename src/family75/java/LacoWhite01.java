package family75.java;

import java.util.Scanner;

public class LacoWhite01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade,menor = 0 ,maior = 0,contIdade = 0;
	
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite uma idade: ");
		idade = leia.nextInt();
		
		while (idade != 0) {
			if(idade < 21) {
				menor++;
			}else if (idade >= 50) {
				maior++;
			}
			
		System.out.print("\nDigite uma idade: ");
		idade = leia.nextInt();
		}
		System.out.println("\nTotal de pessoas menores de 21 anos: "+menor);
		System.out.println("\nTotal de pessoas maiores de 50 anos: "+maior);
				
			}
		
	}