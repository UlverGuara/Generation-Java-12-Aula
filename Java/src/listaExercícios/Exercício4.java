package listaExerc�cios;

import java.util.Scanner;

/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar.
*Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.*/

public class Exerc�cio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float numero;

		System.out.println("Digite um n�mero: ");
		numero = ler.nextFloat();

		if (numero % 2 == 0) {
			System.out.println("O n�mero " + numero + " � Par e sua raiz quadrada �: = " + Math.sqrt(numero) + ".");
		} else {
			System.out.println("O n�mero " + numero + " � �mpar e sua raiz quadrada �: = " + Math.pow(numero, 2) + ".");
		}
	}

}
