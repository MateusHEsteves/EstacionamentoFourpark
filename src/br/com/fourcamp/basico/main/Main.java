
package br.com.fourcamp.basico.main;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	 public static void main(String[] args) {
		 
		 Double valorA = 0.0;
		 Double valorB = 0.0;
		 String operador;
		 Scanner sc = new Scanner(System.in);
		 
		 		 
		 System.out.print("Digie o valor 1: ");
		 valorA = sc.nextDouble();
		
		 System.out.print("Digie o valor 2: ");
		 valorB = sc.nextDouble();
		 
		 System.out.print("Selecione o operador: ");
		 operador = sc.next();
		 
		 calcularValor(valorA, valorB, operador);
		 
	 }
	 
	 
	 private static void calcularValor(Double valorA, Double valorB, String operador) {
		 
		 Double resultado = 0.0;
		 
		if(operador.equals("+")) {
			 resultado = soma (valorA,  valorB);
			 			
		}
		 else if (operador.equals("-")) {
			 resultado = subtracao (valorA,  valorB);
			 			
		}
		 else if (operador.equals("/")) {
			 resultado = divisao (valorA,  valorB);
			 			
		}
		 else if (operador.equals("*")) {
			 resultado = multiplicacao (valorA,  valorB);
			 			
		}
		 else if (operador.equals("%")) {
			 resultado = porcentagem (valorA,  valorB);
			 			
		}
		
		 else if (operador.equals("^")) {
			 resultado = potenciacao (valorA,  valorB);
			 			
		}

		 else if (operador.equals("=/")) {
			 resultado = raizQuadrada (valorA,  valorB);
			 			
		}
		 		 
				 
		 System.out.println("O resultado da soma é: " + resultado);
		
	}


	public static Double soma(Double valorA, Double valorB) {
		 
		 Double resultado = 0.0;
		 
		 resultado = valorA + valorB;
		 return resultado;
		 
	 }
		 	 	 
	 public static Double multiplicacao(Double valorA, Double valorB) {
		 
		 Double resultado = 0.0;
		 
		 resultado = valorA * valorB;
		 return resultado;
		 
	 }
	 
	 public static Double divisao(Double valorA, Double valorB) {
		 
		 Double resultado = 0.0;
		 
		 resultado = valorA / valorB;
		 return resultado;
		 
	 }
	 
	 public static Double subtracao(Double valorA, Double valorB) {
		 
		 Double resultado = 0.0;
		 
		 resultado = valorA - valorB;
		 return resultado;
		 
	 }
	
	 public static Double porcentagem(Double valorA, Double valorB) {
		 
		 Double resultado = 0.0;
		 
		 resultado = valorA * valorB / 100;
		 return resultado;
		 
	 }
	
	 public static Double potenciacao(Double valorA, Double valorB) {
		 
		Double resultado = 1.0;
		 
		for (int i = 0; i < valorB; i++) {
			resultado *= valorA;
		}
			return resultado;
	
	 }
	 
	 public static Double raizQuadrada(Double valorA, Double valorB) {
		 
		 Double resultado = 0.0;
		 
		 resultado = valorA * valorB / 100;
		 return resultado;
		 
	 }
	 
	 
}


	