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
		
		System.out.println("\nSelecione uma das opções:\n1 - Tesouro Direto\n2 - Fundo Imobiliário\n3 - Renda Variavél\n4 - Outros");
		
		
		System.out.println();
		
		
		
		read.close();
	}

}
