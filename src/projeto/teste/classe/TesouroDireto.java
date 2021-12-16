package projeto.teste.classe;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TesouroDireto {

	
	private double selic24 = 0.0;
	private double selic27 = 0.0;
	private double ipca26 = 0.0;
	private double ipca29 = 0.0;
	private double selic24Rende = 0.0;
	private double selic27Rende = 0.0;
	private double ipca26Rende = 0.0;
	private double ipca29Rende = 0.0;
	private double selic24Total = 0.0;
	private double selic27Total = 0.0;
	private double ipca26Total = 0.0;
	private double ipca29Total = 0.0;

		
	public void investimentos() {
		DecimalFormat df = new DecimalFormat("0.00");		
			
		System.out.println("Meus investimentos:");
		String conversao = df.format(selic24Total);
		String conversao2 = df.format(selic24Rende);
		System.out.println("\n-Tesouro Selic 2024: 7,75% a.a-\nTotal investido: R$" + conversao + "\nRendimento até ano 2024: R$" + conversao2);
		conversao = df.format(selic27Total);
		conversao2 = df.format(selic27Rende);
		System.out.println("\n-Tesouro Selic 2027: 10,35% a.a-\nTotal investido: R$" + conversao + "\nRendimento até ano 2027: R$" + conversao2);
		conversao = df.format(ipca26Total);
		conversao2 = df.format(ipca26Rende);
		System.out.println("\n-Tesouro IPCA+ 2026: IPCA + 5,26% (Inflação 4,55% a.a)-\nTotal investido: R$" + conversao + "\nRendimento até ano 2026: R$" + conversao2);
		conversao = df.format(ipca29Total);
		conversao2 = df.format(ipca29Rende);
		System.out.println("\n-Tesouro IPCA+ 2029: IPCA + 8,75% (Inflação 4,55% a.a)-\nTotal investido: R$" + conversao + "\nRendimento até ano 2029: R$" + conversao2);

	}
	
	public void simuladorTesouro() {
		DecimalFormat df = new DecimalFormat("0.00");
		
		

		System.out.println("     TESOURO DIRETO\nSimulador de investimento:");
		
		double calculo = (2024 - 2021) * (1000 * 0.0775);
		String teste = df.format(calculo);
		System.out.println("\n1 - Tesouro Selic 2024: 7,75% a.a - Investindo R$1000,00 seu dinheiro renderia R$" + teste + " até o ano 2024");
		
		calculo = (2027 - 2021) * (1000 * 0.0775);
		teste = df.format(calculo);
		System.out.println("2 - Tesouro Selic 2027: 7,75% a.a - Investindo R$1000,00 seu dinheiro renderia R$" + teste + " até o ano 2027");
		
		calculo = (2026 - 2021) * (1000 * (0.0455 + 0.0526));
		teste = df.format(calculo);
		System.out.println("3 - Tesouro IPCA+ 2026: IPCA + 5,26% (Inflação 4,55% a.a) - Investindo R$1000,00 seu dinheiro renderia R$" + teste + " até o ano 2026");
		
		calculo = (2029 - 2021) * (1000 * (0.0455 + 0.0875));
		teste = df.format(calculo);
		System.out.println("4 - Tesouro IPCA+ 2029: IPCA + 8,75% (Inflação 4,55% a.a) - Investindo R$1000,00 seu dinheiro renderia R$" + teste + " até o ano 2029");
	}
	
	
	public void tesouroDireto() {
		String teste, teste2;
		
		Scanner read = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");			
		
		System.out.println("\nVocê deseja investir em alguma das opções?(S/N)");
		char resp = read.next().charAt(0);		
		
		while(resp == 'S' || resp == 's') {
			double investe;
			System.out.println("\nQual opção(1 | 2 | 3 | 4): ");
			int opcao = read.nextInt();
			
			while(opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4) {
				switch(opcao) {
				case 1:
					System.out.println("\nValor mínimo de investimento R$50,00");					
					System.out.print("Quanto deseja investir: ");
					investe = read.nextDouble();
					
					if(investe < 50.00) {
						investe = 0.00;
						System.out.println("Erro!\nValor mínimo R$50,00!");
					}
					else {
					selic24Total += investe;
					selic24 = (2024 - 2021) * (investe * 0.0775);
					selic24Rende += selic24;
					teste = df.format(selic24);
					teste2 = df.format(investe);
					System.out.println("\n1 - Tesouro Selic 2024: 7,75% a.a - Investindo R$" + teste2 + " seu rendimento será de R$" + teste);
					}
					break;
				
				case 2:
					System.out.println("\nValor mínimo de investimento R$100,00");
					System.out.print("\nQuanto deseja investir: ");
					investe = read.nextDouble();
				
					if(investe < 100.00) {
						investe = 0.00;
						System.out.println("Erro!\nValor mínimo R$100,00!");

					}
					else {
					selic27Total += investe;
					selic27 = (2027 - 2021) * (investe * 0.0775);
					selic27Rende += selic27;
					teste = df.format(selic27);
					teste2 = df.format(investe);
					System.out.println("2 - Tesouro Selic 2027: 7,75% a.a - Investindo R$" + teste2 + " seu dinheiro renderia R$" + teste);
					}
					break;
			
				case 3:
					System.out.println("\nValor mínimo de investimento R$120,00");
					System.out.print("\nQuanto deseja investir: ");
					investe = read.nextDouble();
				
					if(investe < 120.00) {
						investe = 0.00;
						System.out.println("Erro!\nValor mínimo R$120,00!");

					}
					else {
					ipca26Total += investe;
					ipca26 = (2026 - 2021) * (investe * (0.0455 + 0.0526));
					ipca26Rende += ipca26;
					teste = df.format(ipca26);
					teste2 = df.format(investe);
					System.out.println("3 - Tesouro IPCA+ 2026: IPCA + 5,26% (Inflação 4,55% a.a) - Investindo R$" + teste2 + " seu dinheiro renderia R$" + teste);
					}
					break;
				
				case 4:
					System.out.println("\nValor mínimo de investimento R$200,00");
					System.out.print("\nQuanto deseja investir: ");
					investe = read.nextDouble();
					System.out.println("Erro!\nValor mínimo R$200,00!");

				
					if(investe < 200.00) {
						investe = 0.00;
					}
					else {
					ipca29Total += investe;
					ipca29 = (2029 - 2021) * (investe * (0.0455 + 0.0875));
					ipca29Rende += ipca29;
					teste = df.format(ipca29);
					teste2 = df.format(investe);
					System.out.println("4 - Tesouro IPCA+ 2029: IPCA + 8,75% (Inflação 4,55% a.a) - Investindo R$" + teste2 + " seu dinheiro renderia R$" + teste);
					}
					break;					
				}	
				
				System.out.println();
				
				
				
				System.out.println("\nDeseja realizar mais algum investimento?\nSe SIM qual opção(1 | 2 | 3 | 4)\nSe NÃO digite 0");
				opcao = read.nextInt();				
			}
			resp = 'N';
		}
		read.close();
	}
	
	
	
	
	
	
}
