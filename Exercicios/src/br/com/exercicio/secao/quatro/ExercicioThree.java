package br.com.exercicio.secao.quatro;

import java.util.Scanner;

public class ExercicioThree {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero = teclado.nextInt();
		
		if (numero > 0) {
			System.out.println(Math.pow(numero, 0.5));
		} else {
			System.out.println(numero * numero);
		}
		
		teclado.close();

	}

}
