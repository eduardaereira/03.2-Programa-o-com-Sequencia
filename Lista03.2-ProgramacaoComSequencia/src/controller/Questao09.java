package controller;

import util.Teclado;

public class Questao09 {
	/*
	 * 9) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e
	 * dias e mostre-a expressa apenas em dias. Obs: Considere os anos com 365 dias
	 * e os meses com 30 dias
	 */
	public static void main(String[] args) {
		
		int anos, meses, dias, totalDias;

		 anos = Teclado.lerInt("Quantos anos voce tem?");
		 meses = Teclado.lerInt("Quattos meses se passaram ddesde o seu ultimo aniversario");
		 dias = Teclado.lerInt("quantoss dias se passaram desde o ultimo mes apontado na resposta anterior?");
		
		 totalDias = (anos * 365) + (meses * 30) + dias;
		System.out.println("Você ja viveu " + totalDias + " dias.");
		
	}

}
