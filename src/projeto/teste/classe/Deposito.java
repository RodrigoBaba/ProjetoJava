package projeto.teste.classe;

import java.util.Scanner;

public class Deposito {

	public double saldo = 0.0;
	
	public void imprimir(){
		System.out.printf("\nSeu saldo atual: R$%.2f", saldo);
	}
	
	
	public void depositar(double deposito) {
		Scanner read = new Scanner(System.in);
		
		System.out.printf("\nConfirme seu depósito: R$%.2f", deposito);
		System.out.println("\nSe estiver correto digite(S/N): ");
		char resp = read.next().charAt(0);
		
		if(resp != 'S' && resp != 's') {
			deposito = 0.0;
			System.out.println("\nVocê não depositou!");
			System.out.println("Deseja tentar novamente?(S/N)");
			resp = read.next().charAt(0);
		}
		
		while(resp == 'S' || resp == 's') {		
			saldo += deposito;			
			System.out.printf("\nSeu saldo atual: R$%.2f", saldo);
	
			System.out.println("\n\nDeseja realizar mais algum depósito?(S/N)");
			resp = read.next().charAt(0); 
			
			if(resp == 'S' || resp == 's') {
				System.out.print("\nDigite o valor que deseja depositar: " );
				deposito = read.nextDouble();
				System.out.printf("\nConfirme seu depósito: R$%.2f", deposito);
				System.out.println("\nSe estiver certo digite(S/N): ");
				resp = read.next().charAt(0);
				if(resp != 'S' && resp != 's') {
					deposito = 0.0;
					System.out.println("\nVocê não depositou!");
					System.out.println("Deseja tentar novamente?(S/N)");
					resp = read.next().charAt(0);
				}
			}			
		}	
		
		System.out.printf("\nSeu saldo atual: R$%.2f", saldo);
		read.close();
	}
	
	
	
}
