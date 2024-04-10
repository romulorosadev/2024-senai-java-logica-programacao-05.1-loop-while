package controller;

import util.Teclado;

public class Questao05 {
	public static void main(String[] args) {
		int i = 1;
		int inLimite = 10;
		
		System.out.println("TABUADA");
		System.out.println("--------------------");
		int inNumero = Teclado.lerInt("\nInforme um número:");
		System.out.println("\n");
		while (i <= inLimite) {
			System.out.println(inNumero + " . " + i + " = " + inNumero * i);
			i++;
		}
		
	}
}