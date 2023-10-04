package Trabalho2;

public class TestePessoa {
	public static void main(String[] args) {
		Pessoa[] pessoa = new Pessoa[4];
		pessoa[0] = new Pessoa("Morgana", "02395661066");
		pessoa[1] = new Pessoa("Diogo", "45698237145");
		pessoa[2] = new Pessoa("Matheus", "48953261078");
		pessoa[3] = new Pessoa("Vinicius", "25963147802");

		Ordenar p = new Ordenar();
		p.ordenar(pessoa);

		for (int cont = 0; cont < pessoa.length; cont++) {
			System.out.println("Nome: " + pessoa[cont].getNome());
			System.out.println("CPF: " + pessoa[cont].getCpf());
			System.out.println("\n--------\n");
		}
	}

}
