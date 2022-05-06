package fourPark;

import java.util.Date;

public class ClasseVaga {

	private String horarioEntrada;
	private String horarioSaida;
	private Integer posicao;
	private Boolean isDisponivel;
	private ClasseVeiculo veiculo;

	public ClasseVeiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(ClasseVeiculo veiculo) {
		this.veiculo = veiculo;
	}

	public ClasseVaga(Integer posicao, Boolean isDisponivel) {
		
		this.horarioEntrada = new Date().toString();
		this.posicao = posicao;
		this.isDisponivel = isDisponivel;
		

	}

	public String getHorarioEntrada() {
		return horarioEntrada;
	}

	public void setHorarioEntrada(String horarioEntrada) {
		this.horarioEntrada = horarioEntrada;
	}

	public String getHorarioSaida() {
		return horarioSaida;
	}

	public void setHorarioSaida(String horarioSaida) {
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

}
