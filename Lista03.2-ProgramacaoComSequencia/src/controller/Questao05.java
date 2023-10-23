package controller;

import util.Teclado;

public class Questao05 {

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

		double num1, num2, soma, sub1, sub2, multi, div, resto;
		
		num1 = Teclado.lerDouble("Inira um número: ");
		num2 = Teclado.lerDouble("Insira outro numero:");
		
		soma = num1 + num2;
		sub1 = num1 - num2;
		sub2 = num2 - num1;
		multi = num1 * num2;
		div = num1 / num2;
		resto = num1 % num2;
		
		
		System.out.println("A soma: " + soma);
		System.out.println("a subtração do primeiro pelo segundo número: " + sub1);
		System.out.println("a subtração do segundo pelo primeiro número: " + sub2);
		System.out.println("a multiplicação: " + multi);
		System.out.println("divisão do primeiro pelo segundo número: " + div);
		System.out.println("resto da divisão: " + resto);
	}

}
