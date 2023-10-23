package controller;

import util.Teclado;

public class Questao03 {
	/*
	 * 3) Desenvolver um programa que pergunte ao usuário o seu peso (em quilos) e
	 * sua altura (em metros). Ao final o programa deverá exibir na tela para o
	 * usuário o valor do peso informado em gramas e a altura em centímetros.
	 */

	public static void main(String[] args) {
		
		double pesoKg, alturaM, pesoG, alturaCm;
		
		pesoKg = Teclado.lerDouble( "informe seu peso em kg" );
		alturaM = Teclado.lerDouble(" Informe sua altura em metros");
		
		pesoG = pesoKg * 1000 ;
		alturaCm = alturaM * 100;
		
		System.out.println("Seu peso em gramas: " + pesoG );
		System.out.println("Sua altura em centimetros: " + alturaCm);
		
	}

}
