package cadastroDeLivros;

public class Main {

	public static void main(String[] args) {
		
		Autor autor = new Autor("Rodrigo Turini", "rodrigo@caelum.com.br", "123.456.789.10");
		Livro livro = new Livro("Java 8 Prático", "Novos Recursos da Linguagem", 59.90, "978-85-66250-46-6");
		
		livro.autor = autor;
		autor.mostrandoDetalhes();
		livro.mostrarDetalhes();
		

	}

}
