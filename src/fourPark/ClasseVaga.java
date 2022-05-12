package fourPark;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;

public class ClasseVaga {

	private LocalDateTime horarioEntrada;
	private LocalDateTime horarioSaida;
	private Integer posicao;
	private Boolean isDisponivel;
	private ClasseVeiculo veiculo;
	private String historicoDaVaga;
	
	public String getHistoricoDaVaga() {
		return historicoDaVaga;
	}

	public void setHistoricoDaVaga(String historicoDaVaga) {
		this.historicoDaVaga += historicoDaVaga + "\n";
		
	}

	public ClasseVeiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(ClasseVeiculo veiculo) {
		this.veiculo = veiculo;
	}

	public ClasseVaga(Integer posicao, Boolean isDisponivel) {
		
		this.horarioEntrada = LocalDateTime.now();
		this.posicao = posicao;
		this.isDisponivel = isDisponivel;
		this.historicoDaVaga = "";

	}

	public LocalDateTime getHorarioEntrada() {
		return horarioEntrada;
	}

	public void setHorarioEntrada(LocalDateTime horarioEntrada) {
		this.horarioEntrada = horarioEntrada;
	}

	public LocalDateTime getHorarioSaida() {
		return horarioSaida;
	}

	public void setHorarioSaida(LocalDateTime horarioSaida) {
		this.horarioSaida = horarioSaida;
	}

	public Integer getPosicao() {
		return posicao;
	}

	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}

	public Boolean getIsDisponivel() {
		return isDisponivel;
	}

	public void setIsDisponivel(Boolean isDisponivel) {
		this.isDisponivel = isDisponivel;
	}
	
	public long tempoEstacionado () {
		
	   Duration duracao = Duration.between(horarioEntrada, horarioSaida);
		return duracao.toMinutes();
		
	}

	@Override
	public String toString() {
		return "O veiculo = " + veiculo + " foi estacionado na hora = " + horarioEntrada + ", saiu na hora = " + horarioSaida + ", estava na vaga = "
				+ (posicao + 1) + ".";
	}
	

}
