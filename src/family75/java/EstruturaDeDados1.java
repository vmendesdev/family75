package family75.java;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EstruturaDeDados1 {

	    public static void main(String[] args) {
	        Queue<String> filaClientes = new LinkedList<>();
	        Scanner leia = new Scanner(System.in);
	        int op;

	        do {
	            System.out.println("\nMenu:");
	            System.out.println("1: Adicionar um novo Cliente na fila");
	            System.out.println("2: Listar todos os Clientes na fila");
	            System.out.println("3: Chamar uma pessoa da fila");//retirar
	            System.out.println("0: Sair do programa");
	            System.out.print("\nEscolha uma opção: ");
	            op = leia.nextInt();

	            switch (op) {
	                case 1:
	                    System.out.print("\nDigite o nome do Cliente: ");
	                    leia.nextLine();
	                    String nomeCliente = leia.nextLine();
	                    filaClientes.add(nomeCliente);
	                    System.out.println("\nCliente adicionado com sucesso!");
	                    break;
	                case 2:
	                    if (filaClientes.isEmpty()) {
	                        System.out.println("\nA fila está vazia.");
	                    } else {
	                        System.out.println("\nClientes na fila:");
	                        for (String cliente : filaClientes) {
	                            System.out.println(cliente);
	                        }
	                    }
	                    break;
	                case 3:
	                    if (filaClientes.isEmpty()) {
	                        System.out.println("\nA fila está vazia. Não há clientes para chamar.");
	                    } else {
	                        String clienteChamado = filaClientes.poll();
	                        System.out.println("\nCliente chamado: " + clienteChamado);
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
