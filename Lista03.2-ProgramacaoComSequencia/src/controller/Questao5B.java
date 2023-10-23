package controller;

import util.Teclado;

public class Questao5B {

	/*
	 * 5) Fazer um algoritmo que pergunte dois números e ao final apresente os
	 * seguintes valores: 
	 * 	a soma dos dois números,
	 *  a subtração do primeiro pelo segundo número, 
	 *  a subtração do segundo pelo primeiro número,
	 *  a multiplicação entre os dois números,
	 *   a divisão do primeiro pelo segundo número,
	 *    e também o resto da divisão do primeiro pelo segundo número.
	 */
	public static void main(String[] args) {

		double num1, num2;
		
		num1 = Teclado.lerDouble("Inira um número: ");
		num2 = Teclado.lerDouble("Insira outro numero:");
			
		System.out.println("A soma: " + (num1 + num2));
		System.out.println("a sub do primeiro pelo segundo número: " + (num1 - num2));
		System.out.println("a subtração do segundo pelo primeiro número: " + (num2 - num1));
		System.out.println("a multiplicação: " + (num1 * num2));
		System.out.println("divisão do primeiro pelo segundo número: " + (num1 / num2));
		System.out.println("resto da divisão: " + (num1 % num2));
	}

}
