package fourPark;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*MVP 2

O sistema deverá estar apto a receber um valor/hora e deverá ser capaz de calcular o valor a pagar de cada veículo na saída.
O sistema deverá exibir uma listagem de histórico de cada veículo que passou pelo estacionamento com horário de entrada e saída do mesmo.
O sistema deverá calcular o valor recebido durante todo o dia. */

public class EstacionamentoFourParkAlternativo {

	public static void main(String[] args) {

		Integer tamanho = 50;
		Double valorHora = 10.0;

		ClasseVaga[] estacionamento = new ClasseVaga[tamanho];
		while (true) {

			System.out.println("\n\n------------ Estacionamento FOURPARK ---------------"
					+ "\n      |     1 - Ocupar Vaga         |     " 
					+ "\n      |     2 - Desocupar Vaga      |     "
					+ "\n      |     3 - Vagas Ocupadas      |     " 
					+ "\n      |     4 - Vagas Disponível    |     "
					+ "\n      |     5 - Veículo na Vaga     |     " 
					+ "\n      |     6 - Histórico da Vaga   |     " 
					+ "\n      |-----------------------------|     "
					+ "\n      |     0 -  S A I R            |     " 
					+ "\n       Informe a opção desejada: ");

			Scanner sc = new Scanner(System.in);
			Integer opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:

				System.out.println("\n Qual a placa do veículo: \n");
				String placaVeiculo = sc.nextLine();

				for (ClasseVaga classeVaga : estacionamento) {
					if (classeVaga != null && classeVaga.getVeiculo() != null) {

						if (classeVaga.getVeiculo().getPlaca().equals(placaVeiculo)) {

							System.out.println("Essa placa já está em nosso pátio.");
							break;

						}
					}

				}

				System.out.println("\n Qual o modelo do veículo: \n");
				String modeloVeiculo = sc.nextLine();

				System.out.println("Qual o tipo do veículo: \n");
				String tipoVeiculo = sc.nextLine();

				System.out.println("Qual o Telefone de contato: \n");
				String telefoneVeiculo;
				telefoneVeiculo = sc.nextLine();

				while (!telefoneVeiculo.matches("^[\\(|-|\\s]?([0-9]{2})[\\)|-|\\s]?([0-9]{3,5})[-|\\s]?([0-9]{4})$")) {

					System.err.println("Número informado é inválido, informe um novo número: ");
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
						estacionamento[posicao].setHorarioEntrada(new Date());
						System.out.println("O veículo " + veiculo.getModelo() + " da placa " + veiculo.getPlaca()
								+ " Foi estacionado na vaga: " + (posicao + 1) + " "
								+ estacionamento[posicao].getHorarioEntrada() + ".");
						break;

					} else {
						System.err.println("A vaga " + (posicao + 1) + " está ocupada.");
					}
					if ((posicao + 1) > estacionamento.length) {
						System.out.println("Estacionamento está lotado.");
					}
				}

				continue;

			case 2:

				System.out.println("Qual a sua placa? ");
				String placaInformada = sc.nextLine();

				for (int posicao = 0; posicao < estacionamento.length; posicao++) {

					if (estacionamento.length == (posicao + 1)) {

						System.out.println(
								"Sua placa foi informada incorretamente ou seu veículo não está no nosso pátio.");

					}
					if (estacionamento[posicao] == null) {
						continue;
					}
					if (estacionamento[posicao].getVeiculo() == null) {
						continue;
					}
					if (estacionamento[posicao].getVeiculo().getPlaca().equals(placaInformada)) {

						estacionamento[posicao].setHorarioSaida(new Date());

						Double valorAPagar = (estacionamento[posicao].tempoEstacionado() / 3600) * valorHora;

						System.out.println("O valor à pagar é de: " + valorAPagar);
						String historicoVaga = estacionamento[posicao].toString() + " O valor pago foi: " + valorAPagar;

						estacionamento[posicao].setHistoricoDaVaga(historicoVaga);
						estacionamento[posicao].setIsDisponivel(true);
						estacionamento[posicao].setVeiculo(null);

						System.out.println("Obridado por estacionar no FourPark!" + "\n" + "Seu veículo está liberado."
								+ " No horário " + estacionamento[posicao].getHorarioSaida());

						break;
					}

				}

				continue;

			case 3:

				for (int i = 0; i < estacionamento.length; i++) {
					ClasseVaga classeVaga = estacionamento[i];

					if (classeVaga != null) {
						if (!classeVaga.getIsDisponivel()) {

							System.out.println("A vaga " + (classeVaga.getPosicao() + 1) + " está ocupada. ");
						}

					}

				}

				continue;

			case 4:

				for (int i = 0; i < estacionamento.length; i++) {
					ClasseVaga classeVaga = estacionamento[i];

					if (classeVaga == null) {

						System.out.println("A vaga " + (i + 1) + " está disponível.");

					} else if (classeVaga.getIsDisponivel()) {

						System.out.println("A vaga " + (classeVaga.getPosicao() + 1) + " está disponível.");
					}
				}

				continue;

			case 5:

				System.out.println("Qual a vaga que você quer verificar? ");
				Integer posicao = (sc.nextInt() - 1);
				sc.nextLine();

				ClasseVeiculo veiculoBuscado;

				if (estacionamento[posicao] != null) {
					if (estacionamento[posicao].getVeiculo() != null) {
						veiculoBuscado = estacionamento[posicao].getVeiculo();
						System.out.println("O veículo " + veiculoBuscado.getModelo() + " da placa "
								+ veiculoBuscado.getPlaca() + " está no estacionamento. ");

						continue;
					}
				}

				System.out.println("A vaga está vazia");

				continue;
				
			case 6:
				
				for (int i = 0; i < estacionamento.length; i++) {
					ClasseVaga classeVaga = estacionamento[i];

					if (classeVaga != null) {

						System.out.println(estacionamento[i].getHistoricoDaVaga());
					} else {
						
						System.out.println(" A vaga " + (i + 1) + " ainda não foi ocupada para ter histórico.");
					}
					
				}	
				
			

			default:
				break;
			}

		}
	}
}
