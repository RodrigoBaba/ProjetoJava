package projeto.teste.classe;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);

		Deposito teste = new Deposito();
		
		System.out.println("Deseja realizar um depósito?(S/N)");
		char resp = read.next().charAt(0);
		
		if(resp == 'S' || resp == 's') {
			System.out.print("Digite o valor para o depósito: ");
			double valor = read.nextDouble();
			teste.depositar(valor);
		}
		read.close();
	}

}
