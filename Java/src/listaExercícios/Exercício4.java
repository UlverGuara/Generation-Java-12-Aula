package listaExercícios;

import java.util.Scanner;

/*Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar.
*Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.*/

public class Exercício4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float numero;

		System.out.println("Digite um número: ");
		numero = ler.nextFloat();

		if (numero % 2 == 0) {
			System.out.println("O número " + numero + " é Par e sua raiz quadrada é: = " + Math.sqrt(numero) + ".");
		} else {
			System.out.println("O número " + numero + " é Ímpar e sua raiz quadrada é: = " + Math.pow(numero, 2) + ".");
		}
	}

}
