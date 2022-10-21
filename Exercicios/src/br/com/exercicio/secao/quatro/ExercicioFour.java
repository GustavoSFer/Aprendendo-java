package br.com.exercicio.secao.quatro;

import java.util.Scanner;

public class ExercicioFour {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero = teclado.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O numero " + numero + " é par!");
		} else {
			System.out.println("O numero " + numero + " é impar!");
		}
		
		teclado.close();

	}

}
