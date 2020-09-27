package br.com.caelum.livraria.webservice;

import java.rmi.RemoteException;

public class TesteRequestSoapComJava {

	public static void main(String[] args) throws RemoteException {
		
		LivrariaWS cliente = new LivrariaWSProxy();
		Livro[] livros = cliente.getLivrosPeloNome("Arquitetura");
		
		for (Livro livro : livros) {
			System.out.println("Título do livro: " + livro.getTitulo());
			System.out.println("Nome do autor: " + livro.getAutor().getNome());
		}
	}

}
