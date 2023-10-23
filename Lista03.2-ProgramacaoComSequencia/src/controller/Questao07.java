package controller;

import util.Teclado;

public class Questao07 {
	/*
	 * 7) A Loja Mamão com Açúcar está vendendo seus produtos em até 10 prestações
	 * sem juros. Faça um algoritmo que pergunte um valor de uma compra, o número
	 *  de prestações escolhidas e apresente como resultado o valor das prestações
	 */
	public static void main(String[] args) {
		
		
		double valorProduto, totalPrestacoes;
		
		valorProduto = Teclado.lerDouble("Informe o valor do produto");
		totalPrestacoes = Teclado.lerDouble("quantas pretações?(maximo 10)");
		
		System.out.println("O valor de cada prestação será de R$" + (valorProduto / totalPrestacoes));
		
		
		
		
	}

}
