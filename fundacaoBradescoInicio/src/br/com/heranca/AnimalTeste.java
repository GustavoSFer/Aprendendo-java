package br.com.heranca;

public class AnimalTeste {

	public static void main(String[] args) {
		Cachorro c1 = new Cachorro();
		Galinha g1 = new Galinha();
		Coruja co1 = new Coruja();
		
		c1.nome = "Slinky";
		c1.comer();
		c1.movimentar();
		
		g1.nome = "Garlicha";
		g1.botar();
		
		co1.nome = "Corujão da quebrada";
		co1.voar();

	}

}
