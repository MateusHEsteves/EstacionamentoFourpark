package fourPark;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClasseVaga {

	private Date horarioEntrada;
	private Date horarioSaida;
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
		
		this.horarioEntrada = new Date();
		this.posicao = posicao;
		this.isDisponivel = isDisponivel;
		this.historicoDaVaga = "";

	}

	public Date getHorarioEntrada() {
		return horarioEntrada;
	}

	public void setHorarioEntrada(Date horarioEntrada) {
		this.horarioEntrada = horarioEntrada;
	}

	public Date getHorarioSaida() {
		return horarioSaida;
	}

	public void setHorarioSaida(Date horarioSaida) {
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
		
	   long duracao = ((this.horarioSaida.getTime() - this.horarioEntrada.getTime()) / 1000 );
		return duracao;
		
	}

	@Override
	public String toString() {
		return "O veiculo = " + veiculo + " foi estacionado na hora = " + horarioEntrada + ", saiu na hora = " + horarioSaida + ", estava na vaga = "
				+ (posicao + 1) + ".";
	}
	

}
