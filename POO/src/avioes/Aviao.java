package avioes;

import carros.Carro;

public class Aviao extends Carro {
	public double envergadura;
	public boolean tremPouso;
	public double comprimento;
	public double altura;
	public double capacidade;
	/**
	 * Aterrizar
	 */
	public void aterrizar() {
		System.out.println("Avião posou________________________________");
	}
	/**
	 * Acelerar
	 */
	public void acelerar() {
		System.out.println("Avião decolou_____________");
	}
}
