package family75.java;

import java.util.Scanner;

public class ExMatrizes01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);
		        
		        
		        int[][] matriz = new int[3][3];
		        
		        System.out.println("\nDigite os elementos da matriz 3x3:");
		        for (int x = 0; x < 3; x++) {
		            for (int i = 0; i < 3; i++) {
		                matriz[x][i] = scanner.nextInt();
		            }
		        }
		        System.out.println("\nElementos da Diagonal Principal:");
		        for (int x = 0; x < 3; x++) {
		            System.out.print(matriz[x][x] + "\n ");
		        }
		        
		        System.out.println("\nElementos da Diagonal Secundária:");
		        for (int i = 0; i < 3; i++) {
		            System.out.print(matriz[i][2 - i] + "\n ");
		        }
		        int somaDiagonalPrincipal = 0;
		        for (int x = 0; x < 3; x++) {
		            somaDiagonalPrincipal += matriz[x][x];
		        }
		        System.out.println("\nSoma dos Elementos da Diagonal Principal: "+somaDiagonalPrincipal+"\n");
		        
		        int somaDiagonalSecundaria = 0;
		        for (int x = 0; x < 3; x++) {
		            somaDiagonalSecundaria += matriz[x][2-x];
		        }
		        System.out.println("\nSoma dos Elementos da Diagonal Secundária: " + somaDiagonalSecundaria + "\n");
		        
		        scanner.close();
		    }
		
}
