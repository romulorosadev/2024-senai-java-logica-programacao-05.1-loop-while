package controller;

import util.Teclado;

public class Questao01 {
	public static void main(String[] args) {
		
		int i = 1;
		System.out.println("CONTAGEM PROGRESSIVA");
		System.out.println("--------------------");
		System.out.println("Início da Contagem: " + i);
		int inLimite = Teclado.lerInt("\nInforme um número limite: ");
		System.out.println("\nCONTAGEM");
		while (i <= inLimite) {
			System.out.println(i);
			i++;
		}
	}
}
