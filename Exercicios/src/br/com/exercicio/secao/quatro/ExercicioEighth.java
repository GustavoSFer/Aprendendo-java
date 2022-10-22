package br.com.exercicio.secao.quatro;

import java.util.List;
import java.util.Scanner;

public class ExercicioEighth {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] nota = new int[3];
		int soma = 0;
		
		for (int i = 0; i < 3; i ++) {
			System.out.println("Informa o valor da nota " + (i + 1) + "º: ");
			if (i == 2) {
				System.out.println((i + 1) + "º prova valendo peso 2 ");
				int valor = teclado.nextInt();
				nota[i] = valor * valor;
			} else {
				nota[i] = teclado.nextInt();				
			}
		}
		
		for (int n : nota) {
			soma += n;
		}
		
		float media = soma / 3;
		
		if (media >= 6 ) {
			System.out.println("Aprovado, sua pontuação foi de " + media);
		} else {
			System.out.println("Reprovado, sua pontuação foi de " + media);
		}
		teclado.close();

	}

}
