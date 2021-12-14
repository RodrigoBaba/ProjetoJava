package projeto.teste01;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("              BEM VINDO AO \n");
		
		System.out.println("          |||||JAVAINVESTE|||||");
		System.out.println("                   |||         ");
		System.out.println("                   |||         ");
		System.out.println("                   |||         ");
		System.out.println("                   |||         ");
		System.out.println("                   |||         ");
		System.out.println("                   |||         ");
		System.out.println("                   |||         ");
		System.out.println("          |||||JAVAINVESTE|||||");


		
		
						
		System.out.println("\nSimule quanto seu investimento irá render AQUI!!!");		
		System.out.println("\nCrie sua conta: ");
		System.out.print("Digite seu login: ");
		String login = read.next();
		System.out.print("Digite sua senha(apenas números): ");
		int password = read.nextInt();
		System.out.print("Confirmando senha: ");		
		int password1 = read.nextInt();
		
		while(password1 != password) {
			System.out.println("\nSenha incorreta!");
			System.out.print("Confirmando senha: ");
			password1 = read.nextInt();
		}
		
		System.out.print("\nEntre na sua conta.\nLogin: ");
		String login1 = read.next();
		System.out.print("Senha: ");
		password1 = read.nextInt();
				
			
		while(password1 != password || login.equals(login1) == false) {
			System.out.println("\nSua senha ou login está incorreto!\nTente novamente:");
			System.out.print("\nLogin: ");
			login1 = read.next();
			System.out.print("Senha: ");
			password1 = read.nextInt();
		}
		double saldo = 0.0;
		
		System.out.printf("\nSeu saldo atual: R$%.2f", saldo );
		
		System.out.println("\nGostaria de depositar ou sacar?(S/N)");
		char resp = read.next().charAt(0);
		
		while(resp == 'S' || resp == 's') {
		
			System.out.println("\nEscolha uma das opções: ");
			System.out.println("1 - Depositar\n2 - Saque");
			int resposta = read.nextInt();
		
		
			if(resposta == 1) {
				System.out.print("\nQuanto você deseja depositar: ");
				double depositar = read.nextDouble();
				saldo += depositar;
				System.out.printf("Seu saldo atualizado: R$%.2f", saldo);
			}
			else {
				System.out.println("\nQuanto você deseja sacar: ");
				double saque = read.nextDouble();
				while(saque > saldo) {
					System.out.println("\nVocê está tentando sacar um valor acima do que possui!\nTente de novo, por favor.");
					System.out.print("\nQuanto você deseja sacar: ");
					saque = read.nextDouble();
				}
				saldo -= saque;
				System.out.printf("\nSeu saldo atualizado: R$%.2f", saldo);
			}
			System.out.println("\n\nGostaria de depositar ou sacar novamente?(S/N)");
			resp = read.next().charAt(0);			
		}
		
		
		System.out.println("\nSelecione uma das opções:\n1 - Tesouro Direto\n2 - Fundo Imobiliário\n3 - Renda Variavél\n4 - Outros");
		int resposta = read.nextInt();
		
		while(resposta < 1 || resposta > 4) {
			System.out.println("Você digitou um número inválido. Tente novamente:");
			System.out.println("\nSelecione uma das opções:\n1 - Tesouro Direto\n2 - Fundo Imobiliário\n3 - Renda Variavél\n4 - Outros");
			resposta = read.nextInt();
		}
		while(resposta == 1 || resposta == 2 || resposta == 3 || resposta == 4) {
			
			if(resposta == 1) {
				
			}
			else if (resposta == 2) {
				
			}
			else if(resposta == 3) {
				
			}
			else if(resposta == 4) {
				
			}
			System.out.println("\nDeseja verificar mais alguma opção de investimento?(S/N)");
			resp = read.next().charAt(0);
			
			if(resp == 's' || resp == 'S') {
			
				System.out.println("\n\nSelecione uma das opções:\n1 - Tesouro Direto\n2 - Fundo Imobiliário\n3 - Renda Variavél\n4 - Outros");
				resposta = read.nextInt();
			
				while(resposta < 1 || resposta > 4) {
					System.out.println("Você digitou um número inválido. Tente novamente:");
					System.out.println("\nSelecione uma das opções:\n1 - Tesouro Direto\n2 - Fundo Imobiliário\n3 - Renda Variavél\n4 - Outros");
					resposta = read.nextInt();
				}
			}
			else {
				resposta = 0;
			}
		}
			
		
		System.out.println();
		
		
		
		read.close();
	}

}
