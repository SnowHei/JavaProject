package empresa;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Cofre cofrinho = new Cofre();
		
		System.out.printf("Bem vindo ao cofre de moedas%n");
		
		while(true) {
		// menu de escolha
			try {
				System.out.printf("Escolha a opção que deseja: %n"
						+ "1 - Adicionar moedas %n"
						+ "2 - Remover moedas %n"
						+ "3 - Listar moedas %n"
						+ "4 - Converter dinheiro para reais %n"
						+ "0 - Encerrar %n");
			
				int escolha = teclado.nextInt();
				
				if(escolha == 1) {
					// moedas escolhidas para o projeto
					System.out.printf("%nQual moeda deseja? %n"
							+ "1 - Dolar %n"
							+ "2 - Euro %n"
							+ "3 - Real %n");
					int tipoDeMoeda = teclado.nextInt();
					
					System.out.printf("%nQuantas moedas deseja adicionar?%n");
					double adicionarMoeda = teclado.nextDouble();
					
					cofrinho.adicionarMoedas(tipoDeMoeda, adicionarMoeda);
					
				} else if(escolha == 2) {
					// escolha da moeda que deseja remover
					System.out.printf("%nQual moeda você deseja usar? %n"
							+ "1 - Dolar %n"
							+ "2 - Euro %n"
							+ "3 - Real %n");
					int tipoDeMoeda = teclado.nextInt();
					
					System.out.printf("%nQuantas moedas deseja remover?%n");
					double removerMoeda = teclado.nextDouble();
					
					cofrinho.removerMoedas(tipoDeMoeda, removerMoeda);
					
				} else if(escolha == 3) { 
					// mostra a lista de moedas existentes no programa
					System.out.println(); 
					cofrinho.listaMoedas();
					
				} else if(escolha == 4) { 
					// conversao das moedas para real
					System.out.println(); 
					cofrinho.totalConversao();
					
				} else if(escolha == 0) { 
					// encerra o programa
					break;
					
				} else {
					
					System.out.println("Opção inválida");
				}
				
				
			} catch(InputMismatchException e) {
				System.out.printf("%nUse vírgula!%n");// caso seja utilizado o ponto ao invés de virgula, esse comando aparece
				break; 
			}
		}
		
		teclado.close();
		System.out.println(); 
		System.out.println("Programa finalizado");
	}

}