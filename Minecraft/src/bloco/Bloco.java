/**
 * POO - Estudo Abtracao Heranca e Polimorfismo
 * @author djeniffer.avidal
 */
package bloco;

public class Bloco {

	public int resistencia;
	public String textura;

	public Bloco() throws InterruptedException {
		System.out.println("Aguarde...");
		Thread.sleep(200);
		System.out.println(
				"  ___                       ___           ___           ___           ___           ___           ___           ___      ");
		Thread.sleep(200);
		System.out.println(
				" /\\__\\          ___        /\\__\\         /\\  \\         /\\  \\         /\\  \\         /\\  \\         /\\  \\         /\\  \\     ");
		Thread.sleep(200);
		System.out.println(
				"/::|  |        /\\  \\      /::|  |       /::\\  \\       /::\\  \\       /::\\  \\       /::\\  \\       /::\\  \\        \\:\\  \\  ");
		Thread.sleep(200);
		System.out.println(
				"/:|:|  |        \\:\\  \\    /:|:|  |      /:/\\:\\  \\     /:/\\:\\  \\     /:/\\:\\  \\     /:/\\:\\  \\     /:/\\:\\  \\        \\:\\  \\ ");
		Thread.sleep(200);
		System.out.println(
				"/:/|:|__|__      /::\\__\\  /:/|:|  |__   /::\\~\\:\\  \\   /:/  \\:\\  \\   /::\\~\\:\\  \\   /::\\~\\:\\  \\   /::\\~\\:\\  \\       /::\\  \\ ");
		Thread.sleep(200);
		System.out.println(
				"/:/ |::::\\__\\  __/:/\\/__/ /:/ |:| /\\__\\ /:/\\:\\ \\:\\__\\ /:/__/ \\:\\__\\ /:/\\:\\ \\:\\__\\ /:/\\:\\ \\:\\__\\ /:/\\:\\ \\:\\__\\     /:/\\:\\__\\ ");
		Thread.sleep(200);
		System.out.println(
				"\\/__/~~/:/  / /\\/:/  /    \\/__|:|/:/  / \\:\\~\\:\\ \\/__/ \\:\\  \\  \\/__/ \\/_|::\\/:/  / \\/__\\:\\/:/  / \\/__\\:\\ \\/__/    /:/  \\/__/ ");
		Thread.sleep(200);
		System.out.println(
				"      /:/  /  \\::/__/         |:/:/  /   \\:\\ \\:\\__\\    \\:\\  \\          |:|::/  /       \\::/  /       \\:\\__\\     /:/  /     ");
		Thread.sleep(200);
		System.out.println(
				"     /:/  /    \\:\\__\\         |::/  /     \\:\\ \\/__/     \\:\\  \\         |:|\\/__/        /:/  /         \\/__/     \\/__/  ");
		Thread.sleep(200);
		System.out.println(
				"    /:/  /      \\/__/         /:/  /       \\:\\__\\        \\:\\__\\        |:|  |         /:/  /                               ");
		Thread.sleep(200);
		System.out.println(
				"    \\/__/                     \\/__/         \\/__/         \\/__/         \\|__|         \\/__/                           ");

	}

	/**
	 * construir
	 */
	public void construir() {
		System.out.println("Constuido");
	}

	/**
	 * minerar
	 */
	public void minerar() {
		System.out.println("Minerado");
	}

	/**
	 * craftar
	 */
	public void craftar() {
		System.out.println("Fabricado");
	}

}
