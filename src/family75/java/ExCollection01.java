package family75.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExCollection01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<>();
		
		System.out.println("\nDigite 5 cores: ");
		
		for (int i = 0; i < 5; i++) {
		String cor = leia.nextLine();
		cores.add (cor);
		}
		
	    System.out.println("\nListar todas as cores: ") ;
	    for (String cor : cores) {
	    System.out.println(cor);
	    }
	    
	    
	Collections.sort(cores);
	
	System.out.println("\nOrdenar as cores: ");
	for (String cor : cores) {
		System.out.println(cor);
	}
	
}
}
