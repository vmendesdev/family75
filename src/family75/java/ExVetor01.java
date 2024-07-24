package family75.java;

import java.util.Scanner;

public class ExVetor01 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int[] vetor = {2,5,1,3,4,9,7,8,10,6};
	        int num, posicao; ;
	        
	        System.out.println("Digite o número que você deseja encontrar: ");
	        num = scanner.nextInt();
	        
	       posicao = -1;
	       for (int x = 0; x < vetor.length; x++) {
	           if (vetor[x] == num) {
	               posicao = x;
	               break;
	        }
	       }
	        if (posicao != -1) {
	            System.out.println("\nO número "+num+" está localizado na posição: "+posicao);
	        } else {
	            System.out.println("\nO número "+num+" não foi encontrado!");
	        }
	        
	    }
}
