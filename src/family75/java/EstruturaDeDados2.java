package family75.java;

import java.util.Scanner;
import java.util.Stack;

public class EstruturaDeDados2 {

	public class EstruturadeDados02 {
	    public static void main(String[] args) {
	        Stack<String> pilhaLivros = new Stack<>();
	        Scanner leia = new Scanner(System.in);
	        int op;

	        do {
	            System.out.println("\nMenu:");
	            System.out.println("1: Adicionar um novo livro na pilha");
	            System.out.println("2: Listar todos os livros da pilha");
	            System.out.println("3: Retirar um livro da pilha");
	            System.out.println("0: Sair do programa");
	            System.out.print("Escolha uma opção: ");
	            op = leia.nextInt();

	            switch (op) {
	                case 1:
	                    System.out.print("\nDigite o nome do livro: ");
	                    leia.nextLine();
	                    String nomeLivro = leia.nextLine();
	                    pilhaLivros.push(nomeLivro);
	                    System.out.println("\nLivro adicionado com sucesso!");
	                    break;
	                case 2:
	                    if (pilhaLivros.isEmpty()) {
	                        System.out.println("\nA pilha está vazia.");
	                    } else {
	                        System.out.println("\nLivros na pilha:");
	                        for (String livro : pilhaLivros) {
	                            System.out.println(livro);
	                        }
	                    }
	                    break;
	                case 3:
	                    if (pilhaLivros.isEmpty()) {
	                        System.out.println("\nA pilha está vazia. Não há livros para retirar.");
	                    } else {
	                        String livroRetirado = pilhaLivros.pop();
	                        System.out.println("\nLivro retirado: " + livroRetirado);
	                    }
	                    break;
	                case 0:
	                    System.out.println("\nPrograma finalizado.");
	                    break;
	                default:
	                    System.out.println("\nOpção inválida. Por favor, escolha novamente.");
	            }
	        } while (op != 0);

	        leia.close();
	        }
}
}