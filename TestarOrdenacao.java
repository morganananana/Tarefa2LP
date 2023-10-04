package Trabalho2;

public class TestarOrdenacao {
	public static void main(String[] args) {
		/* Cria um vetor de livros. */
		Livro[] livros = new Livro[4];
		livros[0] = new Livro("Sakurai", "Almoçando com Java");
		livros[1] = new Livro("Cristiano", "Classes Java em fila indiana");
		livros[2] = new Livro("Sakurai", "Java em todo lugar");
		livros[3] = new Livro("Cristiano", "Viajando no Java");

		/* Ordena os livros */
		Ordenar o = new Ordenar();
		o.ordenar(livros);

		/* Imprime os livros ordenados. */
		for (int cont = 0; cont < livros.length; cont++) {
			System.out.println("Autor: " + livros[cont].getAutor());
			System.out.println("Livro: " + livros[cont].getTitulo());
			System.out.println("\n--------\n");
		}
	}
}