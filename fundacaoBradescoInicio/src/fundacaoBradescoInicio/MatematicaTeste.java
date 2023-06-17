package fundacaoBradescoInicio;

public class MatematicaTeste {

	public static void main(String[] args) {
		Matematica mat = new Matematica();
		
		int maior = mat.maior(21, 5);
		System.out.println(maior);
		
		double soma = mat.soma(12.2,111);
		System.out.println(soma);
	}

}
