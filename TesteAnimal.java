package Trabalho2;

public class TesteAnimal {
	public static void main(String[] args) {
		Animal[] animal = new Animal[4];
		animal[0] = new Animal("gato", "gato pelado");
		animal[1] = new Animal("cachorro", "husky");
		animal[2] = new Animal("raposa", "raposa do artico");
		animal[3] = new Animal("dinossauro", "Tiranossauro Rex");

		Ordenar a = new Ordenar();
		a.ordenar(animal);

		for (int cont = 0; cont < animal.length; cont++) {
			System.out.println("Especie: " + animal[cont].getEspecie());
			System.out.println("Raça: " + animal[cont].getRaca());
			System.out.println("\n--------\n");
		}
	}
}
