package treinoAcademyPoo;

public class ClasseSubtracao {

	public Double numero1;
	public Double numero2;
	
	public ClasseSubtracao(Double numero1, Double numero2) {
		
		this.numero1 = numero1;
		this.numero2 = numero2;		
		
	}
	
	public Double subtracao() {
		
		Double resultado = this.numero1 - this.numero2;
		return resultado;
				
	}
	
	
	
}
