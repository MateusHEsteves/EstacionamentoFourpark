package fourPark;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EstacionamentoFourParkAlternativo {

	public static void main(String[] args) {
		/*
		 * MVP 1
		 * 
		 * 1 - O que gostaria � de um cadastro que registre todas as minhas vagas
		 * dispon�veis, as ocupadas e os dados dos ve�culos em cada uma delas.
		 * 
		 * 2 - O sistema dever� fazer a entrada de cada ve�culo com os dados e
		 * informa��es deste, hor�rio de entrada e a vaga ocupada.
		 * 
		 * 3 - Ao sair o sistema dever� coletar a hor�rio de sa�da de cada carro e
		 * recolocar a vaga como dispon�vel.
		 */

		Integer tamanho = 50;
		Integer vagasOcupadas = 0;

		ClasseVaga[] estacionamento = new ClasseVaga[tamanho];
		while (true) {

			System.out.println("\n\n------------ Estacionamento FOURPARK ---------------"
					+ "\n      |     1 - Ocupar Vaga         |     " 
					+ "\n      |     2 - Desocupar Vaga      |     "
					+ "\n      |     3 - Vagas Ocupadas      |     " 
					+ "\n      |     4 - Vagas Dispon�vel    |     "
					+ "\n      |     5 - Ve�culo na Vaga     |     " 
					+ "\n      |     --------------          |     "
					+ "\n      |     0 -  S A I R            |     " 
					+ "\n       Informe a op��o desejada: ");

			Scanner sc = new Scanner(System.in);
			Integer opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:

				System.out.println("\n Qual a placa do ve�culo: \n");
				String placaVeiculo = sc.nextLine();

				for (ClasseVaga classeVaga : estacionamento) {
					if (classeVaga != null && classeVaga.getVeiculo() != null) {

						if (classeVaga.getVeiculo().getPlaca().equals(placaVeiculo)) {

							System.out.println("Essa placa j� est� em nosso p�tio.");
							break;

						}
					}

				}

				System.out.println("\n Qual o modelo do ve�culo: \n");
				String modeloVeiculo = sc.nextLine();

				System.out.println("Qual o tipo do ve�culo: \n");
				String tipoVeiculo = sc.nextLine();

				System.out.println("Qual o Telefone de contato: \n");
				String telefoneVeiculo;
				telefoneVeiculo = sc.nextLine();

				while (!telefoneVeiculo.matches("^[\\(|-|\\s]?([0-9]{2})[\\)|-|\\s]?([0-9]{3,5})[-|\\s]?([0-9]{4})$")) {

					System.err.println("N�mero informado � inv�lido, informe um novo n�mero: ");
					telefoneVeiculo = sc.nextLine();

				}

				ClasseVeiculo veiculo = new ClasseVeiculo(placaVeiculo, modeloVeiculo, tipoVeiculo, telefoneVeiculo);

				for (int posicao = 0; posicao < estacionamento.length; posicao++) {

					if (estacionamento[posicao] == null) {
						estacionamento[posicao] = new ClasseVaga(posicao, true);

					}

					if (estacionamento[posicao].getIsDisponivel()) {
						estacionamento[posicao].setVeiculo(veiculo);
						estacionamento[posicao].setIsDisponivel(false);
						estacionamento[posicao].setHorarioEntrada(new Date().toString());
						System.out.println("O ve�culo " + veiculo.getModelo() + " da placa " + veiculo.getPlaca()
								+ " Foi estacionado na vaga: " + (posicao + 1) + ".");
						break;

					} else {
						System.err.println("A vaga " + (posicao + 1) + "est� ocupada.");
					}
					if ((posicao + 1) > estacionamento.length) {
						System.out.println("Estacionamento est� lotado.");
					}
				}

				continue;

			case 2:

				System.out.println("Qual a sua placa? ");
				String placaInformada = sc.nextLine();

				for (int posicao = 0; posicao < estacionamento.length; posicao++) {

					if (estacionamento.length == (posicao + 1)) {

						System.out.println("Sua placa foi informada incorretamente ou seu ve�culo n�o est� no nosso p�tio.");
								
					}
					if (estacionamento[posicao] == null) {
						continue;
					}

					if (estacionamento[posicao].getVeiculo().getPlaca().equals(placaInformada)) {
						estacionamento[posicao].setIsDisponivel(true);
						estacionamento[posicao].setVeiculo(null);
						System.out.println("Obridado por estacionar no FourPark!" + "\n" + "Seu ve�culo est� liberado.");
	
						break;
					}

				}

				continue;

			case 3:

				for (int i = 0; i < estacionamento.length; i++) {
					ClasseVaga classeVaga = estacionamento[i];

					if (classeVaga != null) {
						if (!classeVaga.getIsDisponivel()) {

							System.out.println("A vaga " + (classeVaga.getPosicao() + 1) + " est� ocupada. ");
						}

					}

				}

				continue;

			case 4:

				for (int i = 0; i < estacionamento.length; i++) {
					ClasseVaga classeVaga = estacionamento[i];

					if (classeVaga == null) {

						System.out.println("A vaga " + (i + 1) + " est� dispon�vel.");

					} else if (classeVaga.getIsDisponivel()) {

						System.out.println("A vaga " + (classeVaga.getPosicao() + 1) + " est� dispon�vel.");
					}
				}

				continue;

			case 5:

				System.out.println("Qual a vaga que voc� quer verificar? ");
				Integer posicao = (sc.nextInt() - 1);
				sc.nextLine();

				ClasseVeiculo veiculoBuscado;

				if (estacionamento[posicao] != null) {
					if (estacionamento[posicao].getVeiculo() != null) {
						veiculoBuscado = estacionamento[posicao].getVeiculo();
						System.out.println("O ve�culo " + veiculoBuscado.getModelo() + " da placa "
								+ veiculoBuscado.getPlaca() + " est� no estacionamento. ");

						continue;
					}
				}

				System.out.println("A vaga est� vazia");

				continue;

			default:
				break;
			}

		}
	}
}
