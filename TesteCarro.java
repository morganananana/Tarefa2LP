package Trabalho2;

public class TesteCarro {
	public static void main(String[] args) {
		Carro[] carro = new Carro[4];
		carro[0] = new Carro("Jeep", "Renegade", 1300);
		carro[1] = new Carro("BMW", "Série 3", 2000);
		carro[2] = new Carro("Honda", "Civic", 1500);
		carro[3] = new Carro("Mercedes-Benz", "Classe C", 1600);

		Ordenar c = new Ordenar();
		c.ordenar(carro);

		for (int cont = 0; cont < carro.length; cont++) {
			System.out.println("Marca: " + carro[cont].getMarca());
			System.out.println("Modelo: " + carro[cont].getModelo());
			System.out.println("Cilindrada: " + carro[cont].getCilindrada());
			System.out.println("\n--------\n");
		}
	}
}
