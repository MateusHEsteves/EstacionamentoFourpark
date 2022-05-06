package treinoAcademyPoo;

public class ClasseDivisao {
	
	public Double numero1;
	public Double numero2;
	
	public ClasseDivisao (Double numero1, Double numero2) {
		
		this.numero1 = numero1;
		this.numero2 = numero2;		
		
	}
	
	public Double divisao() {
		
		Double resultado = this.numero1 / this.numero2;
		return resultado;
	}

}
