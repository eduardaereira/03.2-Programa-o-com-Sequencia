package controller;

import util.Teclado;

public class Questao01 {
	/*
	 * 1) Desenvolver um programa que pergunte o valor da conta a ser paga no
	 * restaurante e exiba como resposta o valor com o acréscimo dos 10% da gorjeta
	 * do garçom.
	 */

	public static void main(String[] args) {
		
		double valor, valorFinal;
		
		valor = Teclado.lerDouble("Qual o valor a ser pago?");
		
		valorFinal = valor + ( valor * 10 / 100 );
		
		System.out.println(" O valor : " + valor + " com o acrescimo de 10% da gorjeta fica R$" + valorFinal);
		
		
	}

}
