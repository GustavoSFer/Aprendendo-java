package br.com.exercicio.secao.quatro;

import java.util.Scanner;

public class ExercicioSix {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe seu sexo: (Homen / Mulher)");
		String sexo = teclado.nextLine();
		System.out.println("Informe sua altura: ");
		float h = Float.parseFloat(teclado.nextLine());
		
		if ( sexo == "Homen") {
			System.out.println((72.7 * h) - 58);
		} else if (sexo == "Mulher") {
			System.out.println((62.1 * h) - 44.7);
		}
	}
}
