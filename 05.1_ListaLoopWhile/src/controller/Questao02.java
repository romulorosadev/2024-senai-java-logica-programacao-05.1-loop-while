package controller;

import util.Teclado;

public class Questao02 {
	public static void main(String[] args) {
		int i = 100;
		
		System.out.println("CONTAGEM REGRESSIVA");
		System.out.println("--------------------");
		System.out.println("Início da Contagem: " + i);
		int inLimite = Teclado.lerInt("\nInforme um número limite: ");
		System.out.println("\nCONTAGEM");
		while (i >= inLimite) {
			System.out.println(i);
			i--;
		}
		
	}
}
