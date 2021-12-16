package projeto.teste.classe;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RendaFixa {

	
	private double bmg = 0.0;
	private double master = 0.0;
	private double abc = 0.0;
	private double modal = 0.0;
	private double bmgRende = 0.0;
	private double masterRende = 0.0;
	private double abcRende = 0.0;
	private double modalRende = 0.0;
	private double bmgTotal = 0.0;
	private double masterTotal = 0.0;
	private double abcTotal = 0.0;
	private double modalTotal = 0.0;
	
	
	
	public void investimentos() {
		DecimalFormat df = new DecimalFormat("0.00");		
			
		System.out.println("\nMeus investimentos:");
		String conversao = df.format(bmgTotal);
		String conversao2 = df.format(bmgRende);
		System.out.println("\n-CDB BMG 2023: 11,55% a.a-\nTotal investido: R$" + conversao + "\nRendimento até ano 2023: R$" + conversao2);
		conversao = df.format(masterTotal);
		conversao2 = df.format(masterRende);
		System.out.println("\n-CDB BANCO MASTER S/A 2026: 13,10% a.a-\nTotal investido: R$" + conversao + "\nRendimento até ano 2026: R$" + conversao2);
		conversao = df.format(abcTotal);
		conversao2 = df.format(abcRende);
		System.out.println("\n-CDB BANCO ABC 2022: 11,65% a.a-\nTotal investido: R$" + conversao + "\nRendimento até ano 2022: R$" + conversao2);
		conversao = df.format(modalTotal);
		conversao2 = df.format(modalRende);
		System.out.println("\n-CDB Modal 2024: 11,65% a.a-\nTotal investido: R$" + conversao + "\nRendimento até ano 2024: R$" + conversao2);

	}
	
	public void simuladorRendaFixa() {
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("\n       RENDA FIXA\nSimulador de investimento:");
		
		double calculo = (2023 - 2021) * (1000 * 0.1155);// valor minimo 1.000
		String teste = df.format(calculo);
		System.out.println("\n1 - CDB BMG 2023: 11,55% a.a - Investindo R$1000,00 seu dinheiro renderia R$" + teste + " até o ano 2023");
		
		calculo = (2026 - 2021) * (1000 * 0.1310); // valor minimo 1.000
		teste = df.format(calculo);
		System.out.println("2 - CDB BANCO MASTER S/A 2026: 13,10% a.a - Investindo R$1000,00 seu dinheiro renderia R$" + teste + " até o ano 2026");
		
		calculo = (2022 - 2021) * (10000 * 0.1165); // valor minimo 10.000
		teste = df.format(calculo);
		System.out.println("3 - CDB BANCO ABC 2022: 11,65% a.a - Investindo R$10000,00 seu dinheiro renderia R$" + teste + " até o ano 2022");
		
		calculo = (2024 - 2021) * (1000 *  0.1165); // valor minimo 1.000
		teste = df.format(calculo);
		System.out.println("4 - CDB Modal 2024: 11,65% a.a - Investindo R$1000,00 seu dinheiro renderia R$" + teste + " até o ano 2024");
	}
	
	public void rendaFixa() {
		
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
					System.out.println("\nValor mínimo de investimento R$1000,00");					
					System.out.print("Quanto deseja investir: ");
					investe = read.nextDouble();
					
					if(investe < 1000.00) {
						investe = 0.00;
						System.out.println("Erro!\nValor mínimo R$1000,00!");
					}
					else {
					bmgTotal += investe;
					bmg = (2023 - 2021) * (investe * 0.1155);
					bmgRende += bmg;
					teste = df.format(bmg);
					teste2 = df.format(investe);
					System.out.println("\n1 - CDB BMG 2023: 11,55% a.a - Investindo R$" + teste2 + " seu rendimento será de R$" + teste);
					}
					break;
				
				case 2:
					System.out.println("\nValor mínimo de investimento R$1000,00");
					System.out.print("\nQuanto deseja investir: ");
					investe = read.nextDouble();
				
					if(investe < 1000.00) {
						investe = 0.00;
						System.out.println("Erro!\nValor mínimo R$1000,00!");

					}
					else {
					masterTotal += investe;
					master = (2026 - 2021) * (investe * 0.1310);
					masterRende += master;
					teste = df.format(master);
					teste2 = df.format(investe);
					System.out.println("2 - CDB BANCO MASTER S/A 2026: 13,10% a.a - Investindo R$" + teste2 + " seu dinheiro renderia R$" + teste);
					}
					break;
			
				case 3:
					System.out.println("\nValor mínimo de investimento R$10.000,00");
					System.out.print("\nQuanto deseja investir: ");
					investe = read.nextDouble();
				
					if(investe < 10000.00) {
						investe = 0.00;
						System.out.println("Erro!\nValor mínimo R$10.000,00!");

					}
					else {
					abcTotal += investe;
					abc = (2022 - 2021) * (investe * 0.1165);
					abcRende += abc;
					teste = df.format(abc);
					teste2 = df.format(investe);
					System.out.println("3 - CDB BANCO ABC 2022: 11,65% a.a - Investindo R$" + teste2 + " seu dinheiro renderia R$" + teste);
					}
					break;
				
				case 4:
					System.out.println("\nValor mínimo de investimento R$1000,00");
					System.out.print("\nQuanto deseja investir: ");
					investe = read.nextDouble();
					System.out.println("Erro!\nValor mínimo R$1000,00!");

				
					if(investe < 1000.00) {
						investe = 0.00;
					}
					else {
					modalTotal += investe;
					modal = (2024 - 2021) * (investe * 0.1165);
					modalRende += modal;
					teste = df.format(modal);
					teste2 = df.format(investe);
					System.out.println("4 - CDB Modal 2024: 11,65% a.a - Investindo R$" + teste2 + " seu dinheiro renderia R$" + teste);
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
