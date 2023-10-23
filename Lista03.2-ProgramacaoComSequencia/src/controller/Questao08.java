package controller;

import util.Teclado;

public class Questao08 {
	/*
	 * 8) Fazer um algoritmo que receba o preço de custo de um produto e mostre como
	 * resposta o valor de venda. Sabese que o preço de custo receberá um acréscimo
	 * de acordo com um percentual informado pelo usuário
	 */

	public static void main(String[] args) {
		
		double precoCusto, acrescimo, acrescimoReal, valorVenda;
		
		precoCusto = Teclado.lerDouble("Informe o preço de custo");
		acrescimo = Teclado.lerDouble("Informe o percentual de acrescimo");
		
		
		acrescimoReal = precoCusto * acrescimo / 100;
		valorVenda = acrescimoReal + precoCusto;
		
		System.out.println("Valor de venda: R$" + valorVenda);
		
	}

}
