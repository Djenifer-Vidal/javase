package enxada;

public class Itens {

	public static void main(String[] args) throws InterruptedException {

		Enxada enxadaMaderia = new Enxada();
		enxadaMaderia.textura = "Madeira";
		enxadaMaderia.resistencia = 10;
		enxadaMaderia.conquista = false;
		System.out.println("textura : " + enxadaMaderia.textura);
		System.out.println("Resistencia : " + enxadaMaderia.resistencia);
		enxadaMaderia.arar();
		if (enxadaMaderia.conquista) {
			System.out.println("Você desbloqueou uma Conquista...!");
		} else {
			System.out.println("Não desbloqueou conquista...!");
		}

	}

}
