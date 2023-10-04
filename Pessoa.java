package Trabalho2;

public class Pessoa implements Comparavel {
	private String nome;
	private String cpf;

	Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public int comparar(Object o) {
		int comparacao = 0;

		// Verifica se o objeto que vai comparar é do tipo Livro.
		if (o instanceof Pessoa) {
			Pessoa pessoa = (Pessoa) o;
			comparacao = this.getNome().compareTo(pessoa.getNome());
		}
		return comparacao;
	}
}
