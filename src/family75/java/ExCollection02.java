package family75.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExCollection02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			numeros.add(i);
		}
		System.out.println("\nLista: ");
		for (Integer numero: numeros) {
			System.out.println(numero);
		}
		System.out.println("\nDigite o número que você deseja encontrar: ");
		int numeroDesejado = leia.nextInt();
		
		if (numeros.contains(numeroDesejado)) {
			System.out.println("\nO número "+ numeroDesejado + " foi encontrado!");
		}else {
			System.out.println("\nO número "+numeroDesejado + " não foi encontrado!");
		}
	}
}
