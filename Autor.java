package cadastroDeLivros;

public class Autor {
	
	public String nome;
	public String email;
	public String cpf;
	
	public Autor(String nome, String email, String cpf) {
		
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		
	}
	
	void mostrandoDetalhes() {
		
		System.out.println("Mostrando Detalhes do Autor ");
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("CPF: " + cpf);
		System.out.println("--");
		
	}
	
}
