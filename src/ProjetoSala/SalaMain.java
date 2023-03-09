package ProjetoSala;

import java.util.Scanner;

public class SalaMain {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner (System.in)) {
			Sala vet [] = new Sala [5];
			vet [0] = new Sala (1,20,true);
			vet [1] = new Sala (2,30,true);
			vet [2] = new Sala (3,40,true);
			vet [3] = new Sala (4,50,true);
			vet [4] = new Sala (5,60,true);
			
			System.out.println("1 - lista de Salas");
			System.out.println("Digite a opção para listas de salas: ");
			
			int opcao = scan.nextInt();
			
			while (opcao !=0)
				if (opcao == 1) {
					for(int i = 0; i < vet.length;i++) {
						System.out.println(vet[i].getDescricao());
					}
					
					
					System.out.println("\n2 - Ocupar:");
					System.out.println("3 - Desocupar");
					System.out.println("4 - Sair");
					System.out.println("Escolher uma das Opçôes:");
					
					int select  = scan.nextInt();
					
					if (select == 2) {
						
						System.out.println("Escolha a sala:");
						select = scan.nextInt();
						vet[select].ocupado();
					}
					
					if (select == 3) {
						System.out.println("Escolha a sala:");
						select = scan.nextInt();
						vet[select].desocupado();
					}
					
					
					if (select == 4 ) {
						
						System.out.println("Saiu das salas");
						select  = scan.nextInt();
					}
							
			}
			
		}}}

