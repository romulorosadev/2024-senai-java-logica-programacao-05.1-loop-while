package controller;

public class Questao04 {
	public static void main(String[] args) {
		int i = 1;
		int inLimite = 100;
		int outSoma = 0;
		
		while(i <= inLimite) {
			outSoma += i;
			i++;
		}
		
		System.out.println("Somatório: " + outSoma);
	}
}