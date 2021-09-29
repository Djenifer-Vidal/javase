package bloco;

public class Objetos {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Bloco Grama");
		Bloco grama = new Bloco();

		grama.textura = "Mato";
		grama.resistencia = 6;
		System.out.println("Textura: " + grama.textura);
		System.out.println("Resistencia: " + grama.resistencia);
		grama.minerar();
		grama.construir();

		System.out.println("_________________________________________");
		System.out.println("Bloco Madeira");

		Bloco madeira = new Bloco();

		madeira.textura = "Madeira";
		madeira.resistencia = 4;
		System.out.println("Textura: " + madeira.textura);
		System.out.println("Resistencia: " + madeira.resistencia);
		madeira.minerar();
		madeira.craftar();
	}

}
