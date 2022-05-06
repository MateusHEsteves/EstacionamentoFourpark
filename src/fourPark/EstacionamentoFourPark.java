package fourPark;

import java.util.Iterator;

public class EstacionamentoFourPark {

	public static void main(String[] args) {
		
	ClasseVaga[] vagas = new ClasseVaga[50];
	
	for (int i = 50; i <= vagas.length; i--) {
		
		ClasseVaga vaga = new ClasseVaga();
		
		if(ClasseVaga.getPosicao()%4==0) {
			ClasseVaga.setIsDisponivel(false);
			
		}
		
		vagas[i-1] = vagas1;
	} 
	
	
	do {
		System.out.println("\n\n------------ Estacionamento FOURPARK ---------------" + "\n"
				+"\n      |     1 - Ocupar Vaga         |     "
				+"\n      |     2 - Desocupar Vaga      |     "
				+"\n      |     3 - Vagas Ocupadas      |     "
				+"\n      |     4 - Vagas Desocupadas   |     "
				+"\n      |     --------------          |     "
				+"\n      |     0 -  S A I R            |     " + "\n"
				+"\n       Informe a opção desejada : ");

	}while (condition);
	
		

	}

}
