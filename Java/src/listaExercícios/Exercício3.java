package listaExercícios;

import java.util.Scanner;

/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
*10-14 infantil
*15-17 juvenil
*18-25 adulto*/

public class Exercício3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade = 0;

		System.out.println("Digite sua Idade: ");
		idade = ler.nextInt();

		if (idade <= 9) {
			System.out.println("ERRO 404");
		} else if (idade >= 10 && idade <= 14) {
			System.out.println("\nInfantil!");
		} else if (idade >= 15 && idade <= 17) {
			System.out.println("\nJuvenil!");
		} else {
			System.out.println("\nAdulto!");
		}
	}

}
