package fourPark;

public class ClasseVeiculo {

	private String placa;
	private String modelo;
	private String tipo;
	private String telefone;
	
	public ClasseVeiculo(String placa, String modelo, String telefone, String tipo) {

		this.placa = placa;
		this.modelo = modelo;
		this.telefone = telefone;
		this.tipo = tipo;

	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
