package treinoAcademyPoo;

public class ClasseMultiplicação {
	
	public Double numero1;
	public Double numero2;
	
	public ClasseMultiplicação (Double numero1, Double numero2) {
		
		this.numero1 = numero1;
		this.numero2 = numero2;		
		
	}
	
	public Double multiplicacão() {
		
		Double resultado = this.numero1 * this.numero2;
		return resultado;
	}

}
