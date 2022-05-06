package treinoAcademyPoo;

import java.util.Scanner;

public class treinoAcademyPoo1 {
	
	public static void main(String[] args) {
		
		Integer opcao = -1;
		Double num1 = 0.0;
		Double num2 = 0.0;
		
		Scanner entrada = new Scanner(System.in);
		
		while (opcao != 0) {
			
			System.out.print("\n\n------------ Calculadora ---------------" + "\n"
					+"\n      |     1 - Somar       |     "
					+"\n      |     2 - Subtrair    |     "
					+"\n      |     3 - Dividir     |     "
					+"\n      |     4 - Multiplicar |     "
					+"\n      |     --------------  |     "
					+"\n      |     0 -  S A I R    |     " + "\n"
					+"\n       Informe a opção desejada : ");
			
			opcao = entrada.nextInt();
			
			System.out.print("\n Informe o primeiro valor: ");
			num1 = entrada.nextDouble();
			System.out.print("\n Informe o segundo valor: ");
			num2 = entrada.nextDouble();	
			
			switch (opcao) {
			case 1:
				ClasseSoma adicao = new ClasseSoma(num1, num2);
				System.err.print("\n O resultado da adição é: " + adicao.soma());
				break;
			
			case 2:
				ClasseSubtracao diminuir = new ClasseSubtracao(num1, num2);
				System.err.println("\n O resultado da subtração é: " + diminuir.subtracao());
				
			case 3:
				ClasseDivisao dividir = new ClasseDivisao(num1, num2);
				System.err.println("\n O resultado da divisão é: " + dividir.divisao());
				
			case 4:
				ClasseMultiplicação multiplicar = new ClasseMultiplicação(num1, num2);
				System.err.println("\n O resultado da multiplicação é: " + multiplicar.multiplicacão());
					
			
			default: 
				if (opcao != 0) {
					System.out.println("\n\n Você precisa esolher uma opção válida");					
				}
				break;
			
			}
			
			System.out.println("Obrigado por utilizar a nossa calculadora");
			
			
		}	
		
		entrada.close();
	}
	
}
