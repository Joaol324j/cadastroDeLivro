package cadastroDeLivros;

public class Livro {
	
	public String nome;
	public String descricao;
	public double valor;
	public String isbn;
	Autor autor;
	
	public Livro(String nome, String descricao, double valor, String isbn) {
		
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.isbn = isbn;
		
	}
	
	void mostrarDetalhes() {
		
		System.out.println("Mostrando Detalhes do Livro ");
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("ISBN: " + isbn);
		System.out.println("--");
		
	}

}
