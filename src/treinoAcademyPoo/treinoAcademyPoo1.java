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
					+"\n       Informe a op��o desejada : ");
			
			opcao = entrada.nextInt();
			
			System.out.print("\n Informe o primeiro valor: ");
			num1 = entrada.nextDouble();
			System.out.print("\n Informe o segundo valor: ");
			num2 = entrada.nextDouble();	
			
			switch (opcao) {
			case 1:
				ClasseSoma adicao = new ClasseSoma(num1, num2);
				System.err.print("\n O resultado da adi��o �: " + adicao.soma());
				break;
			
			case 2:
				ClasseSubtracao diminuir = new ClasseSubtracao(num1, num2);
				System.err.println("\n O resultado da subtra��o �: " + diminuir.subtracao());
				
			case 3:
				ClasseDivisao dividir = new ClasseDivisao(num1, num2);
				System.err.println("\n O resultado da divis�o �: " + dividir.divisao());
				
			case 4:
				ClasseMultiplica��o multiplicar = new ClasseMultiplica��o(num1, num2);
				System.err.println("\n O resultado da multiplica��o �: " + multiplicar.multiplicac�o());
					
			
			default: 
				if (opcao != 0) {
					System.out.println("\n\n Voc� precisa esolher uma op��o v�lida");					
				}
				break;
			
			}
			
			System.out.println("Obrigado por utilizar a nossa calculadora");
			
			
		}	
		
		entrada.close();
	}
	
}
