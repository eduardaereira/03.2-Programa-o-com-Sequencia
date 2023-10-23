package controller;

import util.Teclado;

public class Questao06 {
	/*
	 * 6) Fazer um algoritmo que pergunte o nome de um vendedor, o seu salário fixo
	 * e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este
	 * vendedor ganha 15% de comissão sobre suas vendas efetuadas, exibir ao final o
	 * seu nome, o salário fixo, a comissão e o salário completo (fixo + comissão
	 * sobre vendas) no final do mês.
	 */
	public static void main(String[] args) {
		String nome;
		double  salFixo, totalVendas, comissao;
		
		nome = Teclado.lerTexto("Insira seu nome:");
		salFixo = Teclado.lerDouble("Informe o seu sálario fixo:");
		totalVendas = Teclado.lerDouble("Informe o total de vendas no mês (em dinheiro):");
		
		comissao = totalVendas * 15 / 100; // ou totalVendas * 0.15
		
		System.out.println("Nome: " + nome);
		System.out.println("Seu salario fixo: R$ " + salFixo);
		System.out.println("Sua Comissão: R$ " + comissao);
		System.out.println("Salario completo: R$ " + (salFixo + comissao));
		
		
	}

}
