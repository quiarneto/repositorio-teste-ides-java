package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livros Livros = new Livros();
		
		System.out.println(gato);
		System.out.println(Livros);
		
		
		System.out.println("Hello Wolrd!! ");

	}

}

class Livros {
	private String nome;
	private String npag;
}