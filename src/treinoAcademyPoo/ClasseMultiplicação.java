package treinoAcademyPoo;

public class ClasseMultiplica��o {
	
	public Double numero1;
	public Double numero2;
	
	public ClasseMultiplica��o (Double numero1, Double numero2) {
		
		this.numero1 = numero1;
		this.numero2 = numero2;		
		
	}
	
	public Double multiplicac�o() {
		
		Double resultado = this.numero1 * this.numero2;
		return resultado;
	}

}
