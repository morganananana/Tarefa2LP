package Trabalho2;

public class Carro implements Comparavel {
	private String marca;
	private String modelo;
	private int cilindrada;

	Carro(String marca, String modelo, int cilindrada) {
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public int comparar(Object o) {
		int comparacao = 0;

		if (o instanceof Carro) {
			Carro carro = (Carro) o;
			comparacao = Integer.compare(carro.getCilindrada(), this.cilindrada);
		}
		return comparacao;
	}
}
